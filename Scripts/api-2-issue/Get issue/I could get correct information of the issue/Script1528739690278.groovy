import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper

WS.verifyElementPropertyValue(response, 'fields.project.key', project_key)
WS.verifyElementPropertyValue(response, 'fields.issuetype.name', issue_type)
WS.verifyElementPropertyValue(response, 'fields.priority.name', priority)
WS.verifyElementPropertyValue(response, 'fields.summary', summary)
WS.verifyElementPropertyValue(response, 'fields.description', description)


