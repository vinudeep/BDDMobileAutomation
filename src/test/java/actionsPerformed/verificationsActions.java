package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.AdditionalInformationPage;
import pageobjects.DeliveryPage;
import pageobjects.PaymentPage;
import pageobjects.verificationsPage;

import static actionsPerformed.PaymentPageActions.Set_Bank_details;
import static actionsPerformed.PaymentPageActions.Time_At_Address;

public class verificationsActions extends Environment {

    final static Logger log = Logger.getLogger("verificationsActions");


    static JavascriptExecutor js = (JavascriptExecutor) driver;


    public static void verifyAsteriskMandatory(String Field) throws Exception {

        String ExpectedText = "";
        String ActualText = "";

        if (Field.contains("Delivery")) {
            PageFactory.initElements(driver, DeliveryPage.class);
            //Verifying if "*" present in Actual Text in housenumber and post code
            ExpectedText = "*";
            ActualText = pageobjects.DeliveryPage.HouseNumberText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            //Below is for finding text in post code text field
            ActualText = pageobjects.DeliveryPage.PostcodeText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            //Below will set hardcoded post code and housenumeber  - BS12
            DeliveryPageActions.SetDelivery();

            //Verifying if "*" present in About you section of delivery page

            ActualText = pageobjects.DeliveryPage.emailAddressText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.DeliveryPage.titleText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.DeliveryPage.nameText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.DeliveryPage.ContactNumberText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.DeliveryPage.PasswordText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.DeliveryPage.SecurityAnswerText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.DeliveryPage.DateofBirthText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");

        }
        if (Field.contains("Payments")) {
            PageFactory.initElements(driver, PaymentPage.class);

            ExpectedText = "*";
            ActualText = pageobjects.PaymentPage.NameonAccountText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.PaymentPage.AccountnumberText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.PaymentPage.SortcodeText.getText();

//Below will set bank details
            Set_Bank_details();

            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.PaymentPage.TimeAtAddressText.getText();

            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");

            Time_At_Address();

            //Below is iframe related

            driver.switchTo().frame("payment-iframe"); // switching the frame by ID

            System.out.println("********We are switch to the iframe*******");
            log.debug("Entering the Payments section");
            Thread.sleep(5000);

            ActualText = pageobjects.PaymentPage.NameOnCardText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.PaymentPage.CardNumberText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.PaymentPage.ExpiryDateText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.PaymentPage.CVVSecurityCodeText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");

            PaymentPage.Name_On_Card.sendKeys("Test Accepta");
            log.debug("Entering name of the card as Test Accepta");

            Thread.sleep(2000);
            PaymentPage.Card_Number.sendKeys("4539791001730106");
            log.debug("Entered Card number as 4539xxxxxxxxxx06");
            Thread.sleep(2000);
            PaymentPage.Expiry_Month.sendKeys("01");
            log.debug("Entered Expiry Month");
            Thread.sleep(2000);
            PaymentPage.Expiry_Year.sendKeys("2020");
            log.debug("Entered Expiry Year");
            Thread.sleep(2000);
            PaymentPage.CVV_Security_Code.sendKeys("123");
            log.debug("Entered CVV security code");
            Thread.sleep(2000);
            PaymentPage.Continue_Next_Step.sendKeys(Keys.ENTER);
            log.debug("Clicking on continue to next step");
            Thread.sleep(2000);
            System.out.println("*********We are done***************");
            log.debug("Exiting the Payments section");
            driver.switchTo().defaultContent();

        }

        if (Field.contains("Review")) {

        //TODO some action here

        }


        if (Field.contains("PAYG Free sim")) {

            PageFactory.initElements(driver, DeliveryPage.class);
            //Verifying if "*" present in Actual Text in housenumber and post code
            ExpectedText = "*";
            ActualText = pageobjects.DeliveryPage.HouseNumberText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            //Below is for finding text in post code text field
            ActualText = pageobjects.DeliveryPage.PostcodeText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            //Below will set hardcoded post code and housenumeber  - BS12
            DeliveryPageActions.SetDelivery();

            //Verifying if "*" present in About you section of delivery page

            ActualText = pageobjects.DeliveryPage.emailAddressText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.DeliveryPage.titleText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.DeliveryPage.nameText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.DeliveryPage.ContactNumberText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
        }

        if (Field.contains("Passport")) {

            PageFactory.initElements(driver, AdditionalInformationPage.class);
            ExpectedText = "*";
            ActualText = pageobjects.AdditionalInformationPage.CountryCodeText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.AdditionalInformationPage.PassportNumberText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");

        }

        if (Field.contains("Driving")) {

            PageFactory.initElements(driver, AdditionalInformationPage.class);
            ExpectedText = "*";
            ActualText = pageobjects.AdditionalInformationPage.DrivingLicenceNumberText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.AdditionalInformationPage.PostCodeText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");

        }

        if (Field.contains("OTAC")) {

            PageFactory.initElements(driver, AdditionalInformationPage.class);
            ExpectedText = "*";
            ActualText = pageobjects.AdditionalInformationPage.EnterOtacCodeText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.AdditionalInformationPage.PostCodeText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");

        }
        if (Field.contains("CFU Payments")) {
            PageFactory.initElements(driver, PaymentPage.class);

            ExpectedText = "*";
            ActualText = pageobjects.PaymentPage.NameonAccountText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.PaymentPage.AccountnumberText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.PaymentPage.SortcodeText.getText();

//Below will set bank details
            Set_Bank_details();

            /*Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.PaymentPage.TimeAtAddressText.getText();

            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");

            Time_At_Address();*/

            //Below is iframe related

            driver.switchTo().frame("payment-iframe"); // switching the frame by ID

            System.out.println("********We are switch to the iframe*******");
            log.debug("Entering the Payments section");
            Thread.sleep(5000);

            ActualText = pageobjects.PaymentPage.NameOnCardText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.PaymentPage.CardNumberText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.PaymentPage.ExpiryDateText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
            ActualText = pageobjects.PaymentPage.CVVSecurityCodeText.getText();
            Assert.assertTrue(ActualText.contains("*"),
                    "Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");

            PaymentPage.Name_On_Card.sendKeys("Test Accepta");
            log.debug("Entering name of the card as Test Accepta");

            Thread.sleep(2000);
            PaymentPage.Card_Number.sendKeys("4539791001730106");
            log.debug("Entered Card number as 4539xxxxxxxxxx06");
            Thread.sleep(2000);
            PaymentPage.Expiry_Month.sendKeys("01");
            log.debug("Entered Expiry Month");
            Thread.sleep(2000);
            PaymentPage.Expiry_Year.sendKeys("2020");
            log.debug("Entered Expiry Year");
            Thread.sleep(2000);
            PaymentPage.CVV_Security_Code.sendKeys("123");
            log.debug("Entered CVV security code");
            Thread.sleep(2000);
            PaymentPage.Continue_Next_Step.sendKeys(Keys.ENTER);
            log.debug("Clicking on continue to next step");
            Thread.sleep(2000);
            System.out.println("*********We are done***************");
            log.debug("Exiting the Payments section");
            driver.switchTo().defaultContent();

        }

        Screenshots.captureScreenshot();

    }

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
