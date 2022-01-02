package starter.Steps.Account;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest.BaseTest;

public class RegistrationSteps extends BaseTest {
    @Given("I am open registration page in rentz")
    public void iAmOpenRegistrationPageInRentz() {
        register.open();
        register.clicIconAccount();
        register.clickTextButtonDaftar();
    }

    @When("I am enter Nama {string} in signup page")
    public void iAmEnterNamaInSignupPage(String nama) {
        register.InputFieldNama(nama);
    }

    @And("I am enter Email {string} in signup page")
    public void iAmEnterEmailInSignupPage(String email) {
        register.InputFieldEmail(email);
    }

    @And("I am enter No.Telepon {string} in signup page")
    public void iAmEnterNoTeleponInSignupPage(String phone) {
        register.InputFieldPhone(phone);
    }

    @And("I am enter Kata Sandi {string} in signup page")
    public void iAmEnterKataSandiInSignupPage(String password) {
        register.InputFieldPassword(password);
    }

    @And("I am click button Daftar in signup page")
    public void iAmClickButtonDaftarInSignupPage() {
        register.clickButtonDaftar();
    }

    @Then("I am success registration")
    public void iAmSuccessRegistration() {
    }

    @And("Show success registration message {string}")
    public void showSuccessRegistrationMessage(String message) {
        register.validateRegister(message);
    }

    @Then("I am failed registration")
    public void iAmFailedRegistration() {
    }

    @And("Show failed registration message Nama tidak boleh kosong {string}")
    public void showFailedRegistrationMessageNamaTidakBolehKosong(String message) {
        register.validateRegister(message);
    }

    @And("Show failed registration message Format nama tidak sesuai {string}")
    public void showFailedRegistrationMessageFormatNamaTidakSesuai(String message) {
        register.validateRegister(message);
    }

    @And("Show failed registration message Email atau No.Telepon sudah terdaftar {string}")
    public void showFailedRegistrationMessageEmailAtauNoTeleponSudahTerdaftar(String message) {
        register.validateRegister(message);
    }

    @And("Show failed registration message Email harus berisi format Email {string}")
    public void showFailedRegistrationMessageEmailHarusBerisiFormatEmail(String message) {
        register.validateRegister(message);
    }

    @And("Show failed registration message Nomor HP tidak boleh kosong {string}")
    public void showFailedRegistrationMessageNomorHPTidakBolehKosong(String message) {
        register.validateRegister(message);
    }

    @And("Show failed registration message Kata sandi tidak boleh kurang dari lima karakter {string}")
    public void showFailedRegistrationMessageKataSandiTidakBolehKurangDariLimaKarakter(String message) {
        register.validateRegister(message);
    }
}