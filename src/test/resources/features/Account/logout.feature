Feature: Logout Functionality
  As a user
  I want to do activities related to the product
  So that i am success operation with product

  Scenario: I want to log out as admin
    Given I am logged as user
    When I am click menu dropdown icon profile
    And I am click button logout
    Then I am success logout