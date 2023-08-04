package project.tests;
import org.testng.annotations.Test;
import project.pages.PearlyMarketHomePage;
import project.pages.customerpages.PMC_MyAccountPage;
import project.pages.vendorpages.PMV_AddressPage;
import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;

public class US_013_TC_13_Vendor_should_add_Shipping_Address extends TestBase{
    @Test
    public void TC_13_Vendor_should_add_Shipping_Address() {
    TestBase base = new TestBase();
    PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
    PMC_MyAccountPage myAccountPagePage = new PMC_MyAccountPage();
    PMV_AddressPage addressPage = new PMV_AddressPage();

        //1_Go to https://pearlymarket.com/
        base.signInVendor();
        ExtentReportsUtil.pass("1_Go to https://pearlymarket.com/");
        //click on my account
        pearlyMarketHomePage.clickMyAccount();
        ExtentReportsUtil.pass("click on my account");
        //click on addresses
        myAccountPagePage.clickAddresses();
        ExtentReportsUtil.pass("click on addresses");
        //click on add for shipping address
        addressPage.clickaddForShippingAddress();
        ExtentReportsUtil.pass("click on add for shipping address");
        //enter first name
        addressPage.enterFirstNamePasswordSH();
        ExtentReportsUtil.pass("enter first name");
        //select country region
        addressPage.selectCountryRegionSH();
        ExtentReportsUtil.pass("select country region");
        //enter street address
        addressPage.enterStreetAddressSH();
        ExtentReportsUtil.pass("enter street address");
        //enter town city
        addressPage.enterTownCitySH();
        ExtentReportsUtil.pass("enter town city");
        //select state drop down
        addressPage.selectStateDropDownSH();
        ExtentReportsUtil.pass("select state drop down");
        //enter zip code
        addressPage.enterZipCodeSH();
        ExtentReportsUtil.pass("enter zip code");
        //click save address button
        addressPage.clickSaveAddressButtonSH();
        ExtentReportsUtil.pass("click save address button");
        //validate address added
        addressPage.validateAddressAddedSH();
        ExtentReportsUtil.pass("validate address added/");

        ExtentReportsUtil.takeSchreenshotsExtentReports();

    }

}
