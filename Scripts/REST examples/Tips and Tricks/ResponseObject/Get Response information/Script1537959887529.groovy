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

assertThat(response.getContentType()).isEqualTo('application/json;charset=UTF-8')
assertThat(response.getHeaderFields()['X-AUSERNAME'][0]).isEqualTo('demo')
assertThat(response.isJsonContentType()).isTrue()