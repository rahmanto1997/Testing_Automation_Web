package starter.Steps.Payment;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest.BaseTest;

public class Checkout extends BaseTest {
    @When("I am click icon cart")
    public void iAmClickIconCart() {
        checkout.clicIconCart();
    }

    @And("I am checklist product")
    public void iAmChecklistProduct() {
        checkout.clicChecklistProduct();
    }

    @And("I am click button Checkout")
    public void iAmClickButtonCheckout() {
        checkout.clickButtonCheckout();
    }

    @And("I am choose methode payment COD")
    public void iAmChooseMethodePaymentCOD() {
        checkout.clickChecklistCOD();
    }

    @And("I click button Bayar")
    public void iClickButtonBayar() {
        checkout.clickButtonBayar();
    }

    @Then("I am success payment checkout product")
    public void iAmSuccessPaymentCheckoutProduct() {
    }

    @And("show success message {string}")
    public void showSuccessMessage(String message) {
        checkout.validateBayar(message);
    }
}