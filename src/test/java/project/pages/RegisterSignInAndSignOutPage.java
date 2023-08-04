package project.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import project.utilities.*;

import java.io.IOException;

import static org.testng.Assert.*;

public class RegisterSignInAndSignOutPage extends BasePage {


    Faker faker = new Faker();
    MediaUtils mediaUtils = new MediaUtils();

    //registration
    @FindBy(id = "reg_username")
    private WebElement userName;

    @FindBy(id = "reg_email")
    private WebElement userEmail;

    @FindBy(id = "reg_password")
    private WebElement password;

    @FindBy(xpath = "//input[@id='register-policy']")
    private WebElement agreeCheckBox;

    @FindBy(xpath = "//button[@name='register']")
    private WebElement signUpButton;

    @FindBy(xpath = "//*[text()='An account is already registered with your email address. ']")
    private WebElement messageAlreadyRegistered;

    @FindBy(linkText = "Become a Vendor")
    private WebElement becomeVendorLink;


    //sign up customer
    public void enterSignUpUserName() {
        userName.sendKeys(faker.name().username());
    }

    public void enterSignUpUserNameNegative() {
        userName.sendKeys(ConfigReader.getProperty("customer_username"));
    }

    public void enterSignUpUserEmail() {
        userEmail.sendKeys(faker.internet().emailAddress());
    }

    public void enterSignUpUserEmailNegative() {
        userEmail.sendKeys(ConfigReader.getProperty("customer_email"));
    }

    public void enterSignUpPassword() {
        password.sendKeys(faker.internet().password());
    }

    public void enterSignUpPasswordNegative() {
        password.sendKeys(ConfigReader.getProperty("customer_password"));
    }

    public void clickAgreeCheckBox() {
        //signup
        agreeCheckBox.click();
    }


    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void validatePreviouslyRegisteredCredentialsIsnotPossible() {
        assertTrue(messageAlreadyRegistered.getText().contains("An account is already registered with your email address. "));
    }


    //sign in customer

    @FindBy(xpath = "//input[@id='username']")
    private WebElement signInUserNameCustomer;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement signInPasswordCustomer;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButtonCustomer;


    public void enterSignInUserNameCustomer() {
        signInUserNameCustomer.sendKeys(ConfigReader.getProperty("customer_email"));

    }

    public void enterSignInPasswordCustomer() {
        signInPasswordCustomer.sendKeys(ConfigReader.getProperty("customer_password"));
    }

    public void clickSignInButtonCustomer() {
        signInButtonCustomer.click();
    }

    public void enterSignInUserNameVendor() {
        signInUserNameCustomer.sendKeys(ConfigReader.getProperty("vendor_email"));

    }

    public void enterSignInPasswordVendor() {
        signInPasswordCustomer.sendKeys(ConfigReader.getProperty("vendor_password"));
    }

    public void clickSignInButtonVendor() {
        signInButtonCustomer.click();
    }


    // Sign Out for Customer and Vendor
    @FindBy(xpath = "//span[.='Sign Out']")
    private WebElement signOut;
    @FindBy(linkText = "Log out")
    private WebElement logOut;

    public void signOut() {
        signOut.click();
    }

    public void logOut() {
        logOut.click();
    }


    // Become a Vendor --->Vendor Registration
    @FindBy(id = "user_email")
    private WebElement emailBox;
    @FindBy(xpath = "//input[@placeholder='Verification Code']")
    private WebElement verificationCodeBox;
    @FindBy(xpath = "//input[@value='Re-send Code']")
    private WebElement resendCodeButton;
    @FindBy(id = "passoword")
    private WebElement passwordBox;
    @FindBy(id = "confirm_pwd")
    private WebElement confirmPasswordBox;
    @FindBy(id = "wcfm_membership_register_button")
    private WebElement registerButton;
//    @FindBy (linkText= "Copy")
//    private WebElement copyFakeEmailButton;

    @FindBy(id = "email")
    private WebElement emailFake;
    @FindBy(xpath = "//span[@id='hesloGen']")
    private WebElement passwordFake;

