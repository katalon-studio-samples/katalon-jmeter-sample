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
import org.apache.jmeter.reporters.Summariser
import org.apache.jmeter.testelement.TestPlan
import org.apache.jorphan.collections.HashTree

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

class JMeterKeyword {

	@Keyword
	def runJMeter() {
		String directoryPath = RunConfiguration.getReportFolder() + "/requests";
		JMeterRunner runner = new JMeterRunner();
		runner.run(directoryPath);
	}
}
