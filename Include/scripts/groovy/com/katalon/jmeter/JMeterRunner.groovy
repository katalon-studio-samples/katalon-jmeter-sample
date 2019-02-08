package com.katalon.jmeter

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.jmeter.config.Arguments
import org.apache.jmeter.config.gui.ArgumentsPanel
import org.apache.jmeter.control.LoopController
import org.apache.jmeter.engine.StandardJMeterEngine
import org.apache.jmeter.protocol.java.sampler.JavaSampler
import org.apache.jmeter.reporters.ResultCollector
import org.apache.jmeter.report.dashboard.ReportGenerator
import org.apache.jmeter.reporters.Summariser
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jmeter.testelement.TestPlan
import org.apache.jorphan.collections.HashTree
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

import internal.GlobalVariable

public class JMeterRunner {
	
	private static NUM_THREADS = 2;
	private static RAMP_UP = 1;
	private static DURATION = 10000;
	private static JTL_FILE = "jmeter-result.csv";

	public void run(String reportPath) throws IOException {
		//JMeter Engine
		StandardJMeterEngine jmeter = new StandardJMeterEngine();

		//JMeter initialization (properties, log levels, locale, etc)
		JMeterUtils.loadJMeterProperties("./Include/jmeter-properties/bin/jmeter.properties");
		JMeterUtils.setJMeterHome("./Include/jmeter-properties");
		JMeterUtils.initLocale();
		JMeterUtils.setProperty("output_dir", "./jmeter-report");

		// JMeter Test Plan
		HashTree testPlanTree = new HashTree();

		// Java Sampler
		JavaSampler javaSampler = new JavaSampler();
		javaSampler.setClassname(KatalonSamplerClient.class.getName());
		javaSampler.setName("Java sampler");

		Arguments args = new Arguments();
		args.addArgument("REPORT_DIR", reportPath);
		javaSampler.setArguments(args);



		// Loop Controller
		LoopController loopController = new LoopController();
		loopController.setLoops(1);
		loopController.setFirst(true);
		loopController.initialize();

		// Thread Group

		org.apache.jmeter.threads.ThreadGroup threadGroup = new org.apache.jmeter.threads.ThreadGroup();
		threadGroup.setNumThreads(NUM_THREADS);
		threadGroup.setRampUp(RAMP_UP);
		threadGroup.setDuration(DURATION);
		threadGroup.setScheduler(true);
		threadGroup.setName("Main Thread Group");
		threadGroup.setSamplerController(loopController);

		// Test Plan
		TestPlan testPlan = new TestPlan("Create JMeter Script From Java Code");
		testPlan.setUserDefinedVariables((Arguments) new ArgumentsPanel().createTestElement());

		// Construct Test Plan from previously initialized elements
		testPlanTree.add(testPlan);
		HashTree threadGroupHashTree = testPlanTree.add(testPlan, threadGroup);
		threadGroupHashTree.add(javaSampler);


		//add Summarizer output to get test progress in stdout like:
		// summary =      2 in   1.3s =    1.5/s Avg:   631 Min:   290 Max:   973 Err:     0 (0.00%)
		Summariser summer = null;
		String summariserName = JMeterUtils.getPropDefault("summariser.name", "summary");
		if (summariserName.length() > 0) {
			summer = new Summariser(summariserName);
		}




		// Store execution results into a .jtl file
		ResultCollector logger = new ResultCollector(summer);
		logger.setFilename(JTL_FILE);
		testPlanTree.add(testPlanTree.getArray()[0], logger);

		// Run Test Plan
		jmeter.configure(testPlanTree);
		jmeter.run();

		try {
			ReportGenerator reportGen = new ReportGenerator(JTL_FILE, null);
			reportGen.generate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Test completed. See test.jtl file for results");
		System.out.println("Open test.jmx file in JMeter GUI to validate the code");
		System.exit(0);
	}
}
