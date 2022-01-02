package starter.Booking;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class CreateBooking extends PageObject {
    //CLick Kategori Pilihan
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[4]")
    WebElement ChooseKategori;
    public void chooseKategori() {
        ChooseKategori.click();
    }
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div[1]")
    WebElement ChoosePeralatan;
    public void choosePeralatan(){
        ChoosePeralatan.click();
    }
    @FindBy(id = "3")
    WebElement ImageProduct;
    public void ImageProduct(){
        ImageProduct.click();
    }
    //Click Button Rental
    @FindBy(id = "rent-cartNull")
    WebElement ButtonRental;
    public void clickButtonRental(){
        ButtonRental.click();
    }
    //Click Button Tambahkan
    @FindBy(id = "add-cart")
    WebElement ButtonTambahkan;
    public void clickButtonTambahkan(){
        ButtonTambahkan.click();
    }
    //Click Icon Cart
    @FindBy(id = "cart-login")
    WebElement IconCart;
    public void clickIconCart(){
        IconCart.click();
    }
}