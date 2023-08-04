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

public class US_014_TC_14_User_should_be_able_to_see_the_options_to_add_items_as_a_Vendor_MyAccountStoreManager_Product_AddNew extends TestBase{
    
    @Test
    public void TC_14_User_should_be_able_to_see_the_options_to_add_items_as_a_Vendor(){
    TestBase base = new TestBase();
    PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
    PMV_ProductsPage productPage = new PMV_ProductsPage();
    PMV_MyAccountPage myAccount = new PMV_MyAccountPage();
    PMV_StoreManagerPage storeManagerPage = new PMV_StoreManagerPage();

        //1_Vendor should sign in as Vendor.
        base.signInVendor();
        ExtentReportsUtil.pass("1_Vendor should sign in as Vendor.");

        //2_ The user is on (My Account > Store Manager > Product > Add New) page.
        pearlyMarketHomePage.clickMyAccount();
        myAccount.clickStoreManager();
        storeManagerPage.clickProducts();
        productPage.clickAddNewButton();
        ExtentReportsUtil.pass("2_ The user is on (My Account > Store Manager > Product > Add New) page.");


        // 3_There should be Simple Product, Variable Product, Grouped Product, and External - Affiliate Product options.
        Assert.assertTrue(productPage.selectButtonForSimpleVariableGroupedExternalAffiliateProduct("Simple Product"));
        Assert.assertTrue(productPage.selectButtonForSimpleVariableGroupedExternalAffiliateProduct("Variable Product"));
        Assert.assertTrue(productPage.selectButtonForSimpleVariableGroupedExternalAffiliateProduct("Grouped Product"));
        Assert.assertTrue(productPage.selectButtonForSimpleVariableGroupedExternalAffiliateProduct("External/Affiliate Product"));
        ExtentReportsUtil.pass("3_There should be Simple Product, Variable Product, Grouped Product, and External - Affiliate Product options.");


        //4_Vendor should be able to add a product Photo.
        productPage.clickAddAProductButton();
        productPage.selectFilesToAddAProductPhoto("./IdeaProjects/TestNGProjectSucces/testData/airpod.jpg");
        productPage.selectFilesToAddAProductPhoto("./IdeaProjects/TestNGProjectSucces/testData/exerciseBand.jpg");
        productPage.selectFilesToAddAProductPhoto("./IdeaProjects/TestNGProjectSucces/testData/kindle.jpg");
        productPage.clickSelectButtonToAddProductPhoto();
        ExtentReportsUtil.pass("4_Vendor should be able to add a product Photo.");


        //5_Vendor should be able to write a Product Title, Short Description and Description.
        productPage.writeProductTitle("Computer");
      //  WebElement iframe= Driver.getDriver().findElement(By.xpath("//*[@id='excerpt_ifr']"));
        Driver.getDriver().switchTo().frame(0);
        productPage.writeShortDescription("Apple");
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().switchTo().frame(1);
        productPage.writeDescription("MacBook");
        Driver.getDriver().switchTo().defaultContent();
        ExtentReportsUtil.pass("5_Vendor should be able to write a Product Title, Short Description and Description.");




       // 6_Categories should be selectable.
          productPage.selectCategories();
         ExtentReportsUtil.pass("6_Categories should be selectable.");

      // 7_Vendor should be able to add New Categories.
          productPage.clickAddNewCategory();
          productPage.enterCategoryName("Cat food");
          productPage.selectParentCategory("Besin Takviyeleri");
          productPage.clickAddButtonToAddNewCategory();
         ExtentReportsUtil.pass("7_Vendor should be able to add New Categories.");
//        8_Product brands should be selectable.
         // productPage.selectProductBrands();
        ExtentReportsUtil.pass(" 8_Product brands should be selectable.");

//        9_Vendor should be able to add New Product brands.
          productPage.clickAddNewProductBrands();
          productPage.enterProductsBrandName("Catty");
          productPage.selectParentTaxonomy("Green Grass");
          productPage.clickAddButtonToAddNewProductBrands();
          ExtentReportsUtil.pass("9_Vendor should be able to add New Product brands.");

        ExtentReportsUtil.takeSchreenshotsExtentReports();

    }

}
