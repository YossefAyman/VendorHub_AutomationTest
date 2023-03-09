package login;

import Pages.*;
import base.BaseHomeTests;
import base.BaseTests;
import org.testng.annotations.Test;

public class HomePageTests extends BaseHomeTests {

    @Test(priority = -1)
    public void openBasicInfoPage() throws InterruptedException {
        HomePage homePage = loginPage.login();
        homePage.openBasicInfoPage();
        Thread.sleep(2000);
    }
    @Test(priority = 0)
    public void openActivitesPage() throws InterruptedException{
        HomePage homePage = loginPage.login();
        homePage.openActivitesPage();
        Thread.sleep(2000);
    }
    @Test (priority = 1)
    public void openPreviousProjectsPage() throws InterruptedException{
        HomePage homePage = loginPage.login();
        homePage.previousProjectsPage();
        Thread.sleep(3000);
    }
}
