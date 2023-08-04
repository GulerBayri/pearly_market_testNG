package project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.PearlyMarketHomePage;
import project.pages.vendorpages.PMV_MyAccountPage;
import project.pages.vendorpages.PMV_ProductsPage;
import project.pages.vendorpages.PMV_StoreManagerPage;
import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;

public class US_015_TC_15_User_should_be_able_to_see_the_options_to_add_items_as_a_Vendor extends TestBase{
   

    @Test
    public void TC_15_User_should_be_able_to_see_the_options_to_add_items_as_a_Vendor(){
    TestBase base = new TestBase();
    PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
    PMV_ProductsPage productPage = new PMV_ProductsPage();
    PMV_MyAccountPage myAccount = new PMV_MyAccountPage();
    PMV_StoreManagerPage storeManagerPage = new PMV_StoreManagerPage();

        //1_Go to https://pearlymarket.com/
        //2_Vendor should sign in as Vendor.
        ExtentReportsUtil.pass("sign in as Vendor");
        base.signInVendor();
        //3_Vendor should follow and click these steps: My Account > Store Manager > Product > Add New
        ExtentReportsUtil.pass("go on My Account");
        pearlyMarketHomePage.clickMyAccount();
        ExtentReportsUtil.pass("click on Store Manager");
        myAccount.clickStoreManager();
        ExtentReportsUtil.pass("click on Product");
        storeManagerPage.clickProducts();
        ExtentReportsUtil.pass("click on Add New Button");
        productPage.clickAddNewButton();
        //4_Vendor  should have all menus, "Inventory, Shipping, Attributes, Linked, Seo, Advanced" visible and pass them by clicking "continue" button.
        Assert.assertTrue(productPage.inventoryIsVisible());
        Assert.assertTrue(productPage.shippingIsVisible());
        Assert.assertTrue(productPage.attributesIsVisible());
        Assert.assertTrue(productPage.linkedIsVisible());
        Assert.assertTrue(productPage.SEOIsVisible());
        Assert.assertTrue(productPage.AdvancedIsVisible());
        //5_By clicking Inventory menu, Vendor should enter: SKU, Manage Stock, Stock status, Sold Individually values.
       ExtentReportsUtil.pass("click on Inventory");
        productPage.clickInventory();
        ExtentReportsUtil.pass("Enter SKU");
        productPage.enterSKU("TV");
        productPage.clickManageStockCheckBoxIfSelected();
        productPage.clickManageStockCheckBoxIfNotSelected();
        ExtentReportsUtil.pass("enter StockQty");
        productPage.enterStockQty(9);
        productPage.selectAllowBackOrder("Allow");
        productPage.clickSoldIndividuallyButton();
        //6_By clicking Shipping menu, Vendor should enter: Weight, Dimensions, Shipping class, Processing Time values
        ExtentReportsUtil.pass("click Shipping");
        productPage.clickShipping();
        ExtentReportsUtil.pass("enter Weight");
        productPage.enterWeight(8);
        ExtentReportsUtil.pass("enter Lenght");
        productPage.enterLength(9);
        ExtentReportsUtil.pass("enter Widht");
        productPage.enterWidth(3);
        ExtentReportsUtil.pass("enter Height");
        productPage.enterHeight(7);
        ExtentReportsUtil.pass("select Shiping class");
        productPage.selectShippingClass("No shipping class");
        ExtentReportsUtil.pass("select Processing time");
        productPage.selectProcessingTime("1-2 weeks");
        //7_ By clicking Attributes menu, Vendor should  enter: Color and Size values
        ExtentReportsUtil.pass("click Attributes");
        productPage.clickAttributes();
        productPage.clickAttributeColor();
        ExtentReportsUtil.pass("select Attributes color");
        productPage.selectAttributeColor("Green");
        ExtentReportsUtil.pass("click Attributes Size");
        productPage.clickAttributeSize();
        productPage.selectAttributeSize("44");

        ExtentReportsUtil.takeSchreenshotsExtentReports();
    }
}
