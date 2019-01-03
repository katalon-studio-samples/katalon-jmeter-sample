<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Search issues by issue_key</name>
   <tag></tag>
   <elementGuidId>63597c86-b392-4a94-a57a-92ec74c5609e</elementGuidId>
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
   <restUrl>https://katalon.atlassian.net/rest/api/2/search?=&amp;=</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.authorization</defaultValue>
      <description></description>
      <id>1454a15d-1062-44ef-a7b3-d95233fc861e</id>
      <masked>false</masked>
      <name>authorization</name>
   </variables>
   <variables>
      <defaultValue>'KD-1000'</defaultValue>
      <description></description>
      <id>fc2d1404-e05d-42a3-92bf-5e180ccc3ca9</id>
      <masked>false</masked>
      <name>issue_key</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
