package common
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import internal.GlobalVariable


class CommonAPISteps {

	@Given('^The Jira System is available$')
	def the_jira_system_is_available() {
		GlobalVariable.latest_response = WS.sendRequest(findTestObject('Object Repository/REST examples/Simple examples/api-2-serverInfo/Get server info'))
		WS.verifyResponseStatusCode(GlobalVariable.latest_response, 200)
	}

	@Then('^I get response code "(.*)"$')
	def get_response_code(String code) {
		WS.verifyResponseStatusCode(GlobalVariable.latest_response, code as Integer)
	}
}


