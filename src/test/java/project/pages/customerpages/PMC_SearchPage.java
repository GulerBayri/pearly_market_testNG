package project.pages.customerpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import project.pages.BasePage;
import project.utilities.JSUtils;

public class PMC_SearchPage extends BasePage {
    @FindBy(xpath = "(//input[@aria-label='Search'])")
    private WebElement searchBox;


    @FindBy(xpath = "(//button[@aria-label='Search Button'])")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@name='add-to-cart']")
    private WebElement addToCart;

    @FindBy(xpath = "//a[@href='#' and @title='Compare']")
    private WebElement compare;


    public  void clickSearchBox (){searchBox.click();}
    public void searchItem(String item){ searchBox.sendKeys(item);}
    public  void clickSearchButton (){searchButton.click();}

    public void clickAddToCartButton(){

        JSUtils.clickWithTimeoutByJS(addToCart);
    }
    public void clickOnCompare(){
        compare.click();
    }

}
