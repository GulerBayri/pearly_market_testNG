package project.pages.customerpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import project.pages.BasePage;
import project.utilities.Driver;
import project.utilities.JSUtils;

import java.util.List;
import static org.testng.Assert.assertTrue;

public class PMC_WishListPage extends BasePage {
    @FindBy(linkText = "GO SHOP")
    private WebElement goShopButton;

    @FindBy(xpath = "(//ul//li//div//figure)[2]")
    private WebElement productHoverOver;

    @FindBy(xpath = "(//a[@data-title='Add to wishlist'])[2]")
    private WebElement wishListIconOfProduct;

    @FindBy(xpath = "(//a[@href='https://pearlymarket.com/wishlist/'])[2]")
    private WebElement wishListIconGeneral;

    @FindBy(xpath = "(//i[@class='w-icon-cart'])[1]")
    private WebElement cartIcon;

    @FindBy(xpath = "//tbody//tr")
    private List<WebElement> wishList;
    @FindBy(xpath = "(//button[@title = 'Quick View'])[1]")
    private WebElement quickViewButton;

    @FindBy(xpath= "//a[.='Add to cart']")
    private WebElement addToCartButton;

    @FindBy(xpath= "//a[.='Checkout']")
    private WebElement checkoutButton;


    public void clickOnGoShopButton() {
        if(goShopButton.isEnabled()){
            goShopButton.click();
        }else{
            Driver.getDriver().navigate().to("https://pearlymarket.com/shop/");
        }

    }

    public void hoverOverProduct() {
   //     JSUtils.clickWithTimeoutByJS(wishListIconOfProduct);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(productHoverOver).build().perform();
    }

    public void clickOnWishListIconProduct() {
        wishListIconOfProduct.click();

    }
    public void clickOnWishListIconTopRight() {
        JSUtils.clickWithTimeoutByJS(wishListIconGeneral);
      // wishListIconTopRight.click();

    }
    public void validateWishListIsNotEmpty() {
        assertTrue(wishList.size() > 0);
    }

    public void validateQuickViewButtonIsEnabled() {
        assertTrue(quickViewButton.isEnabled());

    }
    public void clickOnAddToCartButton() {
      //  addToCartButton.click();
        JSUtils.clickWithTimeoutByJS(addToCartButton);
    }



    public void clickOnCartIcon() {
        cartIcon.click();
    }
    public void clickOnCheckOutButton(){
        checkoutButton.click();

    }


}
