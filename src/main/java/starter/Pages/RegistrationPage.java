package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends PageObject {
    //Click Icon Account
    @FindBy (id = "dropdown-basic")
    WebElement IconAccount;
    public void clicIconAccount(){
        IconAccount.click();
    }
    //Click Button Daftar
    @FindBy (id = "daftar")
    WebElement TextButtonDaftar;
    public void clickTextButtonDaftar(){
        TextButtonDaftar.click();
    }
    //Input field Nama
    @FindBy(id = "name")
    WebElement FieldNama;
    public void InputFieldNama(String nama){
        FieldNama.sendKeys(nama);
    }

    //Input field email
    @FindBy(id = "email")
    WebElement FieldEmail;
    public void InputFieldEmail(String email){
        FieldEmail.sendKeys(email);
    }

    //Input field phone
    @FindBy(id = "phone")
    WebElement FieldPhone;
    public void InputFieldPhone(String phone){
        FieldPhone.sendKeys(phone);
    }

    //Input field password
    @FindBy(id = "password")
    WebElement FieldPassword;
    public void InputFieldPassword(String password){
        FieldPassword.sendKeys(password);
    }

    //Click Button SignUp
    @FindBy(id = "btn-daftar")
    WebElement ButtonDaftar;
    public void clickButtonDaftar(){
        ButtonDaftar.click();
    }
    //Validate Register
    @FindBy(xpath = "//*[@id=\"swal2-html-container\"]")
    WebElement PopUpMessageRegister;
    //validate message register success
    public void validateRegister(String message){
        element(PopUpMessageRegister).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageRegister.getText());
    }
}