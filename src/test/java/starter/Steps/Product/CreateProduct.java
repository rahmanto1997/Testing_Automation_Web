package starter.Steps.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest.BaseTest;

public class CreateProduct extends BaseTest {
    @Given("I am logged as user")
    public void iAmLoggedAsUser() {
        product.open();
        product.clicIconAccount();
        product.clickTextButtonMasuk();
        product.inputEmailPassword();
        product.clickButtonMasuk();
        product.clickButtonOK();
    }

    @When("I am click menu dropdown icon profile")
    public void iAmClickMenuDropdownIconProfile() {
        product.clicIconAccount();
    }

    @And("I am click menu Rentalkan Produk")
    public void iAmClickMenuRentalkanProduk() {
        product.clickTextButtonRental();
    }

    @And("I am click button Tambah")
    public void iAmClickButtonTambah() {
        product.clickButtonTambah();
    }

    @And("I am enter in field Nama Produk {string}")
    public void iAmEnterInFieldNamaProduk(String nama) {
        product.inputFieldNamaProduk(nama);
    }

    @And("I am enter in field Harga Rental {int}")
    public void iAmEnterInFieldHargaRental(int harga) {
        product.inputFieldHargaRental(harga);
    }

    @And("I am enter in field Stok Produk {int}")
    public void iAmEnterInFieldStokProduk(int stok) {
        product.inputFieldStokProduk(stok);
    }

    @And("I am choice of Pilih Jaminan Produk")
    public void iAmChoiceOfPilihJaminanProduk() {
        product.checklistKTP();
        product.checklistSIM();
    }

    @And("I am upload an image product {string}")
    public void iAmUploadAnImageProduct(String filename) {
        product.uploadFoto(filename);
    }

    @And("I am choice of Kota Pemilik")
    public void iAmChoiceOfKotaPemilik() {
        product.choiceKota();
    }

    @And("I am choice of Kategori Produk")
    public void iAmChoiceOfKategoriProduk() {
        product.choiceKategori();
    }

    @And("I am enter in field Deskripsi Produk {string}")
    public void iAmEnterInFieldDeskripsiProduk(String deskripsi) {
        product.inputDeskripsi(deskripsi);
    }
    @And("I am click button Tambahkan")
    public void iAmClickButtonTambahkan() {
        product.clickButtonTambahkan();
    }
    @Then("I am success add products")
    public void iAmSuccessAddProducts() {
    }
}