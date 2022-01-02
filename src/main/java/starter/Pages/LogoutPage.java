package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class LogoutPage {
    //CLick ButtonText Logout
    @FindBy(id = "logout")
    WebElement TextButtonLOgout;
    public void clickTextButtonLogout() {
        TextButtonLOgout.click();
    }
}
