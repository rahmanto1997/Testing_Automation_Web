package starter.Product;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CreateProduct extends PageObject {
    //-----------GIVEN-----------//

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
    //Input Password in Field Password
    @FindBy(id = "password")
    WebElement FieldPassword;
    public void inputEmailPassword(){
        FieldEmail.sendKeys("olla_ramlanen@gmail.com");
        FieldPassword.sendKeys("P@ssw0rd");
    }
    //Click Button Masuk
    @FindBy(id = "btn-masuk")
    WebElement ButtonMasuk;
    public void clickButtonMasuk(){
        ButtonMasuk.click();
    }
    //Click Button OK
    @FindBy(xpath = "/html/body/div[2]/div/div[6]/button[1]")
    WebElement ButtonOK;
    public void clickButtonOK(){
        ButtonOK.click();
    }
    //Click Button Rentalkan Produk
    @FindBy(id = "add-rent")
    WebElement TextButtonRental;
    public void clickTextButtonRental(){
        TextButtonRental.click();
    }
    //Click Button Tambah
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div/div[2]")
    WebElement ButtonTambah;
    public void clickButtonTambah(){
        ButtonTambah.click();
    }
    //Input Nama Produk
    @FindBy(id = "name_product")
    WebElement FieldNamaProduk;
    public void inputFieldNamaProduk(String nama){
        FieldNamaProduk.sendKeys(nama);
    }
    //Input Harga Produk
    @FindBy(id = "price_product")
    WebElement FieldHargaRental;
    public void inputFieldHargaRental(int harga){
        FieldHargaRental.sendKeys(String.valueOf(harga));
    }
    //Input Stock Produk
    @FindBy(id = "stock_product")
    WebElement FieldStokProduk;
    public void inputFieldStokProduk(int stok){
        FieldStokProduk.sendKeys(String.valueOf(stok));
    }
    //Checklist Jaminan KTP
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/form/div/div[1]/div[4]/div[1]")
    WebElement CheckboxKTP;
    public void checklistKTP(){
        CheckboxKTP.click();
    }
    //Checklist Jaminan SIM
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/form/div/div[1]/div[4]/div[2]")
    WebElement CheckboxSIM;
    public void checklistSIM(){
        CheckboxSIM.click();
    }
    //Upload Foto
    @FindBy(id = "photo_product")
    WebElement FieldFoto;
    public void uploadFoto(String filename){
        upload(filename).to(FieldFoto);
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/form/div/div[2]/div[1]/select")
    WebElementFacade FieldKota;
    public void choiceKota(){
        FieldKota.selectByVisibleText("Kota Aceh");
    }
    //Pilih Kategori Produk
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/form/div/div[2]/div[2]/select")
    WebElementFacade FieldKategori;
    public void choiceKategori(){
        FieldKategori.selectByVisibleText("Laptop");
    }
    //Input Deskripsi Produk
    @FindBy(id = "desc_product")
    WebElement FieldDeskripsi;
    public void inputDeskripsi(String deskripsi){
        FieldDeskripsi.sendKeys(deskripsi);
    }
    //Click Button Tambahkan
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/form/button[1]")
    WebElement ButtonTambahkan;
    public void clickButtonTambahkan(){
        ButtonTambahkan.sendKeys(Keys.PAGE_DOWN);
        element(ButtonTambahkan).waitUntilVisible();
        ButtonTambahkan.click();
    }
}