import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

response = WS.sendRequest(
	findTestObject('REST examples/Advance examples/api-2-issue/Get issue/Get an issue by Key', 
		['authorization' 	: GlobalVariable.authorization
			, 'issue_key' 	: 'KD-1000']))


// Verify the response
WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'fields.project.key', 'KD')

WS.verifyElementPropertyValue(response, 'fields.issuetype.name', 'Task')

WS.verifyElementPropertyValue(response, 'fields.priority.name', 'Medium')

WS.verifyElementPropertyValue(response, 'fields.summary', 'REST - Create new RESTful test using Katalon Studio')

WS.verifyElementPropertyValue(response, 'fields.description', 'As a Katalon user, I want to create a new RESTful test, so that I can ensure that my APIs work correctly.\r\n\r\nAC1 - Ability to create RESTful test using single end-point\r\nAC2 - Ability to import RESTful end-points from Swagger')