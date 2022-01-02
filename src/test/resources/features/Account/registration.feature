@Register
Feature: Registration Functionality
  As a visitor
  I want to be able to registration Rentz.ID
  So that I have account in barengin and to be a user

  @Register_1 #success
  Scenario: I am registration with valid data
    Given I am open registration page in rentz
    When I am enter Nama "nakamamirq" in signup page
    And I am enter Email "nakamamirq@alterra.id" in signup page
    And I am enter No.Telepon "087606421231" in signup page
    And I am enter Kata Sandi "P@ssw0rd1" in signup page
    And I am click button Daftar in signup page
    Then I am success registration
    And Show success registration message "Daftar akun berhasil"

  @Register_2 #failed
  Scenario: I am registration without Name
    Given I am open registration page in rentz
    When I am enter Nama "" in signup page
    And I am enter Email "nakamamur1a@alterra.id" in signup page
    And I am enter No.Telepon "081876064789" in signup page
    And I am enter Kata Sandi "P@ssw0rd1" in signup page
    And I am click button Daftar in signup page
    Then I am failed registration
    And Show failed registration message Nama tidak boleh kosong "Nama tidak boleh kosong"

  @Register_3 #failed
  Scenario: I am registration with only space on Nama
    Given I am open registration page in rentz
    When I am enter Nama " " in signup page
    And I am enter Email "nakamamur1a@alterra.id" in signup page
    And I am enter No.Telepon "081876064789" in signup page
    And I am enter Kata Sandi "P@ssw0rd1" in signup page
    And I am click button Daftar in signup page
    Then I am failed registration
    And Show failed registration message Format nama tidak sesuai "Format nama tidak sesuai"

  @Register_4 #succes
  Scenario: I am registration with added space on Nama
    Given I am open registration page in rentz
    When I am enter Nama "Naka mura sayu" in signup page
    And I am enter Email "nakamamur3@alterra.id" in signup page
    And I am enter No.Telepon "08182134236" in signup page
    And I am enter Kata Sandi "P@ssw0rd1" in signup page
    And I am click button Daftar in signup page
    Then I am success registration
    And Show success registration message "Daftar akun berhasil"

  @Register_5 #failed
  Scenario: I am registration with Email already registered
    Given I am open registration page in rentz
    When I am enter Nama "hassimi" in signup page
    And I am enter Email "nakamamura@alterra.id" in signup page
    And I am enter No.Telepon "0818760625352" in signup page
    And I am enter Kata Sandi "P@ssw0rd1" in signup page
    And I am click button Daftar in signup page
    Then I am failed registration
    And Show failed registration message Email atau No.Telepon sudah terdaftar "Email atau No.Telepon sudah terdaftar"

  @Register_6 #failed
  Scenario: I am registration without Email
    Given I am open registration page in rentz
    When I am enter Nama "hassimi" in signup page
    And I am enter Email "" in signup page
    And I am enter No.Telepon "0818760625352" in signup page
    And I am enter Kata Sandi "P@ssw0rd1" in signup page
    And I am click button Daftar in signup page
    Then I am failed registration
    And Show failed registration message Email harus berisi format Email "Email harus berisi format email"

  @Register_7 #failed
  Scenario: I am registration with No.Telepon already registered
    Given I am open registration page in rentz
    When I am enter Nama "hassimi" in signup page
    And I am enter Email "nakamamura1b@alterra.id" in signup page
    And I am enter No.Telepon "0876064789676" in signup page
    And I am enter Kata Sandi "P@ssw0rd1" in signup page
    And I am click button Daftar in signup page
    Then I am failed registration
    And Show failed registration message Email atau No.Telepon sudah terdaftar "Email atau No.Telepon sudah terdaftar"

  @Register_8 #failed
  Scenario: I am registration without No.Telepon
    Given I am open registration page in rentz
    When I am enter Nama "hassimi" in signup page
    And I am enter Email "nakamamura1b@alterra.id" in signup page
    And I am enter No.Telepon "" in signup page
    And I am enter Kata Sandi "P@ssw0rd1" in signup page
    And I am click button Daftar in signup page
    Then I am failed registration
    And Show failed registration message Nomor HP tidak boleh kosong "Nomor HP tidak boleh kosong"

  @Register_9 #failed
  Scenario: I am registration with using Password Less than 5 characters
    Given I am open registration page in rentz
    When I am enter Nama "hassimi" in signup page
    And I am enter Email "nakamamura1b@alterra.id" in signup page
    And I am enter No.Telepon "088123456789" in signup page
    And I am enter Kata Sandi "P@ss" in signup page
    And I am click button Daftar in signup page
    Then I am failed registration
    And Show failed registration message Kata sandi tidak boleh kurang dari lima karakter "Kata sandi tidak boleh kurang dari 5 karakter"