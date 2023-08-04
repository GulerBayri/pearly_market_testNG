package project.pages.customerpages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import project.pages.BasePage;
import project.utilities.Driver;
import project.utilities.JSUtils;
import project.utilities.ReusableMethods;
import project.utilities.WaitUtils;

import static org.testng.Assert.assertTrue;

public class PMC_CheckoutPage extends BasePage {

    Faker faker = new Faker();


    @FindBy(linkText = "Checkout")
    private WebElement checkoutPage;
    public void clickCheckoutPage() {
        checkoutPage.click();
    }

    @FindBy(id = "billing_first_name")
    private WebElement addBillingFirstName;
    public void setAddBillingFirstName() {
        addBillingFirstName.clear();
        addBillingFirstName.sendKeys(faker.name().firstName());
    }

    @FindBy(id = "billing_last_name")
    private WebElement addBillingLastName;
    public void setAddBillingLastName() {
        addBillingLastName.clear();
        addBillingLastName.sendKeys(faker.name().lastName());
    }

    @FindBy(id = "billing_country")
    private WebElement countryDropDown;
    public void selectCountry() {
        Select options = new Select(countryDropDown);
        options.selectByVisibleText("United States (US)");
//I removed the parameter because, the select webelement is of Japan's option
//        WebElement countryOption = Driver.getDriver().findElement(By.xpath("//span[@title='Japan']"));
//        countryOption.click();
    }

    @FindBy(id = "billing_postcode")
    private WebElement addBillingPostCode;
    public void setAddBillingPostCode() {
        addBillingPostCode.clear();
        addBillingPostCode.sendKeys(faker.address().zipCode());
    }

    @FindBy(xpath = "//select[@id='billing_state']")
    private WebElement stateDropDown;
    public void selectState() {
        Select options = new Select(stateDropDown);
        options.selectByVisibleText("Arizona");
  //      stateDropDown.click();
////I removed the parameter because, the select webelement is of Tokyo's option
//        WebElement countryOption = Driver.getDriver().findElement(By.xpath("//span[@title='Tokyo']"));
//        countryOption.click();
    }

    @FindBy(xpath = "//input[@name='billing_city']")
    private WebElement addBillingCity;
    public void setAddBillingCity() {

        addBillingCity.clear();
        addBillingCity.sendKeys(faker.address().city());
      
    }


    @FindBy(xpath = "//input[@name='billing_address_1']")
    private WebElement addBillingAddress;
    public void setAddBillingAddress() {
        addBillingAddress.clear();
        addBillingAddress.sendKeys(faker.address().streetAddress());
    }

    @FindBy(xpath = "//input[@name='billing_phone']")
    private WebElement addBillingPhone;
    public void setAddBillingPhone() {
        addBillingPhone.clear();
        addBillingPhone.sendKeys(faker.phoneNumber().cellPhone());
    }

    @FindBy(id = "billing_email")
    private WebElement addBillingEmail;
    public void setAddBillingEmail() {
        addBillingEmail.clear();
        addBillingEmail.sendKeys("pearlymarketvendor@gmail.com");
    }

    @FindBy(xpath= "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders']")
    private WebElement placeOrder;
    public void clickPlaceOrder() {
        placeOrder.click();
    }
    @FindBy(xpath= "//button[@id='place_order']")
    private WebElement placeOrderButton;
    public void clickPlaceOrderButton() {
        JSUtils.clickWithTimeoutByJS(placeOrderButton);
    }


    @FindBy(id = "payment_method_bacs")
    private WebElement wireTransferEFT;
    @FindBy(id = "payment_method_cod")
    private WebElement payAtDoor;
    public void verifyPaymentOptionsClickable(){
        ReusableMethods.verifyElementClickable(wireTransferEFT);
        ReusableMethods.verifyElementClickable(payAtDoor);
    }
    public void clickPaymentOptions(){
        WaitUtils.waitFor(3);
        payAtDoor.click();
    }

    @FindBy(xpath = "//table//tfoot//tr[3]//td//span")
    private WebElement totalPriceforValidation;
    public void validateTotalPriceIsVisible(){
        assertTrue(totalPriceforValidation.isEnabled());
    }



}
