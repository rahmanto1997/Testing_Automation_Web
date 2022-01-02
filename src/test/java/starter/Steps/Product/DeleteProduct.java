package starter.Steps.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import starter.BaseTest.BaseTest;

public class DeleteProduct extends BaseTest {
    @And("I am click button delete")
    public void iAmClickButtonDelete() {
        deleteProduct.clickButtonDelete();
    }

    @And("I click button Hapus")
    public void iClickButtonHapus() {
        deleteProduct.clickButtonHapus();
    }

    @Then("I am success delete products")
    public void iAmSuccessDeleteProducts() {
    }
}
