package project.utilities;

import org.testng.ITestListener;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ExtentReportsUtil implements ITestListener {
    protected static ExtentReports extentReports;
    protected static ExtentHtmlReporter extentHtmlReporter;
    protected static ExtentTest extentTest;

    static {
        //        WHAT WILL BE REPORT NAME AND WHERE THE REPORT IS CREATED
//        PATH
        String now = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir") + "/test-output/Reports/" + now + "extent_reports.html";
//        Create the HTML template using extent html reporter in the path
        extentHtmlReporter = new ExtentHtmlReporter(path);
//        Create extent report
        extentReports = new ExtentReports();
//        ***********ADDING CUSTOM SYSTEM INFORMATION ***********
        extentReports.setSystemInfo("Application Name", "Pearly Market");
        extentReports.setSystemInfo("Browser", "Chrome");
        extentReports.setSystemInfo("Team Name", "Team-04");

//        ***********DOCUMENT INFORMATION************************
        extentHtmlReporter.config().setReportName("Pearly Market Web Application Report");
        extentHtmlReporter.config().setDocumentTitle("Pearly Market Web Application Report");
//        ***********DONE WITH CONFIGURATIONS********************
//        connecting extent reports and extent html reporter
        extentReports.attachReporter(extentHtmlReporter);
//        **********CREATE EXTENT TEST THAT IS ALSO KNOWN AS LOGGER**
        extentTest = extentReports.createTest("Pearly Market Web Application", "Pearly Market Web Application Report");

    }

    @Override
    public void onStart(ITestContext context) {
        extentTest = extentReports.createTest(context.getName());
        extentTest.info(context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extentTest.info(context.getName());
        extentReports.flush();
    }

    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extentReports.createTest(result.getMethod().getMethodName());
        extentTest.info(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.info(result.getName());
        extentTest.pass("Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) { // if test fails
            String screenshotLocation = null;
            try {
                screenshotLocation = MediaUtils.takeScreenshotOfTheEntirePageAsString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            extentTest.fail(result.getName());
            try {
                extentTest.addScreenCaptureFromPath(screenshotLocation);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            extentTest.info(result.getName());
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) { // if test is ignored
            extentTest.info(result.getName());
            extentTest.skip("Test Case is skipped: " + result.getName()); // Ignored ones
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTest.info(result.getName());
        extentTest.skip("Test skipped");
    }

    //LOGGER METHODS

    //   ExtentReportUtils.pass("Message") --> Logs the message as passed on report
    public static void pass(String message) {
        extentTest.pass(message);
    }

    //   ExtentReportUtils.info("Message") --> Logs the message as information on report
    public static void info(String message) {
        extentTest.info(message);
    }

    //   ExtentReportUtils.fail("Message") --> Logs the message as failure on report
    public static void fail(String message) {
        extentTest.fail(message);
    }

    //To generate the extent report we must use "extentReports.flush();"
    //ExtentReportUtils.flush(); --> Generates report
    public static void flush(){
        extentReports.flush();
    }


    public static void takeSchreenshotsExtentReports(){
        try {
            extentTest.addScreenCaptureFromPath(MediaUtils.takeScreenshotOfTheEntirePageAsString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
