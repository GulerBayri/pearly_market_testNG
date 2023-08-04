package project.tests;
import org.testng.annotations.Test;
import project.pages.PearlyMarketHomePage;
import project.pages.customerpages.PMC_AddressPage;
import project.pages.customerpages.PMC_MyAccountPage;
import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;

public class US_004_TC_04_User_should_add_Shipping_Address extends TestBase{
   
    @Test
    public void TC_04_User_should_add_Shipping_Address() {
    TestBase base = new TestBase();
    PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
    PMC_MyAccountPage myAccountPage = new PMC_MyAccountPage();
    PMC_AddressPage addressPage = new PMC_AddressPage();

        //1_Go to https://pearlymarket.com/
        base.signInCustomer();
        ExtentReportsUtil.pass("1_Go to https://pearlymarket.com/");
        //click on my account
        pearlyMarketHomePage.clickMyAccount();
        ExtentReportsUtil.pass("2_clickMyAccount");

        //click on addresses
        myAccountPage.clickAddresses();
        ExtentReportsUtil.pass("3_clickAddresses");

        //click on add for shipping address
        addressPage.clickaddForShippingAddress();
        ExtentReportsUtil.pass("4_clickaddForShippingAddress");

        //enter first name
        addressPage.enterFirstNamePasswordSH();
        ExtentReportsUtil.pass("5_enterFirstNamePasswordSH");
        //select country region
        addressPage.selectCountryRegionSH();
        ExtentReportsUtil.pass("6_selectCountryRegionSH");
        //enter street address
        addressPage.enterStreetAddressSH();
        ExtentReportsUtil.pass("7_enterStreetAddressSH");
        //enter town city
        addressPage.enterTownCitySH();
        ExtentReportsUtil.pass("8_enterTownCitySH");
        //select state drop down
        addressPage.selectStateDropDownSH();
        ExtentReportsUtil.pass("9_selectStateDropDownSH");
        //enter zip code
        addressPage.enterZipCodeSH();
        ExtentReportsUtil.pass("10_enterZipCodeSH");
        //click save address button
        addressPage.clickSaveAddressButtonSH();
        ExtentReportsUtil.pass("11_clickSaveAddressButtonSH");
        //validate address added
        addressPage.validateAddressAddedSH();
        ExtentReportsUtil.pass("//12_validateAddressAddedSH");

        ExtentReportsUtil.takeSchreenshotsExtentReports();
    }
}