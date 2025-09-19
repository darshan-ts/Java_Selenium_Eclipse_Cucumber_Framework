@all
Feature: Test Amazon application

  Background: 
    Given open Amazon application

  @homepage @functional @ignore
  Scenario: Test home page title
    When User get the home page title
    Then Title should match with home page

  @sellpage @regression
  Scenario: Test Sell page title
    When User open Sell page
    And User get the Sell page title
    Then Title should match with Sell page

  @mobilepage
  Scenario: Test Mobile page title
    When User open mobile page
    And get the mobile page title
    Then Title should match with mobile page

  @fashionpage @ignore
  Scenario: Test Fashion Page title
    When User open fashion page
    And get the fashion page title
    Then Title should match with fashion page