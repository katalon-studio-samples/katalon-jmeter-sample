import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper as JsonSlurper
import internal.GlobalVariable as GlobalVariable

def jsonSlurper = new JsonSlurper()

// Create a new issue with provided information
def create_issue = WS.sendRequest(findTestObject('REST examples/Advance examples/api-2-issue/Create issue/Create a new issue with provided information', 
        [('project_key') : project_key, ('summary') : summary, ('description') : description, ('issue_type') : issue_type
            , ('priority') : priority, ('authorization') : GlobalVariable.authorization]))

def json_create_issue = jsonSlurper.parseText(create_issue.getResponseText())

// Get the new created issue, and verify the reponse to ensure that the issue is created with correct information
def new_issue = WS.sendRequest(findTestObject('REST examples/Advance examples/api-2-issue/Get issue/Get an issue by Key', 
        [('authorization') : GlobalVariable.authorization, ('issue_key') : json_create_issue.key]))

// Verify the new issue information
WS.verifyResponseStatusCode(new_issue, 200)

WS.verifyElementPropertyValue(new_issue, 'fields.project.key', project_key)

WS.verifyElementPropertyValue(new_issue, 'fields.issuetype.name', issue_type)

WS.verifyElementPropertyValue(new_issue, 'fields.priority.name', priority)

WS.verifyElementPropertyValue(new_issue, 'fields.summary', summary)

WS.verifyElementPropertyValue(new_issue, 'fields.description', description)
