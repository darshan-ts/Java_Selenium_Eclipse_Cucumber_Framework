Feature: Test Swaglab application Login Page

  Background: 
    Given Open Swaglab application

  Scenario: Test for swaglab application home page title
    When User get the current page title
    Then Title should match with "Swag Labs"

  Scenario: Test for login with valid credentials
    When User enter valid username and password
    And User click on Login button
    Then User should be navigate to inventory page and login successfull