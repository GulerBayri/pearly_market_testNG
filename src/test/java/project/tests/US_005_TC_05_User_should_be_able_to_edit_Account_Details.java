package project.tests;

import org.testng.annotations.Test;
import project.pages.PearlyMarketHomePage;
import project.pages.customerpages.PMC_MyAccountPage;
import project.utilities.Driver;
import project.utilities.ExtentReportsUtil;
import project.utilities.TestBase;


public class US_005_TC_05_User_should_be_able_to_edit_Account_Details extends TestBase{
    
    @Test
    public void TC_05_User_should_be_able_to_edit_Account_Details(){

    TestBase testBase = new TestBase();
    PearlyMarketHomePage homePage = new PearlyMarketHomePage();
    PMC_MyAccountPage myAccountPage = new PMC_MyAccountPage();

        //sign in as a customer
        testBase.signInCustomer();
        ExtentReportsUtil.pass("1_signInCustomer");
        //click on my account
        homePage.clickMyAccount();
        ExtentReportsUtil.pass("2_clickMyAccount");
        //click on account details
        myAccountPage.clickAccountDetails();
        ExtentReportsUtil.pass("3_clickAccountDetails");
        //update firstname and lastname
        myAccountPage.updateFirstNameLastName();
        ExtentReportsUtil.pass("4_updateFirstNameLastName");
        //update displayed name
        myAccountPage.updateDisplayName();
        ExtentReportsUtil.pass("5_updateDisplayName");
        //update email address
        myAccountPage.updateEmailAddress();
        ExtentReportsUtil.pass("6_updateEmailAddress");
        //enter biography
        myAccountPage.enterBiography();
        ExtentReportsUtil.pass("7_enterBiography");
        //validate Current Password NewPassword PasswordConfirm Boxes Are Enabled
        myAccountPage.validateCurrentPasswordNewPasswordPasswordConfirmBoxesAreEnabled();
        ExtentReportsUtil.pass("8_validateCurrentPasswordNewPasswordPasswordConfirmBoxesAreEnabled");
        //update current password
        myAccountPage.updateCurrentPassWord();
        ExtentReportsUtil.pass("9_updateCurrentPassWord");
        //click save changes button
        myAccountPage.clickSaveChangesButton();
        ExtentReportsUtil.pass("10_clickSaveChangesButton");
        //verify account details are updated
        myAccountPage.verifyAccountDetailsUpdated();

        ExtentReportsUtil.pass("//11_verifyAccountDetailsUpdated");

        ExtentReportsUtil.takeSchreenshotsExtentReports();
    }
}

