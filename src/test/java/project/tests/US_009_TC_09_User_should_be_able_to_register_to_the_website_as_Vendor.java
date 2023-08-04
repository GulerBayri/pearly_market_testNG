package project.tests;
import org.testng.annotations.Test;
import project.pages.PearlyMarketHomePage;
import project.pages.RegisterSignInAndSignOutPage;
import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;

public class US_009_TC_09_User_should_be_able_to_register_to_the_website_as_Vendor extends TestBase{


    @Test
    public void TC_09_User_should_be_able_to_register_to_the_website_as_Vendor() {
    TestBase base = new TestBase();
    PearlyMarketHomePage homePage = new PearlyMarketHomePage();
    RegisterSignInAndSignOutPage registerSignInAndSignOutPage = new RegisterSignInAndSignOutPage();

        //go to the url
        base.goToTheUrl();
        ExtentReportsUtil.pass("1_go to the url");
        //click on register link
        homePage.clickRegisterLink();
        ExtentReportsUtil.pass("2_Click on sign in link");
        //enter credentials
        registerSignInAndSignOutPage.enterCredentialsVendorSignUp();
        ExtentReportsUtil.pass("3_enter credentials");
        //validate registration as a vendor is successful
        registerSignInAndSignOutPage.validateRegistrationAsVendorSuccessful();
        ExtentReportsUtil.pass("4_validate registration as a vendor is successful");
        //validate after registration pearly market image for home page is visible
        registerSignInAndSignOutPage.validateAfterRegistrationPearlyImageforHomePageIsVisible();
        ExtentReportsUtil.pass("5_validate after registration pearly market image for home page is visible");
        ExtentReportsUtil.takeSchreenshotsExtentReports();

    }

}
