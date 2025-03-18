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
@tag
Feature: Factorial computation
  As a user I want to compute the factorial of a given number so that I can know the result

  @tag1
  Scenario: Computing the factorial of zero
    Given I have a factorial calculator
    When I compute the factorial of 0
    Then The system returns 1
    
  @tag2
  Scenario Outline: Computing the factorial of a positive small integer
    Given I have a factorial calculator
    When I compute the factorial of <n>
    Then The system returns <value>
   
   	Examples: 
      | n | value |
      | 1 | 1     |
      | 2 | 2     |
      | 3 | 6     |
      | 4 | 24    |
      | 5 | 120   |
      | 6 | 720   |

	@tag3
  Scenario Outline: Computing the factorial of a negative integer
    Given I have a factorial calculator
    When I compute the factorial of a negative number <n>
    Then The system raises an exception
   
   	Examples: 
      | n  |
      | -1 |
      | -2 |
      | -5 |
      
