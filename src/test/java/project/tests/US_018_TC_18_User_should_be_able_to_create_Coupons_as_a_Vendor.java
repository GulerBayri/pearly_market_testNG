package project.tests;

import org.testng.annotations.Test;
import project.pages.PearlyMarketHomePage;
import project.pages.RegisterSignInAndSignOutPage;
import project.pages.vendorpages.PMV_CouponsPage;
import project.pages.vendorpages.PMV_MyAccountPage;
import project.pages.vendorpages.PMV_ProductsPage;
import project.pages.vendorpages.PMV_StoreManagerPage;
import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;

import static org.testng.AssertJUnit.assertEquals;


public class US_018_TC_18_User_should_be_able_to_create_Coupons_as_a_Vendor extends TestBase{

    @Test
    public void TC_18_User_should_be_able_to_create_Coupons_as_a_Vendor() {
    TestBase base = new TestBase();
    PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
    PMV_MyAccountPage myAccountPage = new PMV_MyAccountPage();
    RegisterSignInAndSignOutPage registerSignInAndSignOutPage = new RegisterSignInAndSignOutPage();
    PMV_StoreManagerPage storeManagerPage = new PMV_StoreManagerPage();
    PMV_CouponsPage couponsPage = new PMV_CouponsPage();



        //1_Go to https://pearlymarket.com/
        base.signInVendor();
        ExtentReportsUtil.pass("1_Go to https://pearlymarket.com/");
        //click on my account
        pearlyMarketHomePage.clickMyAccount();
        ExtentReportsUtil.pass("click on my account");
        //click on My Account(but it is Sign Out Button)
        registerSignInAndSignOutPage.signOut();
        ExtentReportsUtil.pass("click on My Account(but it is Sign Out Button)");
        //click on Store Manager
        myAccountPage.clickStoreManager();
        ExtentReportsUtil.pass("click on Store Manager");
        //hover over Coupons
        storeManagerPage.hoverOverCupons();
        ExtentReportsUtil.pass("hover over Coupons");
        //click on Add New
        couponsPage.clickCouponsAddNew();
        ExtentReportsUtil.pass("click on Add New");
        //enter the code
        couponsPage.addCouponCode();
   //  String couponCode = couponsPage.getCouponCode();
        ExtentReportsUtil.pass("enter the code");
        //enter the description
        couponsPage.enterDescriptionCoupon("Have fun with the coupon");
        ExtentReportsUtil.pass("enter the description");
        //11_select fixed product discount
        couponsPage.selectDiscountType("Fixed Product Discount");
        ExtentReportsUtil.pass("select fixed product discount");
        //12_enter the coupon amount
        couponsPage.addDiscountAmount();
        ExtentReportsUtil.pass("enter the coupon amount");
        //13_enter the coupon expiration date
        couponsPage.setCouponExpiryDate();
        ExtentReportsUtil.pass("enter the coupon expiration date");
        //validate the "allow free shipping" and "show on store" checkboxs are clickable
        ExtentReportsUtil.pass("validate the \"allow free shipping\" and \"show on store\" checkboxs are clickable");
        //click on submit button
        couponsPage.clickSubmitNewCoupon();
        ExtentReportsUtil.pass("click on submit button");
        //validate "Edit Coupon" is visible
        couponsPage.validateEditCouponIsVisible();
        ExtentReportsUtil.pass("validate \"Edit Coupon\" is visible");
        //click on Coupons button again
        storeManagerPage.clickCoupons();
        ExtentReportsUtil.pass("click on Coupons button again");
        ///validate coupon/s is/are visible
        couponsPage.displayCouponEditButton();
        ExtentReportsUtil.pass("validate coupon/s is/are visible");

        ExtentReportsUtil.takeSchreenshotsExtentReports();


    }
}
