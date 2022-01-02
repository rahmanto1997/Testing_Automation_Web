package starter.Payment;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class Checkout {
    //CLick Icon Cart
    @FindBy(id = "dropdown-basic")
    WebElement IconCart;
    public void clicIconCart() {
        IconCart.click();
    }
}
