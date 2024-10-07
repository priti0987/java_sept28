package testCases;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class TC001 {

    public WebDriver driver;
    @BeforeClass
    void setup(){

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
    }
    @AfterClass
    void teardown(){

    }
    void verify_account_registration()
    {

    }
}
