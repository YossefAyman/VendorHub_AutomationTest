package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PreviousProjectsPage {
    private WebDriver driver;
    private By addButton = By.xpath("//span[contains(text(),'Add')]");
    private By projectNameAR = By.id("titleAr");
    private By projectNameEN = By.id("titleEn");
    private By orgName = By.xpath("//*[@id=\"multiple-column-form\"]/div/div/div/form/div[2]/div[1]/div/ng-select/div/div/div[2]/input");
    private By org1 = By.xpath("//span[normalize-space()='org 1']");
    private By amount = By.id("amount");
    private By deliveryYear = By.id("deliveryYear");
    private By descriptionAr = By.id("descriptionAr");
    private By descriptionEn = By.id("descriptionEn");
    private By saveButton = By.xpath("//button[@type='submit']");
    private By deleteButton = By.xpath("//*[@id=\"multiple-column-form\"]/div/div/div/form/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[1]/datatable-body-row/div[2]/datatable-body-cell[5]/div/div/a[1]");
    public PreviousProjectsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnAddButton(){
        driver.findElement(addButton).click();
    }
    public void addNewProject() throws InterruptedException {
        driver.findElement(projectNameAR).sendKeys("1050");
        driver.findElement(projectNameEN).sendKeys("1060");
        driver.findElement(orgName).click();
        driver.findElement(org1).click();
        driver.findElement(deliveryYear).sendKeys("2000");
        driver.findElement(amount).sendKeys("1070");
        driver.findElement(descriptionAr).sendKeys("1080");
        driver.findElement(descriptionEn).sendKeys("1090");
        driver.findElement(saveButton).click();
    }
    public void deleteProject(){
        driver.findElement(deleteButton).click();
    }
}
