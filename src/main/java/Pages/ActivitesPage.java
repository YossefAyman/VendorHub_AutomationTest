package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivitesPage {
    private WebDriver driver;
    private By saveButton = By.xpath("//button[contains(text(),'Save')]");

    public ActivitesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnSaveButton() {
        driver.findElement(saveButton).click();
    }
}
