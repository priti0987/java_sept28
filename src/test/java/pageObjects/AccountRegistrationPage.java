package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
    WebDriver driver;

    public AccountRegistrationPage(WebDriver driver){
        super(driver);
    }

@FindBy(xpath="//input[@id='input-firstname']")
    WebElement txtFirstname;
@FindBy(xpath="//input[@id='input-lastname']")
    WebElement txtLastname;
@FindBy(xpath="//input[@id='input-email']")
    WebElement txtEmail;
@FindBy(xpath="//input[@id='input-password']")
    WebElement txtPassword;
@FindBy(xpath="//input[@name='agree']")
    WebElement chkPolicy;
@FindBy(xpath="//button[@type='submit']")
    WebElement continueButton;
@FindBy(xpath = "//h1[normalise-space()='Your Account Has Been Created!']")
    WebElement msgConfirmation;

public void setFirstname(String fname)
    {
        txtFirstname.sendKeys(fname);
    }
    public void setLastname(String lname)
    {
        txtLastname.sendKeys(lname);
    }
    public void setEmail(String email)
    {
        txtEmail.sendKeys(email);
    }
    public void setPassword(String password)
    {
        txtPassword.sendKeys(password);
    }
    public void setPrivacyPolicy()
    {
        chkPolicy.click();
    }
    public void clickContinue()
    {
        continueButton.click();
    }

    public String getConfirmationMsg(){
    try{
    return (msgConfirmation.getText());
    }catch (Exception e){
    return (e.getMessage());
    }

    }


}
