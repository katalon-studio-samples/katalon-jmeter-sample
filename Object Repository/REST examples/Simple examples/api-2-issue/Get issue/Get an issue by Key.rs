<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get an issue by Key</name>
   <tag></tag>
   <elementGuidId>47d3e0ac-5268-4b7d-a75b-87b535c9c1f4</elementGuidId>
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
      <value>Basic ZGVtb0BrYXRhbG9uLmNvbTpWQm5jZXRPU083MEU0TlZMWVFuaDlCMkQ=</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://katalon.atlassian.net/rest/api/2/issue/KD-1000?expand=names&amp;fields=summary,status,issuetype,assignee,project,priority,description</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

// Verify the response
WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'fields.project.key', 'KD')

WS.verifyElementPropertyValue(response, 'fields.issuetype.name', 'Task')

WS.verifyElementPropertyValue(response, 'fields.priority.name', 'Medium')

WS.verifyElementPropertyValue(response, 'fields.summary', 'REST - Create new RESTful test using Katalon Studio')

WS.verifyElementPropertyValue(response, 'fields.description', 'As a Katalon user, I want to create a new RESTful test, so that I can ensure that my APIs work correctly.\r\n\r\nAC1 - Ability to create RESTful test using single end-point\r\nAC2 - Ability to import RESTful end-points from Swagger')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
