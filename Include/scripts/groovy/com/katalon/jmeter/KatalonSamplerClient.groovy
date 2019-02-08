package com.katalon.jmeter

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.nio.file.Path

import org.apache.jmeter.config.Arguments
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext
import org.apache.jmeter.samplers.SampleResult

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import de.sstoehr.harreader.HarReader
import de.sstoehr.harreader.model.Har
import de.sstoehr.harreader.model.HarContent
import de.sstoehr.harreader.model.HarEntry
import de.sstoehr.harreader.model.HarRequest
import de.sstoehr.harreader.model.HarResponse
import de.sstoehr.harreader.model.HarTiming
import internal.GlobalVariable

public class KatalonSamplerClient implements JavaSamplerClient {

	protected void executeKatalon(JavaSamplerContext context) {
		WebUI.callTestCase(findTestCase('Test Cases/REST examples/Simple examples/api-2-search/Search issues/Search issues by jql'),
				[('issue_key') : ''], FailureHandling.STOP_ON_FAILURE)
	}

	@Override
	public Arguments getDefaultParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SampleResult runTest(JavaSamplerContext context) {
		//Run katalon test cases
		executeKatalon(context);

		//parse Har file and return result
		String reportDir = context.getParameter("REPORT_DIR");
		final SampleResult[] result = [null];
		try {
			List<Path> paths = Files.find(Paths.get(reportDir), Integer.MAX_VALUE, { path, attributes -> path.toString().endsWith(".har")}).collect(Collectors.toList())
			for (Path path : paths) {
				List<SampleResult> subs = parseHar(path);

				if (!subs.isEmpty()) {
					if (result[0] == null) {
						result[0] = subs.get(0);
						subs.remove(0);
					}

					subs.forEach({SampleResult sub ->
						String name = sub.getSampleLabel();
						result[0].addRawSubResult(sub);
						sub.setSampleLabel(name);
					});
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result[0];
	}

	@Override
	public void setupTest(JavaSamplerContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void teardownTest(JavaSamplerContext arg0) {
		// TODO Auto-generated method stub

	}

	private List<SampleResult> parseHar(Path filePath) {
		List<SampleResult> results = new ArrayList<>();
		try {
			HarReader harReader = new HarReader();
			Har har = harReader.readFromFile(filePath.toFile());
			List<HarEntry> entries = har.getLog().getEntries();

			for (HarEntry entry : entries) {
				HarRequest request = entry.getRequest();
				HarResponse response = entry.getResponse();
				HarContent content = response.getContent();
				HarTiming timing = entry.getTimings();

				SampleResult rs = new SampleResult();
				Integer latency = timing.getWait();
				rs.setLatency(latency);
				rs.setStampAndTime(entry.getStartedDateTime().getTime(), entry.getTime());
				rs.setSampleLabel(request.getUrl());
				rs.setConnectTime(timing.getSend());
				rs.setSuccessful(true);
				rs.setBodySize(response.getBodySize());
				rs.setBytes(content.getSize());
				rs.setContentType(content.getMimeType());
				rs.setDataEncoding(content.getEncoding());
				rs.setIdleTime(timing.getBlocked());
				rs.setResponseCode(String.valueOf(response.getStatus()));
				rs.setResponseMessage(response.getStatusText());
				rs.setURL(new URL(request.getUrl()));
				rs.setSentBytes(request.getBodySize());
				rs.setHeadersSize(request.getHeadersSize().intValue());
				results.add(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return results;
	}
}
