/*
 * Added by Vinudeep for Mobile Automation Testing
 */

package actionsPerformed;

import GlobalActions.RandomEmailAddressCreation;
import GlobalActions.Screenshots;
import helpers.Environment;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class FreeSimPageActions extends Environment {

	public List<HashMap<String, String>> datamap;
	final static Logger log = Logger.getLogger("FreeSimPageActions");

	public static void iPadsandTabletstab() throws InterruptedException, IOException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,150)", "");

		System.out.println("Clicking on iPadsandTabletstab");
		Thread.sleep(3000);
		pageobjects.FreeSimPage.iPadsandTabletstab.click();
		log.debug("Clicking on iPadsandTablets tab");
		Screenshots.captureScreenshot();

	}

	public static void Mobile_iPadsandTabletstab() throws InterruptedException, IOException {
		System.out.println("Clicking on iPadsandTabletstab");
		Thread.sleep(3000);
		pageobjects.FreeSimPage.iPadsandTabletstab.click();
		log.debug("Clicking on iPadsandTablets tab");
		Screenshots.captureScreenshot();

	}

	public static void iPadsim() throws InterruptedException, IOException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,450)", "");

		System.out.println("Clicking on Steady surfer ipad sim");
		Thread.sleep(1000);
		jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.SteadyiPadsim);
		log.debug("Clicking on iPadsandTablets tab");
		Screenshots.captureScreenshot();

	}

	public static void EnterManually(String Flatnumber, String Housename, String Address1, String Town, String Postcode)
			throws InterruptedException, IOException {

		System.out.println("Clicking on Enter Manually link");
		pageobjects.FreeSimPage.EnterManually.click();
		Thread.sleep(3000);
		log.debug("Clicking on Enter Manually link");
		pageobjects.FreeSimPage.Housename.sendKeys(Housename);
		log.debug("Entered the Housename");
		pageobjects.FreeSimPage.Address1.sendKeys(Address1);
		log.debug("Entered the address 1");
		pageobjects.FreeSimPage.Town.sendKeys(Town);
		log.debug("Entered the Town");
		pageobjects.FreeSimPage.Postcode.sendKeys(Postcode);
		log.debug("Entered the Postcode");
		Screenshots.captureScreenshot();
	}

	public static void AboutYouSection(String Firstname, String Lastname, String Contact_number)
			throws InterruptedException, IOException {

		pageobjects.FreeSimPage.Email_id.sendKeys(RandomEmailAddressCreation.RandomEmail());
		log.debug("Entered the mail id");
		Select dropdown = new Select(pageobjects.FreeSimPage.title);
		dropdown.selectByIndex(2);
		log.debug("Selected the title");
		pageobjects.FreeSimPage.Firstname.sendKeys(Firstname);
		log.debug("Entered the First name");
		pageobjects.FreeSimPage.Lastname.sendKeys(Lastname);
		log.debug("Entered the Last name");
		pageobjects.FreeSimPage.Contact_number.sendKeys(Contact_number);
		log.debug("Entered the Mobile number");
		pageobjects.FreeSimPage.Check_box.click();
		log.debug("Selected the TC checkbox");
		pageobjects.FreeSimPage.Order.click();
		log.debug("Clicked on place order button");
		Screenshots.captureScreenshot();
	}

	public static void selectSurfertypeAndSimtype(String SurferType, String SimType)
			throws InterruptedException, IOException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,450)", "");

		if (SurferType.equals("Light surfer") && SimType.equals("iPad")) {
			Thread.sleep(1000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.LightSurfer);
			log.debug("Clicking on light surfer tab");
			Thread.sleep(3000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.LightSurferiPadSim);
			log.debug("Clicking on light surfer tab");
		}
		if (SurferType.equals("Light surfer") && SimType.equals("Tablet")) {
			Thread.sleep(1000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.LightSurfer);
			log.debug("Clicking on light surfer tab");
			Thread.sleep(3000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.LightSurferTabletSim);
			log.debug("Clicking on light surfer tab");
		}
		if (SurferType.equals("Light surfer") && SimType.equals("Dongle")) {
			Thread.sleep(1000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.LightSurfer);
			log.debug("Clicking on light surfer tab");
			Thread.sleep(3000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.LightSurferDongleSim);
			log.debug("Clicking on light surfer tab");
		}
		if (SurferType.equals("Steady surfer") && SimType.equals("iPad")) {
			Thread.sleep(1000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.SteadySurfer);
			log.debug("Clicking on light surfer tab");
			Thread.sleep(3000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.SteadySurferiPadSim);
			log.debug("Clicking on light surfer tab");
		}
		if (SurferType.equals("Steady surfer") && SimType.equals("Tablet")) {
			Thread.sleep(1000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.SteadySurfer);
			log.debug("Clicking on light surfer tab");
			Thread.sleep(3000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.SteadySurferTabletSim);
			log.debug("Clicking on light surfer tab");
		}
		if (SurferType.equals("Steady surfer") && SimType.equals("Dongle")) {
			Thread.sleep(1000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.SteadySurfer);
			log.debug("Clicking on light surfer tab");
			Thread.sleep(3000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.SteadySurferDongleSim);
			log.debug("Clicking on light surfer tab");
		}
		if (SurferType.equals("Ultimate surfer") && SimType.equals("iPad")) {
			Thread.sleep(1000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.UltimateSurfer);
			log.debug("Clicking on light surfer tab");
			Thread.sleep(3000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.UltimateSurferiPadSim);
			log.debug("Clicking on light surfer tab");
		}
		if (SurferType.equals("Ultimate surfer") && SimType.equals("Tablet")) {
			Thread.sleep(1000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.UltimateSurfer);
			log.debug("Clicking on light surfer tab");
			Thread.sleep(3000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.UltimateSurferTabletSim);
			log.debug("Clicking on light surfer tab");
		}
		if (SurferType.equals("Ultimate surfer") && SimType.equals("Dongle")) {
			Thread.sleep(1000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.UltimateSurfer);
			log.debug("Clicking on light surfer tab");
			Thread.sleep(3000);
			jse.executeScript("arguments[0].click();", pageobjects.FreeSimPage.UltimateSurferDongleSim);
			log.debug("Clicking on light surfer tab");
		}
		Screenshots.captureScreenshot();
	}

}
