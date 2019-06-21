#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Smoke
Feature: Test login functionality with multiple users

  Scenario Outline: Login functionality
    Given user is on DemoWebShop homepage
    When user enters "<username>" and "<password>"
    And clicks on login button
    Then should display message login successful

    Examples: 
      | username           | password |
      | pratiksha@test.com | pratiksha  |
      | rick@test.com      | tester   |
