package project.pages.customerpages;


import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import project.pages.BasePage;
import project.utilities.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PMC_MyAccountPage extends BasePage {
    @FindBy(linkText = "Addresses")
    private WebElement addresses;

    @FindBy(linkText = "Account details")
    private WebElement accountDetails;

    //account details
    @FindBy(xpath = "//input[@id='account_first_name']")
    private WebElement firstNameAD;
    @FindBy(xpath = "//input[@id='account_last_name']")
    private WebElement lastNameAD;
    @FindBy(xpath = "//input[@id='account_display_name']")
    private WebElement displayNameAD;
    @FindBy(xpath = "//input[@id='account_email']")
    private WebElement accountEmailAD;
    @FindBy(xpath = "//iframe[@id='user_description_ifr']")
    private WebElement iframeBiography;

    @FindBy(xpath = "//body[@id='tinymce']")
    private WebElement biographyTextbox;

    @FindBy(id = "password_current")
    private WebElement passwordCurrentAD;
    @FindBy(id = "password_1")
    private WebElement passwordNew;
    @FindBy(id = "password_2")
    private WebElement passwordConfirm;

    @FindBy(xpath = "//button[@name='save_account_details']")
    private WebElement saveChangesButtonAD;


    public void clickAddresses() {
        ReusableMethods.clickWithTimeOut(addresses, 10);
    }
    public void clickAccountDetails() {
        ReusableMethods.clickWithTimeOut(accountDetails, 10);
    }
    public void updateFirstNameLastName() {
        firstNameAD.clear();
        firstNameAD.sendKeys("firstname");
        lastNameAD.clear();
        lastNameAD.sendKeys("lastname");
    }

    public void updateDisplayName() {
        displayNameAD.clear();
        displayNameAD.sendKeys(ConfigReader.getProperty("customer_username"));
    }

    public void updateEmailAddress() {
        accountEmailAD.clear();
        accountEmailAD.sendKeys(ConfigReader.getProperty("customer_email"));
    }

    public void enterBiography() {
        Lorem lorem = LoremIpsum.getInstance();
        String loremIpsumText = lorem.getParagraphs(1, 1);
        Driver.getDriver().switchTo().frame(iframeBiography);
        biographyTextbox.clear();
        biographyTextbox.sendKeys(loremIpsumText);
        Driver.getDriver().switchTo().defaultContent();
    }



        public void validateCurrentPasswordNewPasswordPasswordConfirmBoxesAreEnabled(){
        assertTrue(passwordCurrentAD.isEnabled());
        assertTrue(passwordNew.isEnabled());
        assertTrue(passwordConfirm.isEnabled());
    }


    public void updateCurrentPassWord() {
        JSUtils.setValueByJS(passwordCurrentAD, ConfigReader.getProperty("customer_password"));
        JSUtils.setValueByJS(passwordNew, ConfigReader.getProperty("customer_password"));
        JSUtils.setValueByJS(passwordConfirm, ConfigReader.getProperty("customer_password"));
        WaitUtils.waitFor(3);
    }

    public void clickSaveChangesButton() {
        JSUtils.scrollIntoViewJS(saveChangesButtonAD);
        WaitUtils.waitFor(3);
    //    saveChangesButtonAD.sendKeys(Keys.ENTER);
        JSUtils.clickWithTimeoutByJS(saveChangesButtonAD);
    }

    public void verifyAccountDetailsUpdated() {
        assertEquals(ConfigReader.getProperty("customer_username"), displayNameAD.getAttribute("value"));
    }


}
