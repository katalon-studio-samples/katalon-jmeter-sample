import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper as JsonSlurper
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

def jsonSlurper = new JsonSlurper()

// Search for issues using jql
def issues_by_jql = WS.sendRequest(findTestObject('REST examples/Advance examples/api-2-search/Search issues/Search issues by jql', 
	[('authorization') : GlobalVariable.authorization
            , ('jql') : 'issuekey = KD-1000']))

// Verify the information
def json_issues_by_jql = jsonSlurper.parseText(issues_by_jql.getResponseText())

assertThat(json_issues_by_jql.issues).hasSize(1)

WS.verifyElementPropertyValue(issues_by_jql, 'issues[0].key', 'KD-1000')

// Search for the same issue using jql with issue_key
def issue_by_jql_issue_key = WS.sendRequest(findTestObject('REST examples/Advance examples/api-2-search/Search issues/Search issues by issue_key', 
	[('authorization') : GlobalVariable.authorization
            , ('issue_key') : 'KD-1000']))

// Verify the information
def json_issues_by_jql_issue_key = jsonSlurper.parseText(issues_by_jql.getResponseText())

assertThat(json_issues_by_jql_issue_key.issues).hasSize(1)

WS.verifyElementPropertyValue(issue_by_jql_issue_key, 'issues[0].key', 'KD-1000')
