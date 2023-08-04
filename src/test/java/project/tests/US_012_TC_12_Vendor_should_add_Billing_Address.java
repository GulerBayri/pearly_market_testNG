
package project.tests;

import org.testng.annotations.Test;
import project.pages.PearlyMarketHomePage;
import project.pages.customerpages.PMC_MyAccountPage;
import project.pages.vendorpages.PMV_AddressPage;
import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;

public class US_012_TC_12_Vendor_should_add_Billing_Address extends TestBase{

    @Test
    public void TC_12_Vendor_should_add_Billing_Address() {
    TestBase base = new TestBase();
    PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
    PMC_MyAccountPage myAccountPage = new PMC_MyAccountPage();
    PMV_AddressPage addressPage = new PMV_AddressPage();


        //1_Go to https://pearlymarket.com/
        base.signInVendor();
        ExtentReportsUtil.pass("1_Go to https://pearlymarket.com/");
        //click on my account
        pearlyMarketHomePage.clickMyAccount();
        ExtentReportsUtil.pass("click on my account");
        //click on addresses
       myAccountPage.clickAddresses();
        ExtentReportsUtil.pass("click on addresses");
        //click on add (billing address)
        addressPage.clickaddForBillingAddress();
        ExtentReportsUtil.pass("/click on add (billing address)");
        //enter first name and password
        addressPage.enterFirstNamePasswordBA();
        ExtentReportsUtil.pass("enter first name and password");
        //select country region
        addressPage.selectCountryRegionBA();
        ExtentReportsUtil.pass("select country region");
        //enter street address
        addressPage.enterStreetAddressBA();
        ExtentReportsUtil.pass("enter street address");
        //enter town city
        addressPage.enterTownCityBA();
        ExtentReportsUtil.pass("enter town city");
        //enter state drop down
        addressPage.selectStateDropDownBA();
        ExtentReportsUtil.pass("enter state drop down");
        //enter zip code
        addressPage.enterZipCodeBA();
        ExtentReportsUtil.pass("enter zip code");
        //enter phone number
        addressPage.enterPhoneNumberBA();
        ExtentReportsUtil.pass("enter phone number");
        addressPage.clickSaveAddressButtonBA();
        addressPage.validateAddressAddedBA();


        ExtentReportsUtil.takeSchreenshotsExtentReports();
    }
  
}
