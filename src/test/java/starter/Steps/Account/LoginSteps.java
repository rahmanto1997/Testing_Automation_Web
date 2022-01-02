package starter.Steps.Account;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest.BaseTest;

public class LoginSteps extends BaseTest {
    @Given("I am open login page in Rentz.ID")
    public void iAmOpenLoginPageInRentzID() {
        login.open();
        login.clicIconAccount();
        login.clickTextButtonMasuk();
    }

    @When("I am enter email {string}")
    public void iAmEnterEmail(String email) {
        login.inputEmail(email);
    }

    @And("I am enter password {string}")
    public void iAmEnterPassword(String password) {
        login.inputPassword(password);
    }

    @And("I am click button Masuk")
    public void iAmClickButtonMasuk() {
        login.clickButtonMasuk();
    }

    @Then("I am success login")
    public void iAmSuccessLogin() {
    }

    @And("Show success message {string}")
    public void showSuccessMessage(String message) {
        login.validateRegister(message);
    }

    @Then("I am failed login")
    public void iAmFailedLogin() {
    }

    @And("Show failed message {string}")
    public void showFailedMessage(String message) {
        login.validateRegister(message);
    }
}