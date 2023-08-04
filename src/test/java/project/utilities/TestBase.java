package project.utilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import project.pages.PearlyMarketHomePage;
import project.pages.RegisterSignInAndSignOutPage;

import static project.utilities.Driver.closeDriver;
public class TestBase {


    public void goToTheUrl(){
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_url"));
    }


    public  void signInCustomer(){
        PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
        RegisterSignInAndSignOutPage registerSignInAndSignOutPage = new RegisterSignInAndSignOutPage();

        //1_Go to https://pearlymarket.com/
        goToTheUrl();
        //2_click on sign in link
        pearlyMarketHomePage.clickSignInLink();
        //3_enter username

        registerSignInAndSignOutPage.enterSignInUserNameCustomer();
        //4_enter password
        registerSignInAndSignOutPage.enterSignInPasswordCustomer();
        //5_click on sign in button
        registerSignInAndSignOutPage.clickSignInButtonCustomer();
        //   WaitUtils.waitForPageToLoad(10);
    }

    public void signInVendor(){
        PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
        RegisterSignInAndSignOutPage registerSignInAndSignOutPage = new RegisterSignInAndSignOutPage();

        //1_Go to https://pearlymarket.com/
        goToTheUrl();
        //2_click on sign in link
        pearlyMarketHomePage.clickSignInLink();
        //3_enter username
        registerSignInAndSignOutPage.enterSignInUserNameVendor();
        //4_enter password
        registerSignInAndSignOutPage.enterSignInPasswordVendor();
        //5_click on sign in button
        registerSignInAndSignOutPage.clickSignInButtonVendor();
        WaitUtils.waitFor(3);
    }

    public void signUpCustomer(){
        PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
        RegisterSignInAndSignOutPage registerSignInAndSignOutPage = new RegisterSignInAndSignOutPage();

        //1_Go to https://pearlymarket.com/
        goToTheUrl();
        //2_click on sign up link
        pearlyMarketHomePage.clickRegisterLink();
        //3_enter username
        registerSignInAndSignOutPage.enterSignUpUserName();
        //4_enter email
        registerSignInAndSignOutPage.enterSignUpUserEmail();
        //5_enter password
        registerSignInAndSignOutPage.enterSignUpPassword();
        //6_click on agree checkbox
        registerSignInAndSignOutPage.clickAgreeCheckBox();
        //7_click on sign up button
        registerSignInAndSignOutPage.clickSignUpButton();
    }

    public void signUpVendor(){
        PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
        RegisterSignInAndSignOutPage registerSignInAndSignOutPage = new RegisterSignInAndSignOutPage();

        //1_Go to https://pearlymarket.com/
        goToTheUrl();
        //2_click on sign up link
        pearlyMarketHomePage.clickRegisterLink();
        //enter credentials
        registerSignInAndSignOutPage.enterCredentialsVendorSignUp();
        Driver.getDriver().navigate().to(ConfigReader.getProperty("pearlyMarket_url"));
    }


    @AfterMethod
    public void tearDown(){
        WaitUtils.waitFor(2);
        closeDriver();
    }
}
