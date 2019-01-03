import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper

response = WS.sendRequest(findTestObject('REST examples/Simple examples/api-2-search/Search issues/Search issues by jql'))

def jsonSlurper = new JsonSlurper()

def jsonResponse = jsonSlurper.parseText(response.getResponseText())

assertThat(jsonResponse.issues).hasSize(15)
assertThat(jsonResponse.issues[0].key).isEqualTo('KD-1')
assertThat(jsonResponse.issues[14].key).isEqualTo('KD-15')