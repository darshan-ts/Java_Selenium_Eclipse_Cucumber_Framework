Feature: Test SwagLab application

  Scenario: Test Login functionality with valid credentials
    Given Open application with url "https://www.saucedemo.com/v1/"
    When User enter valid username as "standard_user" and enter valid password as "secret_sauce"
    And User click on Login button
    Then User should be navigated to inventory page.