#Author: manco.5@hotmail.com

@tag
Feature: cart wipe in the Swag Labs app
  As a app user
  I want to empty the shopping cart
  For choose my articles again

  Background: User is Logged In and add three items into cart
    Given That Juan open Swag Labs app
    When he submit username and password
      | username      | password     |
      | standard_user | secret_sauce |
    And he should be logged in
    And he adds the first three items to the cart
    Then he goes to the cart

  @cartWipe
  Scenario: cart wipe
    Given that Juan sees his cart with three elements
    When he removes all items from the cart
    Then he sees his empty cart
