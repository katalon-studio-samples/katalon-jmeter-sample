import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable as GlobalVariable

ResponseObject response = WS.sendRequest(findTestObject('REST examples/Tips and Tricks/Parameterize/Parameterize request path', 
	[
			('authorization') : GlobalVariable.authorization
          , ('issue_key') : 'KD-1'
	]
))

WS.verifyResponseStatusCode(response, 200)
