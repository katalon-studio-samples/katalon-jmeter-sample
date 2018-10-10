# Katalon Studio Samples: Jira API Tests
Katalon Studio is a free and easy-to-use automated functional and regression testing platform. It provides users the ability to implement full automated testing solutions for their application projects with minimal engineering and programming skill requirements.
______
The **jira-api-tests** perform API automation test on Jira Web Application using Katalon Studio. The examples in this project range from common to advanced test cases.
## Getting Started
These instructions will get you a copy of the project up and running on your local machine.
### Prerequisites
- [Katalon Studio](https://www.katalon.com/) - [Installation and Setup](https://docs.katalon.com/x/HwAM)
- Permission access to [Jira System](https://katalon.atlassian.net) (provided in the sample code)
- Application Under Test (AUT):
     + Jira cloud: https://katalon.atlassian.net/
     + Account: trongbui@kms-technology.com/BAGRyAfuRevu0xrXdrZL6ECD
### Setting Up
- [Check out](https://git-scm.com/book/en/v2/Git-Basics-Getting-a-Git-Repository) the code from this .git
- [Open the project](https://docs.katalon.com/katalon-studio/docs/manage-test-project.html) from Katalon Studio
### Executing a Test Case     
![Execute a simple test case](https://github.com/katalon-studio-samples/jira-api-tests/blob/master/Tutorials/Figures/Executing%20a%20test%20case.png?raw=true)
1. Expand the Test Cases structure, where all the test cases are stored.
2. Select the test case you want to execute
3. Choose the browser for executing the test case

At the end of this README, you will find additional methods to execute automation test cases.
## Test Scenarios
### Story: Get issue's information feature
```Gherkin     
   User story
        As a Jira user, I would like to be able to get issue's information via web service, so that I could get the data without logging in Jira web application.
     
     Feature: Get issue's information 
         Scenario: Get issue's information successfully
          Given The web service is available
          When I send a request to get issue's formation
          Then I could get the issue's information from the response
```
### Story: Create issue with defined information
```Gherkin     
   User story
        As a Jira user, I would like to be able to create a new issue with defined information via web service, so that I could manage my issues without logging in Jira web application
     
      Feature: Create issue
          Scenario: Create issue with defined information successfully
	    Given The web serice is available
	    When I send a request to create issue with defined information
	    Then The issue is created successfully in the system
```
## Test Cases	
    - Simple Test Cases
    - Advance Test Cases
    - Data-driven Test Cases
    - Tips and Tricks Test Cases
    - BDD Cucumber Test Cases

### Simple Test Cases
Test cases at this section will help the users to understand:
- How to create simple API testing with hard coding test data
- How to create a RESTful Web service object at Object Repository with different method: 
  - GET
  - POST
  - PUT
  - DELETE
- How to use simple built-in keywords to 
  - Send request
  - Verify response code
  - Verify response information

### Advanced Test Cases
Additionally, the users can try more advanced test cases and modify as they need. The advanced test cases contained in this project are:
- How to create RESTful Web services object at Object Repository with parameters
- How to pass value from a Web service response to another Web service request
- How to create RESTful API tests with dynamic test data

### Data-driven Test cases
Data-driven approach is important to API testing, since it helps users testing a Web service endpoint with different dataset without cloning the test case. Test cases in this section demonstrate:
- How to create test cases with input parameters
- How to use data-file in test suites
- How to execute test cases with data-file as a data-driven approach

### Tips & Tricks
Tips & Tricks part contains samples solving common questions from users:
- Parameterize:
  - Parameterize request body
  - Parameterize authentication
  - Parameterize request query
  - Parameterize request path
- RequestObject
- ResponseObject
- Verification
- Authentication

### BDD Cucumber Test Cases
From version 5.7, Katalon Studio has supported native BDD Cucumber testing approach. The example in this section show:
- How to create test features
- How to create test scenario, test scenario out-line
- How to implement step definition
- How to execute BDD Cucumber features.
______
 ### Execute a Test Suite with Data-Driven
 ![Execute a test suite with data-driven](https://github.com/katalon-studio-samples/jira-api-tests/blob/master/Tutorials/Figures/Execute%20a%20test%20suite%20with%20data%20driven.png?raw=true)
 
 This example demonstrates how to apply data-driven approach to test execution with Katalon Studio. 
1. Select the test suite
2. Select the test case you want to apply data-driven approach
3. Select data file
7. Bind test data and test case's parameters
 
 ### Execute a Test Suite
 ![Execute a test collection](https://github.com/katalon-studio-samples/jira-api-tests/blob/master/Tutorials/Figures/Execute%20a%20test%20suite.png?raw=true)
 
 This example demonstrates how to execute a test suite collection.
1. Select the Test suite
2. Add test cases into the test suite 
3. Execute the test suite

 ### Execute BDD Cucumber test feature
 ![Execute a test collection](https://github.com/katalon-studio-samples/jira-api-tests/blob/master/Tutorials/Figures/Execute%20a%20BDD%20Cucumber%20feature.png?raw=true)
 
 This example demonstrates how to execute a test suite collection.
1. Select the Test feature
2. Execute the Test feature

## See Also
Update configurations for integration: [Jira](https://docs.katalon.com/x/7oEw), [Katalon Analytics](https://docs.katalon.com/x/KRhO)

Katalon Documentation: http://docs.katalon.com/, especially some [Tips and Tricks](https://docs.katalon.com/x/PgXR) to run a successful automation test. 

Katalon Forum: https://forum.katalon.com/

Katalon Business Support: https://www.katalon.com/support-service-options/
