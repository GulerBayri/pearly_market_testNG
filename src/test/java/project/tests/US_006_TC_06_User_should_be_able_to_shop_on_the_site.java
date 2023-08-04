package project.tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import project.pages.customerpages.PMC_CartPage;
import project.pages.customerpages.PMC_CheckoutPage;
import project.pages.customerpages.PMC_OrderCompletePage;
import project.pages.customerpages.PMC_SearchPage;
import project.utilities.*;

public class US_006_TC_06_User_should_be_able_to_shop_on_the_site {
   @AfterClass
   public void tearDown(){
       Driver.closeDriver();
   }

    @Test
    public void signIn_as_customer(){
        TestBase testBase = new TestBase();
        testBase.goToTheUrl();
        testBase.signInCustomer();
        ExtentReportsUtil.pass("1_signInCustomer");
        WaitUtils.waitFor(3);
    }

    @Test(dependsOnMethods = "signIn_as_customer",dataProvider = "productInfo",dataProviderClass = DataProviderClass.class)
    public void TC_06_User_should_be_able_to_shop_on_the_site1(String product){
        PMC_SearchPage searchPage = new PMC_SearchPage();

        searchPage.searchItem(product);
        ExtentReportsUtil.pass("searchItem" + product);
        searchPage.clickSearchButton();
        ExtentReportsUtil.pass("clickSearchButton");
        searchPage.clickAddToCartButton();
        ExtentReportsUtil.pass("clickAddToCartButton");
    }

    @Test(dependsOnMethods = "TC_06_User_should_be_able_to_shop_on_the_site1")
    public void TC_06_User_should_be_able_to_shop_on_the_site2(){
        PMC_CartPage cartPage = new PMC_CartPage();

        cartPage.clickGoToCartButton();
        ExtentReportsUtil.pass("clickGoToCartButton");
        cartPage.clickViewCartButton();
        ExtentReportsUtil.pass("clickViewCartButton");
        cartPage.clickIncreaseButton();
        ExtentReportsUtil.pass("clickIncreaseButton");
        cartPage.clickDecreaseButton();
        ExtentReportsUtil.pass("clickDecreaseButton");
        cartPage.enterAmountOfItem("5");
        ExtentReportsUtil.pass("enterAmountOfItem");
        cartPage.clickCheckOutButton();
        ExtentReportsUtil.pass("enterAmountOfItem");
    }
    @Test(dependsOnMethods = "TC_06_User_should_be_able_to_shop_on_the_site2")
    public void TC_06_User_should_be_able_to_shop_on_the_site3(){
        PMC_CheckoutPage checkoutPage = new PMC_CheckoutPage();
        PMC_OrderCompletePage orderCompletePage = new PMC_OrderCompletePage();
        
        checkoutPage.setAddBillingFirstName();
        ExtentReportsUtil.pass("setAddBillingFirstName");
        checkoutPage.setAddBillingLastName();
        ExtentReportsUtil.pass("setAddBillingLastName");
        checkoutPage.selectCountry();
        ExtentReportsUtil.pass("selectCountry");
        checkoutPage.setAddBillingPostCode();
        ExtentReportsUtil.pass("setAddBillingPostCode");
        checkoutPage.selectState();
        ExtentReportsUtil.pass("selectState");
        checkoutPage.setAddBillingCity();
        ExtentReportsUtil.pass("setAddBillingCity");
        checkoutPage.setAddBillingAddress();
        ExtentReportsUtil.pass("setAddBillingAddress");
        checkoutPage.setAddBillingPhone();
        ExtentReportsUtil.pass("setAddBillingPhone");
        checkoutPage.setAddBillingEmail();
        ExtentReportsUtil.pass("setAddBillingEmail");
        checkoutPage.verifyPaymentOptionsClickable();
        ExtentReportsUtil.pass("verifyPaymentOptionsClickable");
        checkoutPage.clickPlaceOrderButton();
        ExtentReportsUtil.pass("clickPlaceOrderButton");
        orderCompletePage.thankYouMessageIsVisible();
        ExtentReportsUtil.pass("thankYouMessageIsVisible");
        ExtentReportsUtil.takeSchreenshotsExtentReports();
    }
}
