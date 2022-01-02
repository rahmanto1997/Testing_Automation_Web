package starter.BaseTest;

import starter.Booking.CreateBooking;
import starter.Pages.LoginPage;
import starter.Pages.LogoutPage;
import starter.Pages.RegistrationPage;
import starter.Payment.Checkout;
import starter.Product.CreateProduct;
import starter.Product.DeleteProduct;

public class BaseTest {
    public RegistrationPage register = new RegistrationPage();
    public LoginPage login = new LoginPage();
    public LogoutPage logout = new LogoutPage();
    public CreateProduct product = new CreateProduct();
    public DeleteProduct deleteProduct = new DeleteProduct();
    public CreateBooking booking = new CreateBooking();
    public Checkout checkout = new Checkout();
}
