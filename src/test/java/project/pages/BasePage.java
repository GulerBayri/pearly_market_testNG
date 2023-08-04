package project.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import project.utilities.ConfigReader;
import project.utilities.Driver;

import static project.utilities.Driver.closeDriver;

//we should type our codes in our branch. we never type our codes in main branch
//if we want to pull all the codes from main branch (to up to date)
//in command line(terminal) we type
/*
   git init
   git add .
   git commit -m "commit"
   git pull origin main
   git push


 */

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }





}
