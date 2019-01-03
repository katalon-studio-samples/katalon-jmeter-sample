import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable as GlobalVariable

ResponseObject response = WS.sendRequest(findTestObject('REST examples/Tips and Tricks/Verification/Verify simple response using built-in keywords', [('authorization') : GlobalVariable.authorization
            , ('issue_key') : 'KD-1']))

// Verify issue key
WS.verifyElementPropertyValue(response, 'key', 'KD-1')

// Verify project information
WS.verifyElementPropertyValue(response, 'fields.project.key', 'KD')
WS.verifyElementPropertyValue(response, 'fields.project.name', 'Katalon-Demo')

// Verify issue information
WS.verifyElementPropertyValue(response, 'fields.summary', 'REST - Create new issue using API')
WS.verifyElementPropertyValue(response, 'fields.description', 'As a User, I want to be able to create a new tickets, so that I can keep track all tasks')
WS.verifyElementPropertyValue(response, 'fields.issuetype.name', 'Bug')
