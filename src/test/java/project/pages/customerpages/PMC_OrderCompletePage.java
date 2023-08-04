package project.pages.customerpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import project.pages.BasePage;

public class PMC_OrderCompletePage extends BasePage {

    @FindBy(xpath = "//p[.='Thank you. Your order has been received.']")
    private WebElement thankYouText;

    public boolean thankYouMessageIsVisible(){
         thankYouText.isDisplayed();
        return true;
    }


}
