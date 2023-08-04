package project.pages.customerpages;
import org.apache.commons.lang3.builder.DiffResult;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import project.pages.BasePage;
import project.pages.vendorpages.PMV_CouponsPage;
import project.utilities.JSUtils;

import java.util.List;

import static org.testng.Assert.assertFalse;



public class PMC_CartPage extends BasePage {

     @FindBy(xpath = "(//a[.='Add to cart'])[1]")
    private WebElement addCartButton;

    @FindBy(xpath = "//button[@name='add-to-cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "(//i[@class ='w-icon-cart'])[1]")
    private WebElement goToCartButton;

    @FindBy(xpath= "//a[@class='button wc-forward']")
    private WebElement viewCartButton;

    @FindBy(xpath="//button[@class='quantity-plus w-icon-plus']")
    private List<WebElement> increaseItemButton;

    @FindBy(xpath="//input[contains(@id, 'quantity_')]")
    private List<WebElement> enterAmountItem;

    @FindBy(xpath="//button[@title='Minus']")
    private List<WebElement> decreaseButton;

    @FindBy(xpath="(//a[@href='https://pearlymarket.com/checkout-2/'])[2]")
    private WebElement checkOutButton;



    public void clickAddButton (){
        addCartButton.click();
    }
    public void clickAddToCartButton(){
        addToCartButton.click();
    }
    public void clickGoToCartButton (){
        goToCartButton.click();
    }
    public void clickIncreaseButton (){
        for (WebElement w: increaseItemButton){
            JSUtils.clickWithTimeoutByJS(w);
        }

    }

    public void  enterAmountOfItem (String amount ){
        for (WebElement w: enterAmountItem){
            w.clear();
            w.sendKeys(amount);
        }

    }
    public void clickViewCartButton (){
        viewCartButton.click();
    }
    public void clickDecreaseButton (){
        for (WebElement w: decreaseButton){
            JSUtils.clickWithTimeoutByJS(w);
        }
    }
    public void clickCheckOutButton(){
        JSUtils.clickWithTimeoutByJS(checkOutButton);

    }

    //TC-19


    @FindBy(xpath = "//input[@name='coupon_code']")
    private WebElement couponCodeBox;
    public void setYourCouponCode(String couponCode) {
        couponCodeBox.sendKeys(couponCode);
    }

    @FindBy(xpath = "//button[@name='apply_coupon']")
    private WebElement applyCoupon;
    public void clickApplyCoupon() {
        JSUtils.clickWithTimeoutByJS(applyCoupon);
    }

    @FindBy(xpath = "//ul[@role='alert']")
    private WebElement alertForCoupon;
    public void validateCouponIsAccepted(){
        assertFalse(alertForCoupon.getText().contains("Sorry, this coupon is not applicable to selected products."));

    }

    //TC-17
    @FindBy(linkText = "Proceed to checkout ")
    private WebElement proceedToCheckout;
    public void clickproceedToCheckOut(){
        if(proceedToCheckout.isEnabled()){
            JSUtils.clickWithTimeoutByJS(proceedToCheckout);
        }else {
            PMC_CheckoutPage checkoutPage = new PMC_CheckoutPage();
            checkoutPage.clickCheckoutPage();
        }

    }


}
