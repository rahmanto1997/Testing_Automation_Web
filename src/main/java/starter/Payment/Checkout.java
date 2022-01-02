package starter.Payment;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Checkout extends PageObject {
    //Click Icon Cart
    @FindBy(id = "cart-login")
    WebElement IconCart;
    public void clicIconCart() {
        IconCart.click();
    }
    //Click Checklis Product
    @FindBy(id = "0")
    WebElement ChecklistProduct;
    public void clicChecklistProduct() {
        ChecklistProduct.click();
    }
    //Click Button Checkout
    @FindBy(id = "checkout")
    WebElement ButtonCheckout;
    public void clickButtonCheckout(){
        ButtonCheckout.click();
    }
    //Click metode COD
    @FindBy(id = "cod")
    WebElement ChecklistCOD;
    public void clickChecklistCOD(){
        ChecklistCOD.click();
    }
    //Click Button Bayar
    @FindBy(id = "pay")
    WebElement ButtonBayar;
    public void clickButtonBayar(){
        ButtonBayar.sendKeys(Keys.PAGE_DOWN);
        element(ButtonBayar).waitUntilVisible();
        ButtonBayar.click();
    }
    //validate message
    @FindBy(xpath = "//*[@id=\"swal2-html-container\"]")
    WebElement PopUpMessageBayar;
    //validate message register
    public void validateBayar(String message){
        element(PopUpMessageBayar).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageBayar.getText());
    }
}