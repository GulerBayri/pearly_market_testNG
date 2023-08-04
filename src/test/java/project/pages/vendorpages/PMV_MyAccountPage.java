package project.pages.vendorpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import project.pages.BasePage;

import java.util.Date;

public class PMV_MyAccountPage extends BasePage {

    //WIth following location method will take you directly to MyAccount Dashboard page.
    @FindBy(xpath = "//div[@class='account']")
    private WebElement goToMyAccount;
    public void ClickMyAccountIcon() {
        goToMyAccount.click();
    }


    @FindBy(linkText = "Addresses")
    private WebElement addresses;
    public void clickAddresses() {
        addresses.click();
    }

    @FindBy(linkText = "Store Manager")
    private WebElement storeManager;
    public void clickStoreManager() {
        storeManager.click();
    }

    @FindBy(linkText = "Orders")
    private WebElement orders;
    public void clickOrders() {
        orders.click();
    }

    @FindBy(linkText = "Account details")
    private WebElement accountDetails;
    public void clickAccountDetails() {
        accountDetails.click();
    }

    @FindBy(xpath = "//span[@class='icon-box-icon icon-logout']")
    private WebElement logoutButton;
    public void clickLogoutButton() {
        logoutButton.click();
    }

    @FindBy(xpath = "//tbody//tr[1]//td[5]//a")
    private WebElement orderValidation;
    public void validateOrderIsCompleted(){
        orderValidation.isEnabled();
    }

}