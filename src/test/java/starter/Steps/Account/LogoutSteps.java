package starter.Steps.Account;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest.BaseTest;

public class LogoutSteps extends BaseTest {
    @And("I am click button logout")
    public void iAmClickButtonLogout() {
        logout.clickTextButtonLogout();
    }
    @Then("I am success logout")
    public void iAmSuccessLogout() {
    }
}