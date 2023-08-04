package project.tests;

import org.testng.annotations.Test;
import project.pages.PearlyMarketHomePage;
import project.pages.RegisterSignInAndSignOutPage;
import project.pages.customerpages.PMC_CartPage;
import project.pages.customerpages.PMC_CheckoutPage;
import project.pages.vendorpages.PMV_CouponsPage;
import project.pages.vendorpages.PMV_MyAccountPage;
import project.pages.vendorpages.PMV_ProductsPage;
import project.pages.vendorpages.PMV_StoreManagerPage;
import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;

public class US_020_TC_20_User_should_be_able_to_shop_as_a_Vendor_with_the_created_Coupon extends TestBase {

    @Test
    public void TC_20_User_should_be_able_to_shop_as_a_Vendor_with_the_created_Coupon() {
        TestBase base = new TestBase();
        PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
        PMV_ProductsPage productsPage = new PMV_ProductsPage();
        PMC_CartPage cartPage = new PMC_CartPage();
        ExtentReportsUtil extentReportsUtil = new ExtentReportsUtil();
        PMV_MyAccountPage myAccountPage = new PMV_MyAccountPage();
        PMV_CouponsPage couponPage = new PMV_CouponsPage();
        PMV_StoreManagerPage storeManagerPage = new PMV_StoreManagerPage();
        RegisterSignInAndSignOutPage registerSignInAndSignOutPage = new RegisterSignInAndSignOutPage();

        //get coupon code from vendor account
        base.signInVendor();
        pearlyMarketHomePage.clickMyAccount();
        //click store manager
        myAccountPage.clickStoreManager();
        storeManagerPage.clickCoupons();
        String couponCodeDynamic = couponPage.getCouponCodeDynamic();
        System.out.println(couponCodeDynamic);
        registerSignInAndSignOutPage.signOut();
        registerSignInAndSignOutPage.logOut();


        //1_Go to https://pearlymarket.com/
        //2_ you should click on Sign In button as a vendor
        extentReportsUtil.pass("you should click on Sign In button as a vendor");
        base.signInVendor();
        //click on My Account(but it is Sign Out Button)
        extentReportsUtil.pass("click on My Account(but it is Sign Out Button)");
        pearlyMarketHomePage.clickMyAccount();
        //click on Orders
        extentReportsUtil.pass("click on Orders");
        myAccountPage.clickOrders();
        //click on BROWSE PRODUCTS
        productsPage.clickGoShopOrders();
        //click on a product
        extentReportsUtil.pass("click on a product");
        productsPage.clickProducts();
        //click on ADD TO CART button
        extentReportsUtil.pass("click on ADD TO CART button");
        cartPage.clickAddToCartButton();
        //click on Cart button
        extentReportsUtil.pass("click on Cart button");
        cartPage.clickGoToCartButton();
        //click on VIEW CART button
        extentReportsUtil.pass("click on VIEW CART button");
        cartPage.clickViewCartButton();
        //enter the coupon code
        extentReportsUtil.pass("enter the coupon code");
        cartPage.setYourCouponCode(couponCodeDynamic);
        //click on APPLY COUPON button
        extentReportsUtil.pass("click on APPLY COUPON button");
        cartPage.clickApplyCoupon();
        //validate the coupon is accepted
        //bug
        cartPage.validateCouponIsAccepted();


        ExtentReportsUtil.takeSchreenshotsExtentReports();
    }

}
