@DeleteProduct
Feature: Delete Product
  As a user
  I want to deletete a product
  So that I am success delete product

  Scenario: User want to delete rental product page
    Given I am logged as user
    When I am click menu dropdown icon profile
    And I am click menu Rentalkan Produk
    And I am click button delete
    And I click button Hapus
    Then I am success delete products