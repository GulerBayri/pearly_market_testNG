package project.tests;

import org.testng.annotations.Test;
import project.pages.PearlyMarketHomePage;
import project.pages.RegisterSignInAndSignOutPage;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;


public class US_001_TC_01_Customer_should_sign_up_as_a_user_on_the_website extends TestBase{

    @Test
    public void TC_01_Customer_should_sign_up_as_a_user_on_the_website() {
         TestBase base = new TestBase();
    PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
    RegisterSignInAndSignOutPage registerSignInAndSignOutPage = new RegisterSignInAndSignOutPage();

        //1_1_Go to https://pearlymarket.com/
        base.goToTheUrl();
        ExtentReportsUtil.pass("1_Go to https://pearlymarket.com/");
        //2_click on register link
        pearlyMarketHomePage.clickRegisterLink();
        ExtentReportsUtil.pass("2_click on register link");
        //3_enter sign up username
        registerSignInAndSignOutPage.enterSignUpUserName();
        ExtentReportsUtil.pass("3_enter sign up username");
        //4_enter sign up user email
        registerSignInAndSignOutPage.enterSignUpUserEmail();
        ExtentReportsUtil.pass("4_enter sign up user email");
        //5_enter sign up password
        registerSignInAndSignOutPage.enterSignUpPassword();
        ExtentReportsUtil.pass("5_enter sign up password");
        //6_click agree checkbox
        registerSignInAndSignOutPage.clickAgreeCheckBox();
        ExtentReportsUtil.pass("6_click agree checkbox");
        //7_click Sign up button
        registerSignInAndSignOutPage.clickSignUpButton();
        ExtentReportsUtil.pass("7_click Sign up button");

        ExtentReportsUtil.takeSchreenshotsExtentReports();

    }


}