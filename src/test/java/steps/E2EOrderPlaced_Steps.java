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


    @Given("^I am an CFA user and Lands on shop page$")
    public void i_am_an_CFA_user_and_Lands_on_shop_page() throws Throwable {
        try {
          //  ShopLandingPageAction.GetTitle();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("unable to get title");
            Assert.fail("unable to get title");
        }

    }

    @And("^navigate to PAYM Phones page$")
    public void navigate_to_PAYM_Phones_page() throws Throwable {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            PageFactory.initElements(driver, MouseHoverPage.class);

            MouseHoverAction.PayMPhonesLandingPage();
            Autoredirection.redirect();
            Thread.sleep(10000);
            GlobalActions.CommonFunctions.checkTitle("PayM Phones Page");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("unable to do mousehover to phones");
            Assert.fail("unable to do mousehover to phones");
        }
    }


}

