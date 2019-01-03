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

def str_summary = 'REST - Edit an existing RESTful test using Katalon Studio' + ' at ' + new Date()
def issue_key = 'KD-1001'

// Update the issue summary
def update_response = WS.sendRequest(findTestObject('REST examples/Advance examples/api-2-issue/Edit issue/Edit an existing issue by Key', 
	[('issue_key') : issue_key
   , ('authorization') : GlobalVariable.authorization
   , ('summary') : str_summary]))

// Verify that the issue summary is updated correctly
def get_response = WS.sendRequest(findTestObject('REST examples/Advance examples/api-2-issue/Get issue/Get an issue by Key', 
	[ 'issue_key' : issue_key
	, 'authorization' : GlobalVariable.authorization]))

WS.verifyElementPropertyValue(get_response, 'fields.summary', str_summary)
