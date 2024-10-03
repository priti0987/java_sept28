package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

@FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement lnkaccount;
@FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement lnkRegister;

public void clickMyAccount(){
 lnkaccount.click();
}
public void clickRegistration(){
    lnkRegister.click();
}

}
