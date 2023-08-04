package project.pages.customerpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import project.pages.BasePage;
import project.utilities.Driver;
import project.utilities.JSUtils;
import project.utilities.WaitUtils;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class PMC_ComparePage extends BasePage {

    @FindBy(xpath = "//*[.='Start Compare !']")
    private WebElement startCompareButton;

    public void clickstartCompareButton() {
        JSUtils.clickWithTimeoutByJS(startCompareButton);
    }

    @FindBy(xpath = "(//div//ul//li//a[@class='btn-remove remove_from_compare fas fa-times'])[1]")
    private WebElement removeButton;

    public void removeOneProductFromCompare() {
        JSUtils.clickWithTimeoutByJS(removeButton);
    }

    @FindBy(xpath = "//figure")
    private List<WebElement> productsCompare;

    public void validateThereAreCompareProducts() {
        assertTrue(productsCompare.size() > 0);
    }

    @FindBy(xpath = "//figure//img")
    private List<WebElement> productsCompareVisible;

    public void validateProductsVisible() {
        assertTrue(productsCompareVisible.stream().allMatch(WebElement::isDisplayed));
    }

    @FindBy(xpath = "//div[@data-title='Availability']")
    private List<WebElement> productsInStockCompareVisible;

    public void validateProductsInStockCompareVisible() {
        assertTrue(productsInStockCompareVisible.stream().allMatch(WebElement::isEnabled));
    }

    @FindBy(xpath = "//div[@data-title='Description']")
    private List<WebElement> productsDescriptionCompareVisible;

    public void validateProductsDescriptionCompareVisible() {
        assertTrue(productsDescriptionCompareVisible.stream().allMatch(WebElement::isEnabled));
    }

    @FindBy(xpath = "//div[@data-title='Ratings & Reviews']")
    private List<WebElement> productsRatingsReviewsCompareVisible;

    public void validateProductsRatingsReviewsCompareVisible() {
        assertTrue(productsRatingsReviewsCompareVisible.stream().allMatch(WebElement::isEnabled));
    }

    @FindBy(xpath = "//div[@data-title='Sku']")
    private List<WebElement> productsSkuCompareVisible;

    public void validateProductsSkuCompareVisible() {
        assertTrue(productsSkuCompareVisible.stream().allMatch(WebElement::isEnabled));
    }

    @FindBy(xpath = "//div[@data-title='Color']")
    private List<WebElement> productsColorCompareVisible;

    public void validateProductsColorCompareVisible() {
        assertTrue(productsColorCompareVisible.stream().allMatch(WebElement::isEnabled));
    }
    @FindBy(xpath = "//div[@data-title='Size']")
    private List<WebElement> productsSizeCompareVisible;

    public void validateProductsSizeCompareVisible() {
        assertTrue(productsSizeCompareVisible.stream().allMatch(WebElement::isEnabled));
    }


    @FindBy(xpath = "(//a[contains(@class, 'remove_from_compare')])[1]")
    private WebElement removeFromCompare;

    public void removeOneByOneProductsFromCompare() {
            removeFromCompare.click();
            WaitUtils.waitFor(3);


    }



}