    @FindBy(xpath = "(//tr[@data-href='3'])[1]")
    private WebElement mailForVerificationCode;
    @FindBy(xpath = "//span[@id='predmet']")
    private WebElement verificationCode;

    @FindBy(xpath = "//input[@id='user_email']")
    private WebElement emailRegistrationVendor;

    //bug
    @FindBy(xpath = "//img[@alt='Pearly Market']")
    private WebElement pearlyMarketImage;
    @FindBy(xpath = "//div//h1")
    private WebElement validationForSuccessfulRegistrationAsVendor;


    public void validateAfterRegistrationPearlyImageforHomePageIsVisible() {
        if (pearlyMarketImage.isDisplayed()) {
                assertTrue(pearlyMarketImage.isDisplayed());
        } else {
            try {
                MediaUtils.takeScreenshotOfTheEntirePageAsString();
                //for extent report    MediaUtils.takeScreenshotOfTheEntirePageAsString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public void clickBecomeVendorLink() {
        becomeVendorLink.click();
    }

    public void enterCredentialsVendorSignUp() {
        becomeVendorLink.click();
        String windowHandlePearly = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get("https://www.fakemail.net/");
        String windowHandleFakeEmail = Driver.getDriver().getWindowHandle();
        String fakePassword = passwordFake.getText();
        String fakeEmail = emailFake.getText();
        Driver.getDriver().switchTo().window(windowHandlePearly);
        emailRegistrationVendor.sendKeys(fakeEmail);
        passwordBox.sendKeys(fakePassword);
        confirmPasswordBox.sendKeys(fakePassword);
        JSUtils.clickWithTimeoutByJS(resendCodeButton);
        WaitUtils.waitFor(10);
        Driver.getDriver().switchTo().window(windowHandleFakeEmail);
        mailForVerificationCode.click();
        WaitUtils.waitFor(3);
        String verificateCode = verificationCode.getText().replaceAll("\\D", "");
        WaitUtils.waitFor(1);
        Driver.getDriver().switchTo().window(windowHandlePearly);
        verificationCodeBox.sendKeys(verificateCode);
        WaitUtils.waitFor(1);
        registerButton.click();
    }


    //////////////////

    public void enterEmailVendorForRegistration(){
        emailBox.sendKeys(ConfigReader.getProperty("vendor_email"));
    }

    //    public void sendVerificationCode(){
//        verificationCodeBox.sendKeys("*******VerificationCode******");
//    }
    public void clickResendCodeButton(){
        resendCodeButton.click();
    }
    public void enterPasswordVendorForRegistration(){
        passwordBox.sendKeys(ConfigReader.getProperty("vendor_password"));
    }
    public void enterConfirmPasswordVendorForRegistration(){
        confirmPasswordBox.sendKeys(ConfigReader.getProperty("vendor_password"));
    }
    public void clickRegisterButtonVendor(){
        registerButton.click();
    }


    public void sendVerificationCode() {
        verificationCodeBox.sendKeys(ConfigReader.getProperty("verificationCodeBox"));
    }

    public void enterPasswordLevelChartTooShort() {
        passwordBox.sendKeys(ConfigReader.getProperty("vendor_pwd_for_too_short"));
    }

    public void enterPasswordLevelChartWeak() {
        passwordBox.sendKeys(ConfigReader.getProperty("vendor_pwd_for_weak"));
    }

    public void enterPasswordLevelChartGood() {
        passwordBox.sendKeys(ConfigReader.getProperty("vendor_pwd_for_good"));
    }

    public void enterPasswordLevelChartStrong() {
        passwordBox.sendKeys(ConfigReader.getProperty("vendor_pwd_for_strong"));
    }

    public void enterRegisterButtonVendor() {
        registerButton.sendKeys(Keys.ENTER);
    }


    public void validateRegistrationAsVendorSuccessful() {
        assertEquals(validationForSuccessfulRegistrationAsVendor.getText(), "Welcome to Pearly Market!");
    }




}

