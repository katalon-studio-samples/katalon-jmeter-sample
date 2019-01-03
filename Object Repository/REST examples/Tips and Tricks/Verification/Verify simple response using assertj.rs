<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Verify simple response using assertj</name>
   <tag></tag>
   <elementGuidId>7b9619d7-4483-46f8-a481-5a65edac60a6</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${authorization}</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://katalon.atlassian.net/rest/api/2/issue/${issue_key}?fields=summary,status,issuetype,assignee,project,priority,description</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.authorization</defaultValue>
      <description></description>
      <id>b3123278-d501-4774-b3a0-960df2b38d14</id>
      <masked>false</masked>
      <name>authorization</name>
   </variables>
   <variables>
      <defaultValue>'KD-1'</defaultValue>
      <description></description>
      <id>8ffabc15-93b3-40aa-8aed-7a739c9e479a</id>
      <masked>false</masked>
      <name>issue_key</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

def jsonSlurper = new JsonSlurper()
def jsonResponse = jsonSlurper.parseText(response.getResponseText())

// Verify issue key
assertThat(jsonResponse.key).isEqualTo('KD-1')

// Verify project information
assertThat(jsonResponse.fields.project.key).isEqualTo('KD')
assertThat(jsonResponse.fields.project.name).isEqualTo('Katalon-Demo')

// Verify issue information
assertThat(jsonResponse.fields.summary).isEqualTo('REST - Create new issue using API')
assertThat(jsonResponse.fields.description).isEqualTo('As a User, I want to be able to create a new tickets, so that I can keep track all tasks')
assertThat(jsonResponse.fields.issuetype.name).isEqualTo('Bug')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
