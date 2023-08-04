package project.pages.vendorpages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import project.pages.BasePage;
import project.utilities.Driver;
import project.utilities.JSUtils;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;



public class PMV_CouponsPage extends BasePage {


    Faker faker = new Faker();


    @FindBy(xpath = "//a[@href='https://pearlymarket.com/store-manager/coupons-manage/']")
    private WebElement addNewCoupon;
    public void clickCouponsAddNew() {
        addNewCoupon.click();
    }

    @FindBy(xpath = "//input[@name='title']")
    private WebElement couponCode;
    public void addCouponCode() {
        //random coupon could not be accepted, so we should create fixed coupon
        couponCode.sendKeys("Rebajas" + Faker.instance().number().randomNumber(4,true));
        couponCode.getText();
    }
    public String getCouponCode() {
        couponCode.sendKeys(""+ Faker.instance().number().randomNumber(4,true));
        return couponCode.getText();
    }


    @FindBy(xpath = "//form//textarea[@id='description']")
    private WebElement descriptionCoupon;
    public void enterDescriptionCoupon(String description){
        descriptionCoupon.sendKeys(description);
    }
    @FindBy(xpath = "//select[@id='discount_type']")
    private WebElement discountType;
    public void selectDiscountType(String visibleText){
        Select options = new Select(discountType);
        options.selectByVisibleText(visibleText);
    }


    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement couponDescription;
    public void addCouponDescription() {
        couponDescription.sendKeys( faker.expression("couponDescription"));
    }

    @FindBy(xpath = "//select[@name='discount_type']")
    private WebElement selectDiscountType;
    public void setSelectDiscountType() {
        selectDiscountType.click();

        WebElement discountType = Driver.getDriver().findElement(By.xpath("//option[@value='fixed_product']"));
        discountType.click();
    }

    @FindBy(xpath = "//input[@name='coupon_amount']")
    private WebElement discountAmount;
    public void addDiscountAmount() {
        discountAmount.sendKeys(Faker.instance().number().randomNumber(2,true)+"%");
    }


    @FindBy(xpath = "//input[@name='expiry_date']")
    private WebElement couponExpiryDate;
    public void setCouponExpiryDate() {
        couponExpiryDate.sendKeys("2024-06-16");
    }

    @FindBy(xpath = "//input[@name='submit-data']")
    private WebElement submitNewCoupon;
    public void clickSubmitNewCoupon() {
        JSUtils.clickWithTimeoutByJS(submitNewCoupon);

    }

    @FindBy(linkText = "Enter your code")
    private WebElement shopWithCouponCode;
    public void clickEnterYourCode() {
        shopWithCouponCode.click();
    }

    @FindBy(xpath = "//input[@name='coupon_code']")
    private WebElement couponCodeBox;
    public void setYourCouponCode() {
        couponCodeBox.sendKeys("Rebajas");
    }

    @FindBy(xpath = "//button[@name='apply_coupon']")
    private WebElement applyCoupon;
    public void clickApplyCoupon() {
        applyCoupon.click();
    }

    @FindBy(xpath = "//tr[@class='cart-discount coupon-rebajas']")
    private WebElement couponAccepted;
    public void displayCouponCreated() {
        couponAccepted.isDisplayed();
    }


    @FindBy(xpath = "(//span[@class='wcfmfa fa-edit text_tip'])[1]")
    private WebElement couponEditButton;
    public void displayCouponEditButton() {
        couponEditButton.isDisplayed();
    }

    @FindBy(linkText = "Rebajas")
    private WebElement createdCoupon;
    public void createdCouponIsVisible() {
        createdCoupon.isDisplayed();
    }

    @FindBy(xpath = "//*[.='Edit Coupon']")
    private WebElement editCouponValidate;
    public void validateEditCouponIsVisible(){
        assertEquals(editCouponValidate.getText(), "Edit Coupon");
    }

    @FindBy(xpath = "//tbody//tr[1]//td[1]")
    private WebElement couponCodeDynamic;
    public String getCouponCodeDynamic(){
      return couponCodeDynamic.getText();
    }

//tbody//tr[1]//td[1]




}