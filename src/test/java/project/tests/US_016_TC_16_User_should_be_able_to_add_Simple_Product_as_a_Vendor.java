package project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.PearlyMarketHomePage;
import project.pages.customerpages.PMC_MyAccountPage;
import project.pages.vendorpages.PMV_MyAccountPage;
import project.pages.vendorpages.PMV_ProductsPage;
import project.pages.vendorpages.PMV_StoreManagerPage;
import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;

public class US_016_TC_16_User_should_be_able_to_add_Simple_Product_as_a_Vendor extends TestBase{
    

    @Test
    public void TC_16_User_should_be_able_to_add_Simple_Product_as_a_Vendor () {
    TestBase base = new TestBase();
    PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
    PMV_ProductsPage product = new PMV_ProductsPage();
    PMV_MyAccountPage myAccount = new PMV_MyAccountPage();
    PMV_StoreManagerPage storeManagerPage = new PMV_StoreManagerPage();


        ExtentReportsUtil.pass("sign in like Vendor");
        base.signInVendor();
        ExtentReportsUtil.pass("clikc My Account ->Store Manager->Product->Add Product");
        pearlyMarketHomePage.clickMyAccount();
        myAccount.clickStoreManager();
        storeManagerPage.clickProducts();
        product.clickAddNewButton();
        //1 Simple Product should be default.
        ExtentReportsUtil.pass("Simple Product should be default");
       Assert.assertEquals("Simple Product", product.defaultSimpleProduct());
       //2 Virtual and Downloadable should be selectable.
        ExtentReportsUtil.pass("selectable Virtual and Downloable");
        product.selectVirtual();
        product.selectDownLoadable();
        //3 User should be able to write Price and Sale Price.
        ExtentReportsUtil.pass("enter Price");
        product.enterPrice(45);
        ExtentReportsUtil.pass("enter Sale Price");
        product.enterSalePrice(35);
        //4 User should be able to write Product Title.
        ExtentReportsUtil.pass("enter Product Title");
        product.writeProductTitle("TV");
        //5 User should be able to select categories
        ExtentReportsUtil.pass("select categories");
        product.selectCategories();
        //6 User should be able to see that the new product has been added in the Product section.
        ExtentReportsUtil.pass("click Draft");
        product.clickDraft();
        Assert.assertTrue(product.editProductIsVisible());


        ExtentReportsUtil.takeSchreenshotsExtentReports();

    }
}
