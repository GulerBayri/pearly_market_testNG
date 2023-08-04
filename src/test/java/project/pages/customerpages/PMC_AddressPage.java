package project.pages.customerpages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import project.pages.BasePage;
import project.utilities.ReusableMethods;
public class PMC_AddressPage extends BasePage{

    //billing address

    @FindBy(xpath = "(//a[.='Add'])[1]")
    private WebElement addBillingAddress;

    @FindBy(xpath = "//input[@id='billing_first_name']")
    private WebElement firstnameBA;
    @FindBy(xpath = "//input[@id='billing_last_name']")
    private WebElement lastnameBA;
    @FindBy(xpath = "//select[@id='billing_country']")
    private WebElement countryRegionDropDownBA;

    @FindBy(xpath = "//input[@id='billing_address_1']")
    private WebElement streetAddressBA;

    @FindBy(xpath = "//input[@id='billing_city']")
    private WebElement townCityBA;

    @FindBy(xpath = "//select[@id='billing_state']")
    private WebElement stateDropDownBA;

    @FindBy(xpath = "//input[@id='billing_postcode']")
    private WebElement zipCodeBA;
    @FindBy(xpath = "//input[@id='billing_phone']")
    private WebElement phoneNumberBA;
    @FindBy(xpath = "//button[@name='save_address']")
    private WebElement saveAddressButtonBA;

    @FindBy(xpath = "//a[.='Edit Your Billing Address']")
    private WebElement editBillingAddressButton;

    //shipping address
    @FindBy(xpath = "//a[.='Add']")
    private WebElement addShippingAddress;

    @FindBy(xpath = "//input[@id='shipping_first_name']")
    private WebElement firstnameSH;
    @FindBy(xpath = "//input[@id='shipping_last_name']")
    private WebElement lastnameSH;

    @FindBy(xpath = "//select[@id='shipping_country']")
    private WebElement countryRegionDropDownSH;

    @FindBy(xpath = "//input[@id='shipping_address_1']")
    private WebElement streetAddressSH;

    @FindBy(xpath = "//input[@id='shipping_city']")
    private WebElement townCitySH;
    @FindBy(xpath = "//select[@id='shipping_state']")
    private WebElement stateDropDownSH;
    @FindBy(id = "shipping_postcode")
    private WebElement zipCodeSH;
    @FindBy(xpath = "//button[@name='save_address']")
    private WebElement saveAddressButtonSH;
    @FindBy(xpath = "//a[.='Edit Your Shipping Address']")
    private WebElement editShippingAddressButton;


    //billing address
    public void clickaddForBillingAddress() {
        if (editBillingAddressButton.isEnabled()){
            editBillingAddressButton.click();
        }else {
            addBillingAddress.click();
        }

    }

    public void enterFirstNamePasswordBA() {
        firstnameBA.clear();
        firstnameBA.sendKeys("firstname");
        lastnameBA.clear();
        lastnameBA.sendKeys("lastname");
    }

    public void selectCountryRegionBA() {
        Select select = new Select(countryRegionDropDownBA);
        select.selectByVisibleText("United States (US)");
    }

    public void enterStreetAddressBA() {
        streetAddressBA.clear();
        streetAddressBA.sendKeys("street address");
    }

    public void enterTownCityBA() {
        townCityBA.clear();
        townCityBA.sendKeys("town city");
    }

    public void selectStateDropDownBA() {
        Select select = new Select(stateDropDownBA);
        select.selectByVisibleText("California");
    }

    public void enterZipCodeBA() {
        zipCodeBA.clear();
        zipCodeBA.sendKeys("34000");
    }

    public void enterPhoneNumberBA() {
        phoneNumberBA.clear();
        phoneNumberBA.sendKeys("1234567890");
    }

    public void clickSaveAddressButtonBA() {
        ReusableMethods.clickWithTimeOut(saveAddressButtonBA, 10);
    }
    public void validateAddressAddedBA(){
        editBillingAddressButton.isDisplayed();
    }

    //shipping address
    public void clickaddForShippingAddress() {
        if (editShippingAddressButton.isEnabled()){
            editShippingAddressButton.click();
        }else if (addShippingAddress.isEnabled()){
            addShippingAddress.click();
        }

    }
    public void enterFirstNamePasswordSH() {
        firstnameSH.clear();
        firstnameSH.sendKeys("firstname");
        lastnameSH.clear();
        lastnameSH.sendKeys("lastname");
    }
    public void selectCountryRegionSH() {
        Select select = new Select(countryRegionDropDownSH);
        select.selectByVisibleText("United States (US)");
    }
    public void enterStreetAddressSH() {
        streetAddressSH.clear();
        streetAddressSH.sendKeys("street address");
    }
    public void enterTownCitySH() {
        townCitySH.clear();
        townCitySH.sendKeys("town city");
    }
    public void selectStateDropDownSH() {
        Select select = new Select(stateDropDownSH);
        select.selectByVisibleText("California");
    }

    public void enterZipCodeSH() {
        zipCodeSH.clear();
        zipCodeSH.sendKeys("34000");
    }

    public void clickSaveAddressButtonSH() {
        ReusableMethods.clickWithTimeOut(saveAddressButtonSH, 10);
    }
    public void validateAddressAddedSH(){
        editShippingAddressButton.isDisplayed();
    }

}
