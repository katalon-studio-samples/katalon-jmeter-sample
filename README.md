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

At the end of this README, you will find additional ways to execute automation test cases.
## Test Scenarios
Below is the list of all the available test cases in this project relating to the test scenarios as described. Simply select the test case you want to run in Katalon Studio and execute accordingly. You can also make additional changes in these test cases to get familiar with automation testing and specifically Katalon Studio. 
### Story: Get issue's information feature
    User story
        As a Jira user, I would like to be able to get issue's information via web service, so that I could get the data without logging in Jira web application.
     
     Feature: Get issue's information 
         Scenario: Get issue's information successfully
          Given The web service is available
          When I send a request to get issue's formation
          Then I could get the issue's information from the response

### Story: Create issue with defined information
    User story
        As a Jira user, I would like to be able to create a new issue with defined information via web service, so that I could manage my issues without logging in Jira web application
     
      Feature: Create issue
	 Scenario: Create issue with defined information successfully
	 Given The web serice is available
	 When I send a request to create issue with defined information
	 Then The issue is created successfully in the system
	 
### Simple examples
Test cases at this section help users understanding:
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

### Advance examples
Test cases at this section help users understanding:
- How to create RESTful Web services object at Object Repository with parameters so that it can be tested with different data set using data-driven approach
- How to create test cases that can be reused in different test scenario
- How to create test cases with BDD mindset
- How to use built-in keywords together with extended scripts such as assertj to verify the response information.
- How to group API end-points	 
    	
    	







## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

- [Katalon Studio](https://www.katalon.com/)
- Permission access to Jira System (provided in the sample code)

### Installing

A step by step series of examples that tell you have to get a development env running

```
Step 1:
	- Check out the code from this .git

Step 2:
	- Open Katalon Studio
	- Open the project from Katalon Studio

Step 3:
	- Update configuration for integration: Jira, Katalon Analytics
```

## Running the tests

Explain how to run the automated tests for this system
The example in this project has 2 parts: Simple examples and Advance examples.

### Simple examples
Executing test cases in the Simple examples is simple:
- Select the test case
- Click the Run button

Test cases at this section help users understanding:
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


### Advance examples
Executing test cases in the Advance examples is a bit more complex
- Select the test case under EXECUTABLE folder. The tests under DO NOT RUN folder are test cases for reuse purpose only and are not actual test cases.
- Click the Run button

Test cases at this section help users understanding:
- How to create RESTful Web services object at Object Repository with parameters so that it can be tested with different data set using data-driven approach
- How to create test cases that can be reused in different test scenario
- How to create test cases with BDD mindset
- How to use built-in keywords together with extended scripts such as assertj to verify the response information.
- How to group API end-points

### Object Repository
Webservice Object at the Object Repository can be executed with its hard coding test data. Those object having test data as parameters cannot be executed correctly.

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

## Contributing

## Versioning

## Authors

## License

## Acknowledgments
