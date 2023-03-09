package base;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseHomeTests {
    private WebDriver driver;
    protected LoginPage loginPage;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test.boniantech.com/vendorhub/#/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        loginPage.setUserName("vendor1");
        loginPage.setPassword("6666");
        loginPage.login();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
