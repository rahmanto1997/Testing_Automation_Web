@Goals
Feature: Checkout Product
  As a user
  I want to checkout a product
  So that I am success checkout product

  @Checkout
  Scenario: User want to checkout product by COD
    Given I am logged as user
    When I am click icon cart
    And I am checklist product
    And I am click button Checkout
    And I am choose methode payment COD
    And I click button Bayar
    Then I am success payment checkout product
    And show success message "Pembayaran Cash On Deleivery"