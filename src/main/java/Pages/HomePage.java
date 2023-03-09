package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By basicInfoPage =By.xpath("//span[contains(text(),'Basic Info')]");
    private By activitesPage =By.xpath("//span[contains(text(),'Activities')]");
    private By previousProjectsPage =By.xpath("//span[contains(text(),'Previous Projects')]");
    public HomePage (WebDriver driver){
        this.driver = driver;
    }
    public BasicInfoPage openBasicInfoPage(){
        driver.findElement(basicInfoPage).click();
        return new BasicInfoPage(driver);
    }
    public ActivitesPage openActivitesPage(){
        driver.findElement(activitesPage).click();
        return new ActivitesPage(driver);
    }
    public PreviousProjectsPage previousProjectsPage(){
        driver.findElement(previousProjectsPage).click();
        return new PreviousProjectsPage(driver);
    }
}
