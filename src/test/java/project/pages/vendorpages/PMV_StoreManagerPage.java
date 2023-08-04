package project.pages.vendorpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import project.pages.BasePage;
import project.utilities.Driver;

public class PMV_StoreManagerPage extends BasePage {
    @FindBy(xpath = "(//span[@class='wcfm-page-heading-text'])")
    private WebElement dashboard;
    public  void dashboardHome (){
       dashboard.click();}

    @FindBy(xpath = "(//a[@class='wcfm_menu_item active'])")
    private WebElement home;
    public  void clickHome (){
        home.click();}

    @FindBy(xpath = "(//span[@class='wcfmfa fa-image'])")
    private WebElement media;
    public  void clickMedia (){
        media.click();}

    @FindBy(xpath ="//a[@href='https://pearlymarket.com/store-manager/products/']")
    private WebElement products;
    public void clickProducts(){
        products.click();
    }
    @FindBy(xpath ="(//span[@class='wcfmfa fa-user-circle'])")
    private WebElement customers;
    public void clickCustomers(){
       customers.click();}
    @FindBy(xpath ="(//span[@class='wcfmfa fa-cogs'])")
    private WebElement settings;
    public void clickSettings(){
       settings.click();}

    @FindBy(xpath ="(//span[@class='wcfmfa fa-credit-card'])")
    private WebElement payments;
    public void clickPayments(){
        payments.click();}

    @FindBy(xpath ="(//span[@class='wcfmfa fa-gift'])[1]")
    private WebElement coupons;
    public void clickCoupons(){
       coupons.click();}

    @FindBy(xpath ="(//span[@class='wcfmfa fa-gift'])")
    private WebElement overCoupons;
    public void hoverOverCoupons(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(coupons).perform();
    }
    @FindBy(xpath ="(//a[@href='https://pearlymarket.com/store-manager/coupons-manage/'])")
    private WebElement addNewButton;
    public void clickAddNewButton(){
        addNewButton.click();}

    @FindBy(xpath ="(//span[@class='wcfmfa fa-shopping-cart'])")
    private WebElement orders;
    public void clickOrders(){
        orders.click();}



    @FindBy(xpath ="(//span[@class='text'])[6]")
    private WebElement cupons;
    public void hoverOverCupons(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(cupons).perform();
    }


}
