package project.tests;

import org.testng.annotations.Test;
import project.pages.customerpages.PMC_CartPage;
import project.pages.customerpages.PMC_CheckoutPage;
import project.pages.customerpages.PMC_OrderCompletePage;
import project.pages.customerpages.PMC_WishListPage;
import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;

import static org.testng.Assert.assertTrue;

public class US_008_TC_08_User_should_be_able_to_add_selected_items_to_Wishlist extends TestBase{
    @Test
    public void TC_08_User_should_be_able_to_add_selected_items_to_Wishlist(){
    TestBase base = new TestBase();
    PMC_WishListPage wishListPage = new PMC_WishListPage();
    PMC_CheckoutPage checkoutPage = new PMC_CheckoutPage();
    PMC_CartPage cartPage = new PMC_CartPage();
    PMC_OrderCompletePage orderCompletePage = new PMC_OrderCompletePage();

        base.signInCustomer();
        ExtentReportsUtil.pass("1_signInCustomer");
        wishListPage.clickOnWishListIconTopRight();
        ExtentReportsUtil.pass("2_clickOnWishListIconTopRight");
        wishListPage.clickOnGoShopButton();
        ExtentReportsUtil.pass("3_clickOnGoShopButton");
        wishListPage.hoverOverProduct();
        ExtentReportsUtil.pass("4_hoverOverProduct");
        wishListPage.clickOnWishListIconProduct();
        ExtentReportsUtil.pass("5_clickOnWishListIconProduct");
        wishListPage.clickOnWishListIconTopRight();
        ExtentReportsUtil.pass("6_clickOnWishListIconTopRight");
        wishListPage.validateWishListIsNotEmpty();
        ExtentReportsUtil.pass("7_validateWishListIsNotEmpty");
        wishListPage.validateQuickViewButtonIsEnabled();
        ExtentReportsUtil.pass("8_validateQuickViewButtonIsEnabled");
        wishListPage.clickOnAddToCartButton();
        ExtentReportsUtil.pass("9_clickOnAddToCartButton");
        cartPage.clickGoToCartButton();
        ExtentReportsUtil.pass("10_clickGoToCartButton");
        wishListPage.clickOnCheckOutButton();
        ExtentReportsUtil.pass("11_clickOnCheckOutButton");
        checkoutPage.clickPlaceOrderButton();
        ExtentReportsUtil.pass("12_clickPlaceOrderButton");
        assertTrue(orderCompletePage.thankYouMessageIsVisible());
        ExtentReportsUtil.pass("13_validate thank You Message IsVisible");

        ExtentReportsUtil.takeSchreenshotsExtentReports();

    }

}
