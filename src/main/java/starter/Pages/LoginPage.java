package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {
    //CLick Icon Account
    @FindBy(id = "dropdown-basic")
    WebElement IconAccount;
    public void clicIconAccount() {
        IconAccount.click();
    }
    //Click Button Masuk
    @FindBy(id = "masuk")
    WebElement TextButtonMasuk;
    public void clickTextButtonMasuk(){
        TextButtonMasuk.click();
    }
    //Input Email in FIeld Email
    @FindBy(id = "email")
    WebElement FieldEmail;
    public void inputEmail(String email){
        FieldEmail.sendKeys(email);
    }
    //Input Password in Field Password
    @FindBy(id = "password")
    WebElement FieldPassword;
    public void inputPassword(String password){
        FieldPassword.sendKeys(password);
    }
    //Click Button Masuk
    @FindBy(id = "btn-masuk")
    WebElement ButtonMasuk;
    public void clickButtonMasuk(){
        ButtonMasuk.click();
    }

    //validate message
    @FindBy(xpath = "//*[@id=\"swal2-html-container\"]")
    WebElement PopUpMessageLogin;
    //validate message register
    public void validateRegister(String message){
        element(PopUpMessageLogin).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageLogin.getText());
    }
}