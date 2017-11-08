package steps;

import GlobalActions.*;
import actionsPerformed.*;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Filereadingutility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import actionsPerformed.UpdateDevicePlanLinkEmailAddressActions;

public class E2EOrderPlaced_Steps {

    private static final String Filteroption = null;
    public WebDriver driver;
    public static AndroidDriver<AndroidElement> andDriver;
    public List<HashMap<String, String>> datamap;
    String FilterDataOption = null;
    LinkedList<String> expectedListBeforeSort = null;
    LinkedList<String> originalList = null;
    ArrayList<Integer> originalTariffList = null;
    ArrayList<Integer> expectedTariffListBeforeSort = null;
    LinkedList<String> TempList3 = null;
    String DataFilterRange = null;
    ArrayList<Integer> datalistbefore = new ArrayList<Integer>();
    ArrayList<Integer> datalistafter = new ArrayList<Integer>();
    ArrayList<Integer> monthlycostlistafter = new ArrayList<Integer>();
    ArrayList<Integer> upfrontcostlistafter = new ArrayList<Integer>();
    final static Logger log = Logger.getLogger("E2EOrderPlaced_Steps");

    public E2EOrderPlaced_Steps() {
        driver = Hooks.driver;
        // datamap = DataReader.data();

    }

    /**
     * ############## All the Below are for the Navigation Journeys
     */


    @Given("^I am an CFA user and Lands on Mobile shop page$")
    public void i_am_an_CFA_user_and_Lands_on_Mobile_shop_page() throws Throwable {
        String title = driver.getTitle();
        System.out.println(title);
    }

    @And("^navigate to PayG SIMO page in Mobile$")
    public void navigate_to_PayG_SIMO_page_in_Mobile() throws Throwable {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        try {
            MouseHoverAction.MobilePayGSimLandingPage();
        } catch (Exception e) {
            e.printStackTrace();
            driver.findElement(By.xpath("//*[@id='no']/span")).click();
        }
    }

    @And("^Tap on iPads and Tablets Tab$")
    public void tap_on_iPads_and_Tabets_Tab() throws Throwable {
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            PageFactory.initElements(driver, FreeSimPage.class);
            FreeSimPageActions.Mobile_iPadsandTabletstab();
        } catch (Exception e) {
            driver.findElement(By.xpath("//*[@id='no']/span")).click();
        }

    }

    @And("^Pick a Sim ([^\"]*) and ([^\"]*)$")
    public void tap_on_iPad_Sims_Pick_a_Sim(String SurferType, String SimType) throws Throwable {
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            PageFactory.initElements(driver, FreeSimPage.class);
            FreeSimPageActions.selectSurfertypeAndSimtype(SurferType, SimType);
        } catch (Exception e) {
            Assert.fail("unable to pick sim");
        }

    }


    @And("^Verify user is navigated to Delivery details page$")
    public void verify_user_is_navigated_to_Delivery_details_page() throws Throwable {
        try {
            String title = driver.getTitle();
            System.out.println(title);
        } catch (Exception e) {
            Assert.fail("unable to verify delivery details page");
        }
    }

    @And("^input the below details in Free Sim Delivery page$")
    public void Freesim_inputDetailsDeliveryPage(DataTable userData) throws Throwable {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            PageFactory.initElements(driver, DeliveryPage.class);
            DeliveryPageActions.SetDelivery_Datatable(userData);
            Thread.sleep(5000);
            DeliveryPageActions.AboutYou_Datatable_FreeSim(userData);
            Thread.sleep(2000);
            DeliveryPageActions.MobileClickContinue();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Unable to input details in delivery page");
            Assert.fail("Unable to input details in delivery page");
        }
    }

    @Then("^Free Sim order confirmation is displayed$")
    public void free_Sim_order_confirmation_is_displayed() throws Throwable {

        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            PageFactory.initElements(driver, OrderConfirmationPage.class);
            OrderConfirmationPageActions.gettitlepage();
            OrderConfirmationPageActions.FreeSimMessage();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Error in order confirmation page , Please review the screenshots for failure");
            Assert.fail("Error in order confirmation page , Please review the screenshots for failure");

        }


    }

    @Given("^I am an existing user and Launch MyO2 app$")
    public void iAmAnExistingUserAndLandsMyOApp() throws Throwable {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("In MyO2 app");
       // driver.getTitle();
        Thread.sleep(2000);


    }


    @When("^Entered Valid Username, Password and continue$")
    public void enteredValidUsernamePasswordAndContinue() throws Throwable {
        MyO2LoginPageActions.login();
        Thread.sleep(2000);
    }

    @Then("^Enter valid Security code and Continue$")
    public void enterValidSecurityCodeAndContinue() throws Throwable {
        MyO2LoginPageActions.securityPassword();
        Thread.sleep(3000);
    }

    @And("^Navigate through get started pages and Tap on get started button$")
    public void navigateThroughGetStartedPagesAndTapOnGetStartedButton() throws Throwable {

    }

    @And("^land on My details page$")
    public void landOnMyDetailsPage() throws Throwable {

    }

    @When("^I open the left navigation pane$")
    public void iOpenTheLeftNavigationPane() throws Throwable {
        Thread.sleep(6000);
        MyO2LoginPageActions.openLeftNavigation();
        Thread.sleep(3000);
    }

    @And("^Tap on Sign out$")
    public void tapOnSignOut() throws Throwable {
        Thread.sleep(6000);
        MyO2LoginPageActions.signOut();
        Thread.sleep(3000);
    }

    @Then("^I should be successfully Signout$")
    public void iShouldBeSuccessfullySignout() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^skip get started screen$")
    public void skipGetStartedScreen() throws Throwable {
        Thread.sleep(6000);
        MyO2LoginPageActions.skip();
        Thread.sleep(3000);
    }
}

