#Author: manco.5@hotmail.com

@tag
Feature: change products view in the Swag Labs app
  As a app user
  I want change products view in the product list
  For better visualize the elements

  Background: User is Logged In
    Given That Juan open Swag Labs app
    When he submit username and password
      | username      | password     |
      | standard_user | secret_sauce |
    Then he should be logged in

  @changeProductsView
  Scenario: change products view to list
    Given that Juan sees the products in grid form
    When he presses the button to see the items as a list
    Then he sees the image of the products on the left
    And he sees the name and description of the products on the right