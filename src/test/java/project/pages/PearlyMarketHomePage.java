package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import project.utilities.ReusableMethods;


public class PearlyMarketHomePage extends BasePage {

    @FindBy(xpath = "//a[.='Register']")
    private WebElement signUpLink;

    @FindBy(xpath = "//*[@class='login inline-type']")
    private WebElement signInLink;

    @FindBy(linkText = "My Account")
    private WebElement myAccountLink;
    @FindBy(linkText = "Wishlist")
    private WebElement wishListLink;

    public void clickRegisterLink() {
        signUpLink.click();
    }

    public void clickSignInLink() {
        signInLink.click();
    }
    public void clickMyAccount() {
        ReusableMethods.clickWithTimeOut(myAccountLink,10);
    }
    public void clickWishListLink() {
        wishListLink.click();
    }




}


