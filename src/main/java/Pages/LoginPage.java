package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userName = By.name("Username");
    private By password = By.name("Password");
    private By login = By.tagName(("button"));

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String setUserName) {
        driver.findElement(userName).sendKeys(setUserName);
    }

    public void setPassword(String setPassword) {
        driver.findElement(password).sendKeys(setPassword);
    }

    public HomePage login(){
        driver.findElement(login).click();
        return new HomePage(driver);
    }
}
