<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Parameterize request query</name>
   <tag></tag>
   <elementGuidId>8e8ef579-8f49-4c73-9ea7-f9d095677d19</elementGuidId>
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
   <restUrl>https://katalon.atlassian.net/rest/api/2/issue/${issue_key}?expand=${expand_name}</restUrl>
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
   <variables>
      <defaultValue>'names'</defaultValue>
      <description></description>
      <id>e4dc6ced-81e2-4d10-aebb-338a51dc097c</id>
      <masked>false</masked>
      <name>expand_name</name>
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
WS.verifyElementPropertyValue(response, 'key', 'KD-1')

// Verify project information
WS.verifyElementPropertyValue(response, 'fields.project.key', 'KD')
WS.verifyElementPropertyValue(response, 'fields.project.name', 'Katalon-Demo')

// Verify issue information
WS.verifyElementPropertyValue(response, 'fields.summary', 'REST - Create new issue using API')
WS.verifyElementPropertyValue(response, 'fields.description', 'As a User, I want to be able to create a new tickets, so that I can keep track all tasks')
WS.verifyElementPropertyValue(response, 'fields.issuetype.name', 'Bug')

HashMap res = response.getHeaderFields();
println res
println res.get(&quot;Content-Type&quot;)
RequestObject request = WSResponseManager.getInstance().getCurrentRequest()
List&lt;TestObjectProperty> lsObj = request.getHttpHeaderProperties()
lsObj.each{it -> println it.getName() + &quot;\n&quot; + it.getValue()}</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
