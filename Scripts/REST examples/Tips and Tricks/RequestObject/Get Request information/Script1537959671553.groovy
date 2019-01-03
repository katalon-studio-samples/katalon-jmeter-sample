import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable
import static org.assertj.core.api.Assertions.*

ResponseObject response = WS.sendRequest(findTestObject('REST examples/Tips and Tricks/RequestObject/Get Request information', [('issue_key') : 'KD-1', ('authorization') : GlobalVariable.authorization]))
RequestObject request = findTestObject('REST examples/Tips and Tricks/RequestObject/Get Request information', [('issue_key') : 'KD-1', ('authorization') : GlobalVariable.authorization])

// Docs:
//  - https://api-docs.katalon.com/com/kms/katalon/core/testobject/RequestObject.html
//  - https://api-docs.katalon.com/com/kms/katalon/core/testobject/TestObjectProperty.html


// Verify HTTP Headers
List<TestObjectProperty> lsObj = request.getHttpHeaderProperties()
lsObj.each{it ->
	
	println it.getName() + "==>" + it.getValue()
	
	String name = it.getName()
	switch (name) {
		case 'Content-Type':
			assertThat(it.getValue()).isEqualTo('application/json')
			break
		case 'Authorization':
			assertThat(it.getValue()).isEqualTo(GlobalVariable.authorization)
			break
		default:
			break
	}
}

// Verify HTTP Body
def jsonSlurper = new JsonSlurper()

String expectedBody = '''{
    "jql": "issuekey = KD-1",
    "startAt": 0,
    "maxResults": 15,
    "fields": [
        "summary",
        "status",
        "issuetype",
        "assignee",
        "project",
        "priority",
        "description"
    ]
}'''

def jsonExpectedBody = jsonSlurper.parseText(expectedBody)
def jsonResponse = jsonSlurper.parseText(request.getBodyContent().getText())

assertThat(jsonResponse.jql).isEqualTo(jsonExpectedBody.jql)
assertThat(jsonResponse).isEqualTo(jsonExpectedBody)

// Verify parameters
List<TestObjectProperty> lsParams = request.getRestParameters()
lsParams.each {it ->
	println it.getName() + "==>" + it.getValue()
}

// Verify Rest request method
assertThat(request.getRestRequestMethod()).isEqualTo("POST")

// Verify Rest name
assertThat(request.getName()).isEqualTo("Get Request information")