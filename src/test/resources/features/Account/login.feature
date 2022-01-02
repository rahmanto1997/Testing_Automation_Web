@Login
Feature: Login Function
  As a user
  I want to be able lo Login in Rentz.ID
  So that I am success login

  @Login_1 #Success
  Scenario: I am login with valid email and password
    Given I am open login page in Rentz.ID
    When I am enter email "olla_ramlanen@gmail.com"
    And I am enter password "P@ssw0rd"
    And I am click button Masuk
    Then I am success login
    And Show success message "Anda telah login"

  @Login_2 #Failed
  Scenario: I am login with invalid email and valid password
    Given I am open login page in Rentz.ID
    When I am enter email "olla_smilikitty@gmail.com"
    And I am enter password "P@ssw0rd"
    And I am click button Masuk
    Then I am failed login
    And Show failed message "Email / Kata sandi salah"

  @Login_3 #Failed
  Scenario: I am login with valid email and invalid password
    Given I am open login page in Rentz.ID
    When I am enter email "olla_ramlanen@gmail.com"
    And I am enter password "ZXcv1234"
    And I am click button Masuk
    Then I am success login
    And Show failed message "Email / Kata sandi salah"

  @Login_4 #Failed
  Scenario: I am login with invalid email and password
    Given I am open login page in Rentz.ID
    When I am enter email "olla_smilikitty@gmail.com"
    And I am enter password "ZXcv1234"
    And I am click button Masuk
    Then I am success login
    And Show failed message "Email / Kata sandi salah"

  @Login_4 #Failed
  Scenario: I am login with only space email and valid password
    Given I am open login page in Rentz.ID
    When I am enter email " "
    And I am enter password "P@ssw0rd"
    And I am click button Masuk
    Then I am success login
    And Show failed message "Email harus berisi format email"

  @Login_5 #Failed
  Scenario: I am login with blank email and password
    Given I am open login page in Rentz.ID
    When I am enter email ""
    And I am enter password ""
    And I am click button Masuk
    Then I am success login
    And Show success message "Email harus berisi format email"

  @Login_6 #Failed
  Scenario: I am login with blank email and valid password
    Given I am open login page in Rentz.ID
    When I am enter email ""
    And I am enter password "P@ssw0rd"
    And I am click button Masuk
    Then I am success login
    And Show success message "Email harus berisi format email"

  @Login_7 #Failed
  Scenario: I am login with valid email and blank password
    Given I am open login page in Rentz.ID
    When I am enter email "olla_ramlanen@gmail.com"
    And I am enter password ""
    And I am click button Masuk
    Then I am success login
    And Show success message "Kata sandi tidak boleh kosong"