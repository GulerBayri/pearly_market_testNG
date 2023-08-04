package project.tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import project.pages.customerpages.PMC_ComparePage;
import project.pages.customerpages.PMC_SearchPage;
import project.utilities.*;

public class US_007_TC_07_User_should_be_able_to_compare_selected_items_Compare {

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
    public void TC_07_User_should_be_able_to_compare_selected_items_Compare(String product){
        PMC_SearchPage searchPage = new PMC_SearchPage();

        searchPage.searchItem(product);
        ExtentReportsUtil.pass("searchItem" + product);
        searchPage.clickSearchButton();
        ExtentReportsUtil.pass("clickSearchButton");
        searchPage.clickOnCompare();
        ExtentReportsUtil.pass("clickOnCompare");
    }
    @Test(dependsOnMethods = "TC_07_User_should_be_able_to_compare_selected_items_Compare")
    public void TC_07_User_should_be_able_to_compare_selected_items_Compare2(){
        PMC_SearchPage searchPage = new PMC_SearchPage();
        PMC_ComparePage comparePage = new PMC_ComparePage();

        comparePage.removeOneProductFromCompare();
        ExtentReportsUtil.pass("removeOneProductFromCompare");
        comparePage.clickstartCompareButton();
        ExtentReportsUtil.pass("clickstartCompareButton");
        searchPage.searchItem("Blue Ski Boots");
        ExtentReportsUtil.pass("searchItem : " + "Blue Ski Boots");
        searchPage.clickSearchButton();
        ExtentReportsUtil.pass("clickSearchButton");
        searchPage.clickOnCompare();
        ExtentReportsUtil.pass("clickOnCompare");
        comparePage.clickstartCompareButton();
        ExtentReportsUtil.pass("clickstartCompareButton");
        comparePage.validateThereAreCompareProducts();
        ExtentReportsUtil.pass("validateThereAreCompareProducts");
        comparePage.validateProductsVisible();
        ExtentReportsUtil.pass("validateProductsVisible");
        comparePage.validateProductsInStockCompareVisible();
        ExtentReportsUtil.pass("validateProductsInStockCompareVisible");
        comparePage.validateProductsDescriptionCompareVisible();
        ExtentReportsUtil.pass("validateProductsDescriptionCompareVisible");
        comparePage.validateProductsRatingsReviewsCompareVisible();
        ExtentReportsUtil.pass("validateProductsRatingsReviewsCompareVisible");
        comparePage.validateProductsSkuCompareVisible();
        ExtentReportsUtil.pass("validateProductsSkuCompareVisible");
        comparePage.validateProductsColorCompareVisible();
        ExtentReportsUtil.pass("validateProductsColorCompareVisible");
        comparePage.validateProductsSizeCompareVisible();
        ExtentReportsUtil.pass("validateProductsSizeCompareVisible");
        comparePage.removeOneByOneProductsFromCompare();
        ExtentReportsUtil.pass("removeOneByOneProductsFromCompare");
        ExtentReportsUtil.takeSchreenshotsExtentReports();
    }

}
