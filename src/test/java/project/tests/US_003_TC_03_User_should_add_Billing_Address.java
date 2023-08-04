
package project.tests;

import org.testng.annotations.Test;
import project.pages.PearlyMarketHomePage;
import project.pages.customerpages.PMC_MyAccountPage;
import project.pages.vendorpages.PMV_AddressPage;
import project.utilities.TestBase;
import project.pages.customerpages.PMC_AddressPage;

import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;

public class US_003_TC_03_User_should_add_Billing_Address extends TestBase {


    @Test
    public void TC_03_User_should_add_Billing_Address () {
        TestBase base = new TestBase();
        PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
        PMC_MyAccountPage myAccountPagePage = new PMC_MyAccountPage();
        PMV_AddressPage addressPage = new PMV_AddressPage();

        //1_Go to https://pearlymarket.com/
        base.signInCustomer();
        ExtentReportsUtil.pass("1_Go to https://pearlymarket.com/");
        //click on my account
        pearlyMarketHomePage.clickMyAccount();
        ExtentReportsUtil.pass("2_clickMyAccount");
        //click on addresses
        myAccountPagePage.clickAddresses();
        ExtentReportsUtil.pass("3_clickAddresses");
        //click on add (billing address)
        addressPage.clickaddForBillingAddress();
        ExtentReportsUtil.pass("4_clickaddForBillingAddress");
        //enter first name and password
        addressPage.enterFirstNamePasswordBA();
        ExtentReportsUtil.pass("5_enterFirstNamePasswordBA");
        //select country region
        addressPage.selectCountryRegionBA();
        ExtentReportsUtil.pass("6_selectCountryRegionBA");
        //enter street address
        addressPage.enterStreetAddressBA();
        ExtentReportsUtil.pass("7_enterStreetAddressBA");
        //enter town city
        addressPage.enterTownCityBA();
        ExtentReportsUtil.pass("8_enterTownCityBA");
        //enter state drop down
        addressPage.selectStateDropDownBA();
        ExtentReportsUtil.pass("9_selectStateDropDownBA");
        //enter zip code
        addressPage.enterZipCodeBA();
        ExtentReportsUtil.pass("10_enterZipCodeBA");
        //enter phone number
        addressPage.enterPhoneNumberBA();
        ExtentReportsUtil.pass("11_enterPhoneNumberBA");
        //click save address button
        addressPage.clickSaveAddressButtonBA();
        ExtentReportsUtil.pass("12_clickSaveAddressButtonBA");
        //validate address is added
        addressPage.validateAddressAddedBA();
        ExtentReportsUtil.pass("13_validateAddressAddedBA");

        ExtentReportsUtil.takeSchreenshotsExtentReports();

    }

}

