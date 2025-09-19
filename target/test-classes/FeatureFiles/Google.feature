Feature: This is feature file for Google application Test

  Background: 
    Given Open Google application

  Scenario: Test Google application title
    #Given Open Google application
    When user get the current title of application
    Then title should be Google

  Scenario: Test Google search functionality with valid keyword
    #Given Open Google application
    When user search for "java"
    Then user should get valid result for search