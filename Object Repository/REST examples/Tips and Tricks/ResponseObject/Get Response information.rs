<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get Response information</name>
   <tag></tag>
   <elementGuidId>8e34a702-5f16-42ba-b680-2201d6567afc</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;jql\&quot;: \&quot;issuekey \u003d ${issue_key}\&quot;,\n    \&quot;startAt\&quot;: 0,\n    \&quot;maxResults\&quot;: 15,\n    \&quot;fields\&quot;: [\n        \&quot;summary\&quot;,\n        \&quot;status\&quot;,\n        \&quot;issuetype\&quot;,\n        \&quot;assignee\&quot;,\n        \&quot;project\&quot;,\n        \&quot;priority\&quot;,\n        \&quot;description\&quot;\n    ]\n}\n&quot;,
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
   <restUrl>https://katalon.atlassian.net/rest/api/2/search?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'KD-1'</defaultValue>
      <description></description>
      <id>e0b786d7-e6f3-4588-8cfe-b8d6630f91fa</id>
      <masked>false</masked>
      <name>issue_key</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.authorization</defaultValue>
      <description></description>
      <id>447abb7d-3b0b-412b-a5b8-5c1a2d6f90e0</id>
      <masked>false</masked>
      <name>authorization</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable


ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

assertThat(response.getContentType()).isEqualTo('application/json;charset=UTF-8')
assertThat(response.getHeaderFields()['X-AUSERNAME'][0]).isEqualTo('')
assertThat(response.isJsonContentType()).isTrue()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
