import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper
import static org.assertj.core.api.Assertions.*;

response = WS.sendRequest(findTestObject('api-2-issue/Create issue/Create a new issue with provided information', [('project_key') : project_key
            , ('issue_type') : issue_type, ('priority') : priority, ('description') : description, ('summary') : summary]));

return response
