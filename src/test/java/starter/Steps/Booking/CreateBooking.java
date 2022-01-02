package starter.Steps.Booking;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest.BaseTest;

public class CreateBooking extends BaseTest {
    @When("I am choose product with click image product")
    public void iAmChooseProductWithClickImageProduct() {
        booking.chooseKategori();
        booking.choosePeralatan();
        booking.ImageProduct();
    }
    @And("I am click button rental")
    public void iAmClickButtonRental() {
        booking.clickButtonRental();
    }

    @And("I click button Tambahkan")
    public void iClickButtonTambahkan() {
        booking.clickButtonTambahkan();
    }

    @And("I see booking productg in my cart")
    public void iSeeBookingProductgInMyCart() {
        booking.clickIconCart();
    }

    @Then("I am success create Booking")
    public void iAmSuccessCreateBooking() {
    }
}