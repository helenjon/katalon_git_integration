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
@Registration
Feature: Registration check
  As a user, I want to passregistration
  So than I can enroll to course

  @Valid
  Scenario Outline: Registration with valid data
    Given I navigate to registration page
    When I enter Email as "email" and Full Name as "name" and Public Username as "username" and Password as "password"  
    And I click Create Account 
    Then Account was created successfully

    Examples: 
      | email                  | name   | username  | password       |
      | testtesttest@gmail.com | test   | test      | Welcome        |
      | testt@gmail.com        | ttest  | ttest     | tWelcome       |

