#Author: manco.5@hotmail.com

@tag
Feature: apply filter to products in the Swag Labs app
  As a app user
  I want to apply filter to products
  For see only my interests

  Background: User is Logged In
    Given That Juan open Swag Labs app
    When he submit username and password
      | username      | password     |
      | standard_user | secret_sauce |
    Then he should be logged in

  @applyPriceLowToHighFilter
  Scenario: apply price low to high filter
    Given that Juan sees products without price order
    When he applies the "low to high" price filter
    Then he should see the products arranged by price

  @applyPriceHighToLowFilter
  Scenario: apply price high to low filter
    Given that Juan sees products without price order
    When he applies the "high to low" price filter
    Then he should see the products arranged by price

  @applyNameAToZFilter
  Scenario: apply name A to Z filter
    Given that Juan sees products without name order
    When he applies the "A to Z" name filter
    Then he should see the products arranged by name

  @applyNameZToAFilter
  Scenario: apply name Z to A filter
    Given that Juan sees products without name order
    When he applies the "Z to A" name filter
    Then he should see the products arranged by name