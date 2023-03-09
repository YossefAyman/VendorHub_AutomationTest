package login;

import Pages.*;
import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {
    //        HomePage homePage = loginPage.login();
//        BasicInfoPage basicInfoPage = homePage.openBasicInfoPage();
//        basicInfoPage.clickOnSaveButton();
//        ActivitesPage activitesPage = homePage.openActivitesPage();
//        activitesPage.clickOnSaveButton();
//        PreviousProjectsPage previousProjectsPage = homePage.previousProjectsPage();
//        previousProjectsPage.clickOnAddButton();
//        previousProjectsPage.addNewProject();
//        previousProjectsPage.deleteProject();
//        Thread.sleep(2000);
    @Test (priority = -1)
    public void testsuccessfulLogin() throws InterruptedException {
        loginPage.setUserName("vendor1");
        loginPage.setPassword("6666");
        loginPage.login();
        Thread.sleep(1000);
    }
    @Test (priority = 0)
    public void testUnSuccessfulLogin() throws InterruptedException {
        loginPage.setUserName("vendortest@mailto.plus");
        loginPage.setPassword("1010");
        loginPage.login();
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void testUnSuccessfulLogin1() throws InterruptedException {
        loginPage.setUserName("vendortest@mailto.plu");
        loginPage.setPassword("1010");
        loginPage.login();
        Thread.sleep(3000);
    }
}
