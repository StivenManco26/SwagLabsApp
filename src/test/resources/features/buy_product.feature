#Author: manco.5@hotmail.com

@tag
Feature: buy product in the Swag Labs app
  As a app user
  I want to buy a product into Swag Labs app
  For my use

  Background: User is Logged In
    Given That Juan open Swag Labs app
    When he submit username and password
      | username      | password     |
      | standard_user | secret_sauce |
    Then he should be logged in

  @buyProduct
  Scenario: Buy Product
    Given that Juan adds the first item to the cart
    When he goes to the cart
    And he performs the checkout
    And he enters his information
      | First Name | Last Name | Postal Code |
      | Stiven     | Manco     | 500025      |
    Then he should see the summary of his purchase
    And he should see the complete checkout message