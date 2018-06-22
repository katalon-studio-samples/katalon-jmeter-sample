# katalon-studio-samples
## JIRA API TESTS
The **jira-api-tests** is a testing project with examples of performing API functional automation test on JIRA Web Application using Katalon Studio. The examples in this project are various from simple to advance tests:

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
