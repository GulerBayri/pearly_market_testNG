package project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.BasePage;
import project.pages.PearlyMarketHomePage;
import project.pages.RegisterSignInAndSignOutPage;
import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;

public class US_011_TC_11_User_should_be_able_to_sign_in_as_a_vendor extends TestBase{
    @Test
    public void TC_11_User_should_be_able_to_sign_in_as_a_vendor() {
    TestBase base = new TestBase();
    PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
    RegisterSignInAndSignOutPage registerSignInAndSignOutPage = new RegisterSignInAndSignOutPage();


        //11_11_Go to https://pearlymarket.com/
        base.goToTheUrl();
        ExtentReportsUtil.pass("1_Go to https://pearlymarket.com/");
        pearlyMarketHomePage.clickSignInLink();
        ExtentReportsUtil.pass("2_Click on sign in link");
        registerSignInAndSignOutPage.enterSignInUserNameVendor();
        ExtentReportsUtil.pass("3_enter username of vendor");
        registerSignInAndSignOutPage.enterSignInPasswordVendor();
        ExtentReportsUtil.pass("4_enter sign in password of vendor");
        registerSignInAndSignOutPage.clickSignInButtonVendor();
        ExtentReportsUtil.pass("5_Click on sign button");
        pearlyMarketHomePage.clickMyAccount();

        // There should be My Account Page under vendorpages to do assertion

        ExtentReportsUtil.takeSchreenshotsExtentReports();
    }
}
