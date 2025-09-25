Feature: Test Inventory page

  Background: 
    Given User must be login woth valid credentials
      | standard_user | secret_sauce |
    Given User is on Inventory page

  Scenario: Test for total product count
    When User get the current product count
    Then Total product should be 6

  Scenario: Test for Product deatils
    When User get the current product details
    Then Product detials should be display

  Scenario: Test for sdd product to cart
    When User add product "Sauce Labs Bolt T-Shirt" into cart
    Then Product should be added into cart
    #And open cart page to observe that product