package starter.Product;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DeleteProduct extends PageObject {
    //Click Button Delete
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[2]/button[3]")
    WebElement ButtonDelete;
    public void clickButtonDelete(){
        ButtonDelete.click();
    }
    //Click Button Hapus
    @FindBy(xpath = "/html/body/div[2]/div/div[6]/button[1]")
    WebElement ButtonHapus;
    public void clickButtonHapus(){
        ButtonHapus.click();
    }
}