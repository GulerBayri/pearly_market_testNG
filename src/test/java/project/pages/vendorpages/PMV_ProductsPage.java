package project.pages.vendorpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import project.pages.BasePage;
import project.utilities.JSUtils;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class PMV_ProductsPage extends BasePage {


    String userHome = System.getProperty("user.home");
    @FindBy(xpath = "//span[.='Add New']")
    private WebElement addNewButton;
    @FindBy(xpath = "//select[@id='product_type']")
    private WebElement selectButtonForSimpleVariableGroupedExternalAffiliateProduct;
    @FindBy(xpath = "//img[@id='featured_img_display']")
    private WebElement addAProductButton;

    @FindBy(xpath = "//button[.='Select Files']")
    private WebElement selectFiles;

    @FindBy(xpath = "//button[.='Select']")
    private WebElement selectButtonToAddAProduct;

    @FindBy(xpath = "//input[@id='pro_title']")
    private WebElement writeProductTitle;

    @FindBy(xpath = "//body[@data-id='excerpt']")
    private WebElement writeShortDescription;

    @FindBy(xpath = "//body[@data-id='description']")
    private WebElement writeDescription;

    @FindBy(xpath = "//ul[@id='product_cats_checklist']//input[@class='wcfm-checkbox checklist_type_product_cat wcfm_validation_failed']")
    private List<WebElement> selectCategories;

    @FindBy(xpath = "//p[text()='+Add new category']")
    private WebElement addNewCategory;

    @FindBy(xpath = "//input[@placeholder='Category Name']")
    private WebElement categoryName;


    @FindBy(xpath = "//select[@name='wcfm_new_parent_cat']")
    private WebElement parentCategoryDropdown;

    @FindBy(xpath = "//button[@data-taxonomy='product_cat']")
    private WebElement addButton;


    @FindBy(xpath = "//ul[@id='product_brand']//input[@type='checkbox']")
    private List<WebElement> selectProductBrands;

    @FindBy(xpath = "//p[text()='+Add new Product brands']")
    private WebElement addNewProductBrands;

    @FindBy(xpath = "//input[@id='wcfm_new_product_brand']")
    private WebElement productsBrandName;

    @FindBy(xpath = "//select[@name='wcfm_new_parent_product_brand']")
    private WebElement parentTaxonomyDropdown;

    @FindBy(xpath = "//button[@data-taxonomy='product_brand']")
    private WebElement addButtonForBrand;


    public void clickAddNewButton() {
        addNewButton.click();
    }

    public boolean selectButtonForSimpleVariableGroupedExternalAffiliateProduct(String visibleText) {
        Select select = new Select(selectButtonForSimpleVariableGroupedExternalAffiliateProduct);
        select.selectByVisibleText(visibleText);
        return true;
    }

    public void clickAddAProductButton() {
        addAProductButton.click();
    }


    public void selectFilesToAddAProductPhoto(String pathWithoutUserHome) {
        //  selectFiles.sendKeys(userHome + pathWithoutUserHome);
        JSUtils.setValueByJS(selectFiles, userHome + pathWithoutUserHome);
    }

    public void clickSelectButtonToAddProductPhoto() {
        selectButtonToAddAProduct.click();
    }

    public void writeProductTitle(String productTitle) {
        writeProductTitle.sendKeys(productTitle);
    }

    public void writeShortDescription(String shortDescription) {
        writeShortDescription.sendKeys(shortDescription);
    }

    public void writeDescription(String description) {
        writeDescription.sendKeys(description);
    }

    public void selectCategories() {
        for (WebElement w : selectCategories) {
            if (!w.isSelected()) {
                JSUtils.clickWithTimeoutByJS(w);
            }
        }
    }

    public void clickAddNewCategory() {

        JSUtils.clickWithTimeoutByJS(addNewCategory);
    }



    public void enterCategoryName(String category) {
        categoryName.sendKeys(category);
    }

    public void selectParentCategory(String visibleText) {
        Select select = new Select(parentCategoryDropdown);
        select.selectByVisibleText(visibleText);
    }

    public void clickAddButtonToAddNewCategory() {

        JSUtils.clickWithTimeoutByJS(addButton);
    }

    public void clickAddNewProductBrands() {
        JSUtils.clickWithTimeoutByJS(addNewProductBrands);
    }

    public void enterProductsBrandName(String productName) {
        productsBrandName.sendKeys(productName);

    }

    public void selectProductBrands() {
        for (WebElement w : selectProductBrands) {
            if (!w.isSelected()) {
                JSUtils.clickWithTimeoutByJS(w);
            }
        }
    }
    public void selectParentTaxonomy(String visibleText) {
        Select select = new Select(parentTaxonomyDropdown);
        select.selectByVisibleText(visibleText);
    }

    public void clickAddButtonToAddNewProductBrands() {

        JSUtils.clickWithTimeoutByJS(addButtonForBrand);
    }

    //Methods for TestCase 15

    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_inventory_head']")
    private WebElement inventory;
    @FindBy(xpath = "//div[.='Shipping']")
    private WebElement shipping;
    @FindBy(xpath = "//div[.='Attributes']")
    private WebElement attributes;

    @FindBy(xpath = "//div[.='Linked']")
    private WebElement linked;

    @FindBy(xpath = "//label[@class='wcfma fa-globe']")
    private WebElement seo;
    @FindBy(xpath = "//label[@class='wcfma fa-globe']")
    private WebElement advanced;

    @FindBy(xpath = "//input[@id='sku']")
    private WebElement sKU;
    @FindBy(xpath = "//input[@id='manage_stock']")
    private WebElement manageStock;
    @FindBy(xpath = "//input[@id='stock_qty']")
    private WebElement stockOty;

    @FindBy(xpath = "//select[@id='backorders']")
    private WebElement allowBackOrderDropdown;

    @FindBy(xpath = "//input[@id='sold_individually']")
    private WebElement soldIndividually;

    @FindBy(xpath = "//select[@id='stock_status']")
    private WebElement stockStatus;

    @FindBy(xpath = "//input[@id='weight']")
    private WebElement weight;

    @FindBy(xpath = "//input[@id='length']")
    private WebElement length;
    @FindBy(xpath = "//input[@id='width']")
    private WebElement width;

    @FindBy(xpath = "//input[@id='height']")
    private WebElement height;

    @FindBy(xpath = "//select[@id='shipping_class']")
    private WebElement shippingClass;

    @FindBy(xpath = "//select[@id='_wcfmmp_processing_time']")
    private WebElement processingTime;
    @FindBy(xpath = "//input[@id='attributes_is_active_1']")
    private WebElement attributeColor;

    @FindBy(xpath = "//select[@id='attributes_value_1']")
    private WebElement selectColor;

    @FindBy(xpath = "(//button[.='Select all'])[1]")
    private WebElement colorSelectAllButton;
    @FindBy(xpath = "(//button[.='Select none'])[1]")
    private WebElement colorSelectNoneButton;

    @FindBy(xpath = "(//button[.='Add New'])[1]")
    private WebElement colorAddNewButton;


    @FindBy(xpath = "//input[@id='attributes_is_visible_1']")
    private WebElement colorvisibleOnTheProductPage;

    @FindBy(xpath = "//input[@id='attributes_is_active_2']")
    private WebElement attributeSize;

    @FindBy(xpath = "//select[@id='attributes_value_2']")
    private WebElement selectSize;

    @FindBy(xpath = "(//button[.='Select all'])[2]")
    private WebElement sizeSelectAllButton;

    @FindBy(xpath = "(//button[.='Select none'])[2]")
    private WebElement sizeSelectNoneButton;
    @FindBy(xpath = "(//button[.='Add New'])[2]")
    private WebElement sizeAddNewButton;
    @FindBy(xpath = "//input[@id='attributes_is_visible_2']")
    private WebElement sizeVisibleOnTheProductPage;



    public boolean inventoryIsVisible() {
        inventory.isDisplayed();
        return true;
    }

    public boolean shippingIsVisible() {
        shipping.isDisplayed();
        return true;
    }


    public boolean attributesIsVisible() {
        attributes.isDisplayed();
        return true;
    }

    public boolean linkedIsVisible() {
        linked.isDisplayed();
        return true;
    }

    public boolean SEOIsVisible() {
        seo.isDisplayed();
        return true;
    }

    public boolean AdvancedIsVisible() {
        advanced.isDisplayed();
        return true;
    }





     public void clickInventory() {

         JSUtils.clickWithTimeoutByJS(inventory);
     }



    public void enterSKU(String sku) {
        sKU.sendKeys(sku);
    }

    public void clickManageStockCheckBoxIfNotSelected() {
        if (!manageStock.isSelected()) {
            JSUtils.clickWithTimeoutByJS(manageStock);
        }
    }

    public void clickManageStockCheckBoxIfSelected() {
        if (manageStock.isSelected()) {
            manageStock.click();
        }
    }


    public void enterStockQty(int num) {
        stockOty.sendKeys(num + "");

    }

    public void selectAllowBackOrder(String visibleText) {
        Select select = new Select(allowBackOrderDropdown);
        select.selectByVisibleText(visibleText);
    }

    public void clickSoldIndividuallyButton() {
        if (!soldIndividually.isSelected()) {
            JSUtils.clickWithTimeoutByJS(soldIndividually);

        }
    }

    public void selectStockStatus(String visibleText) {
        Select select = new Select(stockStatus);
        select.selectByVisibleText(visibleText);
    }

    public void clickShipping() {
        JSUtils.clickWithTimeoutByJS(shipping);
    }

    public void enterWeight(int num) {
        weight.sendKeys(num + "");

    }

    public void enterLength(int num) {
        length.sendKeys(num + "");

    }

    public void enterWidth(int num) {
        width.sendKeys(num + "");

    }

    public void enterHeight(int num) {
        height.sendKeys(num + "");

    }

    public void selectShippingClass(String visibleText) {
        Select select = new Select(shippingClass);
        select.selectByVisibleText(visibleText);
    }

    public void selectProcessingTime(String visibleText) {
        Select select = new Select(processingTime);
        select.selectByVisibleText(visibleText);
    }

    public void clickAttributes() {
        JSUtils.clickWithTimeoutByJS(attributes);
    }

    public void clickAttributeColor() {
        attributeColor.click();
    }

    public void selectAttributeColor(String visibleText) {
        Select select = new Select(selectColor);
        select.selectByVisibleText(visibleText);

    }

    public void clickColorSelectAllButton() {
        colorSelectAllButton.click();
    }

    public void clickColorSelectNoneButton() {
        colorSelectNoneButton.click();
    }

    public void clickColorAddNewButton() {
        colorAddNewButton.click();
    }

    public void clickColorVisibleOnTheProductPage() {
        colorvisibleOnTheProductPage.click();
    }

    public void clickAttributeSize() {
        attributeSize.click();
    }


    public void selectAttributeSize(String visibleText) {
        Select select = new Select(selectSize);
        select.selectByVisibleText(visibleText);

    }

    public void clickSizeSelectAllButton() {
        sizeSelectAllButton.click();
    }

    public void clickSizeSelectNoneButton() {

    }

    public void clickSizeAddNewButton() {
        sizeAddNewButton.click();
    }

    public void clickSizeVisibleOnTheProductPage() {
        sizeVisibleOnTheProductPage.click();

    }

    //16th Test Case

    @FindBy(xpath = "//select[@class='wcfm-select wcfm_ele wcfm_product_type wcfm_full_ele simple variable external grouped booking']")
    private WebElement defaultSimpleProduct;

    @FindBy(xpath = "//input[@id='is_virtual']")
    private WebElement virtual;
    @FindBy(xpath = "//input[@id='is_downloadable']")
    private WebElement downloadable;
    @FindBy(xpath = "//input[@id='regular_price']")
    private WebElement price;
    @FindBy(xpath = "//input[@id='sale_price']")
    private WebElement salePrice;
    @FindBy(xpath = "//input[@name='draft-data']")
    private WebElement draft;
    @FindBy(xpath = "//input[@name='submit-data']")
    private WebElement submit;
    @FindBy(xpath = "//input[@value='Preview']")
    private WebElement preview;
    @FindBy(xpath = "//*[.='Edit Product']")
    private WebElement editProduct;

    @FindBy(xpath = "//a[.='Browse products']")
    private WebElement browseProduct;



     public String defaultSimpleProduct() {
         Select select= new Select(defaultSimpleProduct);
         return select.getFirstSelectedOption().getText();
     }




    public void selectVirtual() {
        if (!virtual.isSelected()) {
            virtual.click();
        }
    }

    public void selectDownLoadable() {
        if (!downloadable.isSelected()) {
            downloadable.click();
        }
    }

    public void enterPrice(int amount) {
        price.sendKeys("" + amount);
    }

    public void enterSalePrice(int amount) {
        salePrice.sendKeys("" + amount);

    }

    //Use writeProductTitle method
    //Method in the 14th testCase


     public void clickDraft() {
         JSUtils.clickWithTimeoutByJS(draft);
     }

     public void clickSubmit() {
         JSUtils.clickWithTimeoutByJS(submit);
     }
     public void clickPreview() {
         preview.click();
     }


    public boolean editProductIsVisible() {
        editProduct.isDisplayed();
        return true;
    }

    @FindBy(xpath = "(//a[@href='https://pearlymarket.com/shop/'])[1]")
    private WebElement goShopButton;
    public void clickGoShopOrders(){
        if (goShopButton.isEnabled()){
            JSUtils.clickWithTimeoutByJS(goShopButton);
        }else {
            JSUtils.clickWithTimeoutByJS(browseProduct);
        }

}
//products not for store manager
    @FindBy(xpath ="(//ul//li//div//figure)[2]")
    private WebElement products;
    public void clickProducts(){
        products.click();
    }
    @FindBy(xpath ="//ul//li//img")
    private WebElement validationImage1;
    public void validateImageOfProductIsVisible1(){
        assertTrue(validationImage1.isDisplayed());
    }
    @FindBy(xpath ="(//table[1]//tr[1]/td[1])[1]")
    private WebElement validationImage2;
    public void validateImageOfProductIsVisible2(){
        assertTrue(validationImage2.isDisplayed());
    }




 }










