import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper

response = WS.sendRequest(findTestObject('Simple Examples/api-2-issue/Get issue/Get issue with specified key as parameter in URL'))
WS.verifyResponseStatusCode(response, 200)
return response

