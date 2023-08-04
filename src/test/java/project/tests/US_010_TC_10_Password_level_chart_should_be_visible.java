package project.tests;

import org.testng.annotations.Test;
import project.pages.BasePage;
import project.pages.PearlyMarketHomePage;
import project.pages.RegisterSignInAndSignOutPage;
import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;
import project.utilities.WaitUtils;

public class US_010_TC_10_Password_level_chart_should_be_visible extends TestBase{

    @Test
    public void TC_10_Password_level_chart_should_be_visible() {
    TestBase base = new TestBase();
    PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
    RegisterSignInAndSignOutPage registerSignInAndSignOutPage = new RegisterSignInAndSignOutPage();

        //10_10_Go to https://pearlymarket.com/
        base.goToTheUrl();
        ExtentReportsUtil.pass("1_Click on sign in link");
        pearlyMarketHomePage.clickRegisterLink();
        ExtentReportsUtil.pass("2_Click on register link");
        registerSignInAndSignOutPage.clickBecomeVendorLink();
        ExtentReportsUtil.pass("3_Click on bebome vendor link");
        registerSignInAndSignOutPage.enterPasswordLevelChartTooShort();
        ExtentReportsUtil.pass("4_enterPasswordLevelChartTooShort");
        WaitUtils.waitFor(2);
        registerSignInAndSignOutPage.enterPasswordLevelChartWeak();
        ExtentReportsUtil.pass("5_enterPasswordLevelChartWeak");
        WaitUtils.waitFor(2);
        registerSignInAndSignOutPage.enterPasswordLevelChartGood();
        ExtentReportsUtil.pass("6_enterPasswordLevelChartGood");
        WaitUtils.waitFor(2);
        registerSignInAndSignOutPage.enterPasswordLevelChartStrong();
        ExtentReportsUtil.pass("7_enterPasswordLevelChartStrong");
        WaitUtils.waitFor(2);

        ExtentReportsUtil.takeSchreenshotsExtentReports();
    }
}
