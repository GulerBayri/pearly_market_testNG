package project.tests;

import org.testng.annotations.Test;
import project.pages.PearlyMarketHomePage;
import project.pages.RegisterSignInAndSignOutPage;
import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;

public class US_002_TC_02_Registration_should_NOT_be_available_using_previously_registered_credentials extends TestBase {


    @Test
    public void TC_02_Registration_should_NOT_be_available_using_previously_registered_credentials() {
        TestBase base = new TestBase();
        PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
        RegisterSignInAndSignOutPage registerSignInAndSignOutPage = new RegisterSignInAndSignOutPage();

        //1_Go to https://pearlymarket.com/
        base.goToTheUrl();
        ExtentReportsUtil.pass("1_Go to https://pearlymarket.com/");
        //2_click on register
        pearlyMarketHomePage.clickRegisterLink();
        ExtentReportsUtil.pass("2_clickRegisterLink");
        //3_enter username
        registerSignInAndSignOutPage.enterSignUpUserNameNegative();
        ExtentReportsUtil.pass("3_enterSignUpUserNameNegative");
        //4_enter userEmail
        registerSignInAndSignOutPage.enterSignUpUserEmailNegative();
        ExtentReportsUtil.pass("4_enterSignUpUserEmailNegative");
        //5_enter password
        registerSignInAndSignOutPage.enterSignUpPasswordNegative();
        ExtentReportsUtil.pass("5_enterSignUpPasswordNegative");
        //6_click on checkbox
        registerSignInAndSignOutPage.clickAgreeCheckBox();
        ExtentReportsUtil.pass("6_clickAgreeCheckBox");
        //7_click on register button
        registerSignInAndSignOutPage.clickSignUpButton();
        ExtentReportsUtil.pass("7_clickSignUpButton");
        //validate that "An account is already registered with your email address."
        registerSignInAndSignOutPage.validatePreviouslyRegisteredCredentialsIsnotPossible();
        ExtentReportsUtil.pass("validatePreviouslyRegisteredCredentialsIsnotPossible");

        ExtentReportsUtil.takeSchreenshotsExtentReports();
    }

}
