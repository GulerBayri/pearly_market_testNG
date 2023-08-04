package project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.PearlyMarketHomePage;
import project.pages.RegisterSignInAndSignOutPage;
import project.pages.customerpages.PMC_AddressPage;
import project.pages.customerpages.PMC_CartPage;
import project.pages.customerpages.PMC_CheckoutPage;
import project.pages.customerpages.PMC_OrderCompletePage;
import project.pages.vendorpages.PMV_MyAccountPage;
import project.pages.vendorpages.PMV_ProductsPage;
import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;

public class US_017_TC_17_User_should_be_able_to_shop_as_a_Vendor extends TestBase{

  

    @Test
    public void TC_17_User_should_be_able_to_shop_as_a_Vendor() {
    TestBase base = new TestBase();
    PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
    PMV_ProductsPage productPage = new PMV_ProductsPage();
    PMV_MyAccountPage myAccount = new PMV_MyAccountPage();
    PMC_AddressPage addressPage = new PMC_AddressPage();
    PMC_CartPage cartPage = new PMC_CartPage();
    PMC_CheckoutPage checkoutPage = new PMC_CheckoutPage();
    PMC_OrderCompletePage orderCompletePage=new PMC_OrderCompletePage();
    RegisterSignInAndSignOutPage registerSignInAndSignOutPage =new RegisterSignInAndSignOutPage();

        //1_Go to https://pearlymarket.com/
        ExtentReportsUtil.pass("go to https://pearlymarket.com/");
        base.goToTheUrl();
        // 2_ you should click on Sign In button as a vendor
        // 3_Enter the username/password
        // 4_click on sign in button
        ExtentReportsUtil.pass("click on sign in");
        base.signInVendor();
        // 5_click on My Account(but it is Sign Out Button)
        ExtentReportsUtil.pass("click on My Account");
        pearlyMarketHomePage.clickMyAccount();
        // 6_click on Orders
        ExtentReportsUtil.pass("click on Orders");
        myAccount.clickOrders();
        // 7_click on BROWSE PRODUCTS
        ExtentReportsUtil.pass("click on Browse Product");
        productPage.clickGoShopOrders();
        // 8_click on a product
        ExtentReportsUtil.pass("click on Product");
        productPage.clickProducts();
        // 9_click on ADD TO CART button
        ExtentReportsUtil.pass("click on Add to Cart");
        cartPage.clickAddToCartButton();
        // 10_click on Cart button
        ExtentReportsUtil.pass("clik on Cart");
        cartPage.clickGoToCartButton();
        // 11_validate image of product is visible
        productPage.validateImageOfProductIsVisible1();
        // 12_click on VIEW CART button
        ExtentReportsUtil.pass("click on VIEW CART");
        cartPage.clickViewCartButton();
        // 13_validate the product is visible in the cart list
        productPage.validateImageOfProductIsVisible2();
        //  14_click on PROCEED TO CHECKOUT
        ExtentReportsUtil.pass("click on PROCEED TO CHECKOUT");
        checkoutPage.clickCheckoutPage();
        // 15_enter first name and lastname
        ExtentReportsUtil.pass("enter first name and lastname");
        checkoutPage.setAddBillingFirstName();
        checkoutPage.setAddBillingLastName();
        // 16_enter country/region
        ExtentReportsUtil.pass("enter country/region");
        addressPage.selectCountryRegionBA();
        // 17_enter street address
        ExtentReportsUtil.pass("enter street address");
        checkoutPage.setAddBillingAddress();
        // 18_enter town/city
        ExtentReportsUtil.pass("enter town/city");
        checkoutPage.setAddBillingCity();
        // 19_enter state
        ExtentReportsUtil.pass("enter state");
        addressPage.selectStateDropDownBA();
        // 20_enter zip code
        ExtentReportsUtil.pass(" enter zip code");
        checkoutPage.setAddBillingPostCode();
        // 21_enter phone number
        ExtentReportsUtil.pass("enter phone number");
        checkoutPage.setAddBillingPhone();
        // 22_enter email address
        ExtentReportsUtil.pass("enter email address");
        checkoutPage.setAddBillingEmail();
        //  23_validate Total Amount is visible
        //  24_click all wire transfer/EFT,Pay at the door option radio buttons
        checkoutPage.verifyPaymentOptionsClickable();
        ExtentReportsUtil.pass("click Payment Options");
        checkoutPage.clickPaymentOptions();
        // 25_click on PLACE ORDER button
        ExtentReportsUtil.pass("click on PLACE ORDER");
        checkoutPage.clickPlaceOrderButton();
        // 26_validate that "shopping has been completed" is visible
        Assert.assertTrue(orderCompletePage.thankYouMessageIsVisible());
        // 27_click on My Account(Sign Out) button
        ExtentReportsUtil.pass("click on My Account(Sign Out)");
        registerSignInAndSignOutPage.signOut();
        // 28_click on ORDERS button
        ExtentReportsUtil.pass("click on Orders");
        myAccount.clickOrders();
       // 29_ validate the order is added the orders list
        myAccount.validateOrderIsCompleted();


        ExtentReportsUtil.takeSchreenshotsExtentReports();
    }
}