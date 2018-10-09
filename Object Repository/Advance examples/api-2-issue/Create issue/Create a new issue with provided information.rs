<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create a new issue with provided information</name>
   <tag></tag>
   <elementGuidId>a19c8973-26a5-48e1-af51-96e5259f3731</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;fields\&quot;: {\n       \&quot;project\&quot;:\n       { \n          \&quot;key\&quot;: \&quot;${project_key}\&quot;\n       },\n       \&quot;summary\&quot;: \&quot;${summary}\&quot;,\n       \&quot;description\&quot;: \&quot;${description}\&quot;,\n       \&quot;issuetype\&quot;: {\n          \&quot;name\&quot;: \&quot;${issue_type}\&quot;\n       },\n       \&quot;priority\&quot;:{\n          \&quot;name\&quot;: \&quot;${priority}\&quot;\n       }\n   }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${authorization}</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://katalon.atlassian.net/rest/api/2/issue/</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'KD'</defaultValue>
      <description></description>
      <id>8dbce2f6-1ee2-448e-b0cc-0f9ae1245a34</id>
      <masked>false</masked>
      <name>project_key</name>
   </variables>
   <variables>
      <defaultValue>'REST - Create new issue using API'</defaultValue>
      <description></description>
      <id>0d34f435-fbb8-4797-accc-54caa49cfb55</id>
      <masked>false</masked>
      <name>summary</name>
   </variables>
   <variables>
      <defaultValue>'Creating of an issue using project keys and issue type names using the REST API'</defaultValue>
      <description></description>
      <id>b0ff0f5d-6599-4463-9848-8182466ffd38</id>
      <masked>false</masked>
      <name>description</name>
   </variables>
   <variables>
      <defaultValue>'Story'</defaultValue>
      <description></description>
      <id>64e4911c-c121-4ae2-8319-1ea8a2d6d5f6</id>
      <masked>false</masked>
      <name>issue_type</name>
   </variables>
   <variables>
      <defaultValue>'High'</defaultValue>
      <description></description>
      <id>c6597c85-b30c-4174-8fd5-c9a8706126fe</id>
      <masked>false</masked>
      <name>priority</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.authorization</defaultValue>
      <description></description>
      <id>2e088fb4-d98d-4ff9-b401-5d4e0659c692</id>
      <masked>false</masked>
      <name>authorization</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

def jsonSlurper = new JsonSlurper()

def jsonResponse = jsonSlurper.parseText(response.getResponseText())
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
