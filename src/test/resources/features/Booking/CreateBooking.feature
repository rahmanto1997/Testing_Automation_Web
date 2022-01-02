@Goals
Feature: Create Booking
  As a user
  I want to create a booking
  So that I am success create booking

  @CreateBooking
  Scenario: User want to create booking
    Given I am logged as user
    When I am choose product with click image product
    And I am click button rental
    And I click button Tambahkan
    And I see booking productg in my cart
    Then I am success create Booking