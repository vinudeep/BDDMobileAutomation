package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.verificationsPage;


public class verificationsActions extends Environment {

    final static Logger log = Logger.getLogger("verificationsActions");


    static JavascriptExecutor js = (JavascriptExecutor) driver;


    public static void VerifyErrorScreen(String Field) throws Exception {

        String ExpectedText = "";
        String ActualText = "";

        if (Field.contains("Order in Progress")) {
            PageFactory.initElements(driver, verificationsPage.class);


            //Verifying h1 is having "Order in progress" Text
            ExpectedText = "You already have an order in progress";
            ActualText = pageobjects.verificationsPage.ErrorHeading.getText();
            Assert.assertTrue(ActualText.contains(ExpectedText),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");

            //Verifying "Click here" link is having url as "https://www.o2.co.uk/help/pay-monthly/how-to-track-your-order"
            ExpectedText = "https://www.o2.co.uk/help/pay-monthly/how-to-track-your-order";
            ActualText = pageobjects.verificationsPage.BodyContentText.getAttribute("href");
            Assert.assertTrue(ActualText.contains(ExpectedText),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");


        }
        Screenshots.captureScreenshot();
    }

    public static void VerifyheaderAsterisk() throws Exception {

        String ExpectedText = "";
        String ActualText = "";

        PageFactory.initElements(driver, verificationsPage.class);
        //Verifying Asterisk is present below Delivery header
        ExpectedText = "You'll need to give details for all fields marked with an asterisk (*)";
        ActualText = pageobjects.verificationsPage.AsteriskText.getText();
        Assert.assertTrue(ActualText.contains(ExpectedText),
                "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");

        Screenshots.captureScreenshot();
    }


}
