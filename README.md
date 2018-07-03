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
- [Open the project](https://docs.katalon.com//display/KD/Manage+Test+Project) from Katalon Studio
### Executing a Test Case     
![Execute a simple test case](https://github.com/katalon-studio-samples/jira-ui-tests/blob/master/Tutorials/Figures/Execute%20a%20simple%20test%20case.png?raw=true)
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
### Common Test Cases
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
- How to create RESTful Web services object at Object Repository with parameters so that it can be tested with different data set using data-driven approach
- How to create test cases that can be reused in different test scenario
- How to create test cases with BDD mindset
- How to use built-in keywords together with extended scripts such as assertj to verify the response information.
- How to group API end-points	 
## Advanced Execution 
### Execute an Advanced Test Case
 ![Execute an advance test case](https://github.com/katalon-studio-samples/jira-ui-tests/blob/master/Tutorials/Figures/Execute%20an%20advance%20test%20case.png?raw=true)
 The advance test cases in this example repository demonstrate how to set up the test project with Page Object Design Pattern approach to reduce the maintenance cost as well as increase the reusability of testing scripts.
1. Tests is the place where actual test cases are stored and executed.
2. Pages is the place where Page Objects are stored in Test case format. They could not be executed.
3. Select the test case you want to execute
4. Choose the browser for executing the test case
 
 ### Execute a Test Suite with Data-Driven
 ![Execute a test suite with data-driven](https://github.com/katalon-studio-samples/jira-ui-tests/blob/master/Tutorials/Figures/Execute%20a%20test%20suite%20with%20data-driven.png?raw=true)
 This example demonstrates how to apply data-driven approach to test execution with Katalon Studio. 
1. Expand the Test Suites structure, where all the test suites are stored and select the test suite you want to execute
2. Select the test case you want to apply data-driven approach
3. Click Show/Hide Data Binding to open Test Data and Variable Binding feature for the selected test case
4. Add an Data Files item containing test data used in the test
5. Data Files structure, where all the data files are stored. These data files can be created from external Excel files, CSV files, or from the result of a database query.
6. Variables and Data are binding
7. Choose the browser for executing the test suite
 
 ### Execute a Test Suite Collection
 ![Execute a test suite collection](https://github.com/katalon-studio-samples/jira-ui-tests/blob/master/Tutorials/Figures/Execute%20a%20test%20suite%20collection.png?raw=true)
 This example demonstrates how to execute a test suite collection.
1. Expand the Test Suites structure and select the test suite collection you want to execute
2. Test suite lists in the selected collection. 
3. A browser type is selected for each test suite in the collection
4. A execution profile is selected for each test suite in the collection
5. Execution mode. You can set to execute the test suite collection in Sequential or Parallel modes.
6. Execute the test suite collection with defined configuration.
 
## See Also
Update configurations for integration: [Jira](https://docs.katalon.com/x/7oEw), [Katalon Analytics](https://docs.katalon.com/x/KRhO)

Katalon Documentation: http://docs.katalon.com/, especially some [Tips and Tricks](https://docs.katalon.com/x/PgXR) to run a successful automation test. 

Katalon Forum: https://forum.katalon.com/

Katalon Business Support: https://www.katalon.com/support-service-options/
