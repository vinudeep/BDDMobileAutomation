package GlobalActions;

import helpers.Environment;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.awt.*;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class MouseHoverAction extends Environment {

	final static Logger log = Logger.getLogger("MouseHoverAction");

	// Below will navigate to PayM Phones Page

	public static void PayMPhonesLandingPage() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine) {
			try {
				System.out.println("Performing PAYM Phones landing page navigations");
				log.debug("Performing PAYM Phones landing page navigations");

				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);
				log.debug("Moving Mouse on the Shop Tab");

				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnPhones).build().perform();
				log.debug("Moving Mouse on the Phones dropdown");

				Thread.sleep(1000);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnPAYMPhones).build().perform();
				log.debug("Moving Mouse on the Paymonthly link");
				Screenshots.captureScreenshot();

				Thread.sleep(1000);
				pageobjects.MouseHoverPage.MoveMouseOnPAYMPhones.click();
				Screenshots.captureScreenshot();

				log.debug("Clicking on PayM Phones");

				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();

				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");

				Worksfine = true;
				Screenshots.captureScreenshot();

			} catch (ElementNotVisibleException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(2000);

			}
		}
	}

	// Below will navigate to PayG Phones Page

	public static void SimIpadSimsPage() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine) {
			try {
				System.out.println("Navigating to Sims --> Ipad Sims landing page navigations");
				log.debug("Navigating to Sims --> Ipad Sims landing page navigations");

				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);
				log.debug("Moving Mouse on the Shop Tab");
				System.out.println("Moving Mouse on the Shop Tab");

				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnSims).build().perform();
				log.debug("Moving Mouse on the Sims in Shop Dropdown");
				System.out.println("Moved Mouse on Sims");

				Thread.sleep(1000);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnIpadSims).build().perform();
				log.debug("Moving Mouse on the Ipad Sims link");
				System.out.println("Moving Mouse on the Ipad Sims link");
				Screenshots.captureScreenshot();

				Thread.sleep(1000);
				pageobjects.MouseHoverPage.MoveMouseOnIpadSims.click();
				System.out.println("Clicking on ipad sims link");
				Screenshots.captureScreenshot();

				log.debug("Trying to take screenshots of page");

				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();

				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");

				Worksfine = true;

			} catch (ElementNotVisibleException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(2000);

			}
		}
	}

	// The Below will navigate to Sims --- > Tablet sims page
	public static void SimTabletsSimsPage() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine) {
			try {
				System.out.println("Navigating to Sims --> Tablet Sims landing page navigations");
				log.debug("Navigating to Sims --> Tablet Sims landing page navigations");

				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 110);
				log.debug("Moving Mouse on the Shop Tab");

				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnSims).build().perform();
				log.debug("Moving Mouse on the Sims in Shop Dropdown");

				Thread.sleep(3000);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnTabletSims).build().perform();
				log.debug("Moving Mouse on the Ipad Sims link");
				Screenshots.captureScreenshot();

				Thread.sleep(3000);
				pageobjects.MouseHoverPage.MoveMouseOnTabletSims.click();
				Screenshots.captureScreenshot();

				log.debug("Trying to take screenshots of page");

				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();

				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");

				Worksfine = true;

			} catch (ElementNotVisibleException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(3000);

			}
		}
	}

	// Below will navigate to PayM Phones Page

	public static void PayGPhonesLandingPage() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine) {

			try {
				System.out.println("Performing PAYG Phones landing page navigations");
				log.debug("Performing PAYG Phones landing page navigations");

				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);
				log.debug("Moving Mouse on the Shop Tab");

				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnPhones).build().perform();
				log.debug("Moving Mouse on the Phones dropdown");

				Thread.sleep(2000);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnPAYGPhones).build().perform();
				log.debug("Moving Mouse on the Pay as you Go link");
				Screenshots.captureScreenshot();

				Thread.sleep(2000);
				pageobjects.MouseHoverPage.MoveMouseOnPAYGPhones.click();
				Screenshots.captureScreenshot();

				log.debug("Clicking on PayG Phones");

				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();

				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");

				Worksfine = true;

			} catch (ElementNotVisibleException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(3000);

			}
		}
	}

	// Below will navigate to Like New Phones Page

	/*
	 * public static void likeNewHomepageNavigation() throws Exception {
	 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); boolean
	 * Worksfine = false; while(!Worksfine) try {
	 * System.out.println("Performing Like New navigations");
	 * log.debug("Performing Like New navigations");
	 * 
	 * Point coordinates =
	 * pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation(); Robot robot =
	 * new Robot(); robot.mouseMove(coordinates.getX(),coordinates.getY()+120);
	 * 
	 * Actions action = new Actions(driver);
	 * action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnPhones).build(
	 * ).perform(); Thread.sleep(2000);
	 * action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnLikeNew).build
	 * ().perform(); Thread.sleep(2000);
	 * 
	 * pageobjects.MouseHoverPage.MoveMouseOnLikeNew.click();
	 * Screenshots.captureScreenshot();
	 * 
	 * //Move mouse pointer away from location Point coordinates2 =
	 * driver.findElement(By.xpath("//*[@id='header-consumer']/div")).
	 * getLocation(); Robot robot2 = new Robot();
	 * robot2.mouseMove(coordinates2.getX(),coordinates.getY()+300);
	 * 
	 * log.debug("Moved Mouse to somewhere side of page");
	 * 
	 * 
	 * Worksfine = true;
	 * 
	 * } catch(ElementNotVisibleException e) { //check if popup is present, if yes,
	 * handle it. Environment.driver.switchTo().frame("edr_l_first");
	 * System.out.println("********We are switch to the iframe*******"); log.
	 * debug("Popup has appeared on the screen, Hence trying to close the survey" );
	 * Screenshots.captureScreenshot(); //Saying no to survey
	 * driver.findElement(By.xpath("//a[@id='no']/span")).click();
	 * log.debug("Closing the popup by saying No to Survey");
	 * System.out.println("*******Saying no to survey*******"); System.out.
	 * println("*********Existing the popups present in iframe***************");
	 * log.debug("Exiting the Survey");
	 * Environment.driver.switchTo().defaultContent(); Thread.sleep(3000);
	 * 
	 * }
	 * 
	 * }
	 */

	// Below will navigate to Like New Phones Page

	public static void likeNewHomepageNavigation() throws Exception {
		log.debug("Opening likeNewHomepageNavigation function");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine)
			try {
				System.out.println("Performing Like New navigations");
				log.debug("Performing Like New navigations");

				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);

				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnPhones).build().perform();
				Thread.sleep(2000);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnLikeNew).build().perform();
				Thread.sleep(2000);

				pageobjects.MouseHoverPage.MoveMouseOnLikeNew.click();
				Screenshots.captureScreenshot();

				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();
				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);

				log.debug("Moved Mouse to somewhere side of page");

				Worksfine = true;

				log.debug("Hovered mouse successfully to Like New Phones option");

			} catch (ElementNotVisibleException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(3000);

			}

	}

	// Below will navigate to Tablets PayM Page
	public static void PayMTabletsLandingPage() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine)
			try {
				System.out.println("Performing navigations to PAYM Tablets");
				log.debug("Performing navigations to PAYM Tablets");
				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);
				log.debug("Moving Mouse on the Shop Tab");
				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnTablets).build().perform();
				Thread.sleep(2000);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnBrowseTablets).build().perform();
				Thread.sleep(2000);
				pageobjects.MouseHoverPage.MoveMouseOnBrowseTablets.click();

				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();
				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");

				Worksfine = true;
				Screenshots.captureScreenshot();

			} catch (ElementNotVisibleException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(3000);
				Screenshots.captureScreenshot();

			}

	}

	// Below will navigate to PAYM SIMO Page

	public static void PayMSimoNavigation() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine)
			try {

				System.out.println("Performing PAYM SimO navigations");
				log.debug("Performing PAYM SimO navigations");
				Thread.sleep(1000);
				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);
				log.debug("Moving mouse on the Shop Tab");
				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnSims).build().perform();
				log.debug("Moving mouse on the Sims in Shop Dropdown");
				Thread.sleep(2000);

				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnPayMSims).build().perform();
				log.debug("Moving mouse on the PayM Sims");
				Thread.sleep(2000);
				pageobjects.MouseHoverPage.MoveMouseOnPayMSims.click();
				log.debug("Clicking on Pay M Sims");
				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();
				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");

				Worksfine = true;
				Screenshots.captureScreenshot();

			} catch (NoSuchElementException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(3000);
				Screenshots.captureScreenshot();

			}

	}

	// Below will navigate to SMART TECH > SMART WATCHES Page
	public static void SmartwatchesLandingPage() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine)
			try {

				System.out.println("Performing Smartwatches navigations");
				log.debug("Performing Smartwatches navigations");

				driver.navigate().refresh();

				Thread.sleep(10000);
				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);

				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnSmarttechTab).build().perform();
				Thread.sleep(2000);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnSmartwatches).build().perform();
				Thread.sleep(2000);
				pageobjects.MouseHoverPage.MoveMouseOnSmartwatches.click();

				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();
				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");

				Worksfine = true;
				Screenshots.captureScreenshot();

			} catch (NoSuchElementException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(3000);
			}
	}

	// Below will navigate to SMART TECH > FITNESS TRACKERS Page
	public static void FitnessLandingPage() throws Exception {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine)
			try {

				System.out.println("Performing Fitness tracker navigations");
				log.debug("Performing Fitness navigations");

				driver.navigate().refresh();
				Thread.sleep(5000);

				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				System.out.println("Getting coordinates for shop tab");
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);

				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnSmarttechTab).build().perform();
				System.out.println("Moving mouse on SmartTech section");
				Thread.sleep(3000);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnFitnessTrackers).build().perform();
				System.out.println("Moving mouse on SmartTech section -- > Fitness Trackers");
				Thread.sleep(4000);
				pageobjects.MouseHoverPage.MoveMouseOnFitnessTrackers.click();
				System.out.println("Moving mouse on SmartTech section -- > Clicking on Fitness Tracker");

				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();
				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");

				Worksfine = true;
				Screenshots.captureScreenshot();

			} catch (NoSuchElementException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(3000);
			}
	}

	// Below will navigate to ACCESSORIES Page
	public static void AccessoriesLandingPage() throws Exception {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine)
			try {

				System.out.println("Performing Accessories navigations");
				log.debug("Performing Accessories navigations");

				driver.navigate().refresh();
				Thread.sleep(5000);

				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 110);

				Actions action = new Actions(driver);
				// action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnShopTab).build().perform();

				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnAccessoriesTab).build().perform();
				Thread.sleep(2000);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnAllAccessories).build().perform();
				Thread.sleep(2000);
				pageobjects.MouseHoverPage.MoveMouseOnAllAccessories.click();

				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();
				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");

				Worksfine = true;
				Screenshots.captureScreenshot();

			} catch (NoSuchElementException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(3000);
			}
	}

	// Below will navigate to PAYG MBB page
	public static void PayGMBBPage() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine)
			try {
				System.out.println("Performing navigations to PAYG MBB");
				log.debug("Performing navigations to PAYG MBB");

				/*
				 * driver.navigate().refresh(); Thread.sleep(5000);
				 */

				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 110);

				log.debug("Moving Mouse on the Shop Tab");
				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnMobileBroadband).build().perform();
				Thread.sleep(2000);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnPayGMBB).build().perform();
				Thread.sleep(2000);
				pageobjects.MouseHoverPage.MoveMouseOnPayGMBB.click();
				log.debug("Moving Mouse on the PAYG MBB tab");

				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();
				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");
				Worksfine = true;
				Screenshots.captureScreenshot();

			} catch (ElementNotVisibleException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(3000);

			}

	}

	/*
	 * ############## All the Below are for the CFU customer journey
	 * ###################
	 */

	// Below will navigate to upgrade --- > upgrade now page

	public static void UpgradeandUpgradeNow() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine)
			try {

				System.out.println("Performing Upgrade -- > upgrade now navigations");
				log.debug("Performing PAYG MBB navigations");
				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);

				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MouseMoveonUpgrade).build().perform();
				System.out.println("Moved mouse on upgrades");
				Thread.sleep(2000);
				action.moveToElement(pageobjects.MouseHoverPage.MouseMoveonUpgradeAndUpgradeNow).build().perform();
				System.out.println("Moved mouse on upgrades -- > upgradenow");
				Thread.sleep(4000);
				pageobjects.MouseHoverPage.MouseMoveonUpgradeAndUpgradeNow.click();
				System.out.println("Moved mouse on upgrades -- > upgradenow and clicked");

				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();
				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");

				Worksfine = true;
				Screenshots.captureScreenshot();

			} catch (ElementNotVisibleException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				Environment.driver.switchTo().defaultContent();
				Screenshots.captureScreenshot();

			}

	}

	// Below will navigate to PAYM MBB page
	public static void PayMMBBPage() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine)
			try {
				System.out.println("Performing navigations to PAYM MBB");
				log.debug("Performing navigations to PAYM MBB");
				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);
				log.debug("Moving Mouse on the Shop Tab");
				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnMobileBroadband).build().perform();
				System.out.println("Moved Mouse on the Mobile broadband dropdown");

				Thread.sleep(4000);

				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnPayMMBB).build().perform();
				Thread.sleep(2000);
				System.out.println("Building Mousehover on the PAYM MBB option");

				pageobjects.MouseHoverPage.MoveMouseOnPayMMBB.click();
				log.debug("Moving Mouse on the PAYM MBB tab");
				System.out.println("Moving Mouse on the PAYM MBB option");

				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();
				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");
				Worksfine = true;
				Screenshots.captureScreenshot();

			} catch (ElementNotVisibleException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(3000);
				Screenshots.captureScreenshot();

			}

	}

	public static void iPadPage() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine)
			try {
				System.out.println("Performing navigations to iPad page");
				log.debug("Performing navigations to iPad page");
				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);
				log.debug("Moving Mouse on the Shop Tab");
				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnTablets).build().perform();
				Thread.sleep(2000);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOniPad).build().perform();
				Thread.sleep(2000);
				pageobjects.MouseHoverPage.MoveMouseOniPad.click();
				log.debug("Moving Mouse on the iPad tab");

				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();
				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");
				Worksfine = true;
				Screenshots.captureScreenshot();

			} catch (ElementNotVisibleException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(3000);
				Screenshots.captureScreenshot();

			}

	}
	// mousehover action

	// Below will navigate to PAYG FreeSim Page

	public static void PayGFreeSimNavigation() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine)
			try {

				System.out.println("Performing PayGFreeSim Navigations");
				log.debug("Performing PayGFreeSim Navigations");

				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);
				log.debug("Moving mouse on the Shop Tab");
				System.out.println("Moving Mouse on the Shop Tab");

				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MouseOnSims).build().perform();
				log.debug("Moving mouse on the Sims in Shop Dropdown");
				Thread.sleep(1000);

				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnPayGSims).build().perform();
				log.debug("Moving mouse on the PayG Sims");
				System.out.println("Moving mouse on the PayG Sims");
				Thread.sleep(1000);
				pageobjects.MouseHoverPage.MoveMouseOnPayGSims.click();
				log.debug("Clicking on PayG Sims");

				// Move mouse pointer away from location
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();
				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");

				Worksfine = true;
				Screenshots.captureScreenshot();

			} catch (NoSuchElementException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(3000);
				Screenshots.captureScreenshot();

			}

	}

	// Below will navigate to PAYG SIMO Page
	public static void PayGSimoNavigation() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine)
			try {
				System.out.println("Performing PAYG SimO navigations");
				log.debug("Performing PAYG SimO navigations");
				Thread.sleep(1000);
				Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
				Robot robot = new Robot();
				robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);
				log.debug("Moving mouse on the Shop Tab");
				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnSims).build().perform();
				log.debug("Moving mouse on the Sims in Shop Dropdown");
				Thread.sleep(2000);

				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnPayGSims).build().perform();
				log.debug("Moving mouse on the PayG Sims");
				Thread.sleep(2000);
				pageobjects.MouseHoverPage.MoveMouseOnPayGSims.click();
				log.debug("Clicking on Pay G Sims");
				// Move mouse pointer away from location
				Thread.sleep(2000);
				Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();
				Robot robot2 = new Robot();
				robot2.mouseMove(coordinates2.getX(), coordinates.getY() + 300);
				log.debug("Moved Mouse to somewhere side of page");

				Worksfine = true;
				Screenshots.captureScreenshot();
			} catch (NoSuchElementException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(3000);

			}

	}
	public static void MobilePayGSimLandingPage() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine)
			try {

				log.debug("Performing PayGFreeSim Navigations");
				driver.findElement(By.xpath("//div[@class='mobile-nav-toggle is-mobile']/a")).click();
				log.debug("Clicked on --- icon at the end of the screen");
				driver.findElement(By.id("pn1")).click();
				log.debug("Clicked on shop tab");
				driver.findElement(By.xpath("//a[@href='https://www.o2.co.uk/shop/sim-cards'][@manual_cm_re='meganav_Shop-_-Sims-_-na']")).click();
				log.debug("Clicked on sims link");
				driver.findElement(By.xpath("//a[@href='https://www.o2.co.uk/shop/sim-cards/pay-as-you-go/'][@manual_cm_re='meganav_Shop-_-Sims-_-Pay & Go sims']")).click();
				log.debug("Clicking on PayG Sims");
				String ExpectedText="Pay As You Go sims";
				String ActualText=driver.findElement(By.xpath("//div[@class='info']/h1")).getText();
				Assert.assertTrue(ActualText.contains(ExpectedText),
						"Assertion Failed: Expected Message: " + ExpectedText + " is not present in the page");
				log.debug("Assertion Worked");

				Worksfine=true;


			} catch (Exception e) {
				// check if popup is present, if yes, handle it.
				log.debug("Exception caught");

				driver.findElement(By.xpath("//*[@id='no']/span")).click();
				log.debug("Completed Exception caught");

				Thread.sleep(3000);

			}

	}

	public static void PayasyouGoTablets() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean Worksfine = false;
		while (!Worksfine) {
			try {
				System.out.println("Performing Pay as you go Tablets navigations");
				log.debug("Performing Pay as you go Tablets navigations");

				Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnShopTab).build().perform();

				//Actions action = new Actions(driver);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseOnTablets).build().perform();
				log.debug("Moving Mouse on the Tablets dropdown");

				Thread.sleep(1000);
				action.moveToElement(pageobjects.MouseHoverPage.MoveMouseonPayGTablets).build().perform();
				log.debug("Moving Mouse on the PAYG Tablets link");
				Screenshots.captureScreenshot();

				Thread.sleep(1000);
				pageobjects.MouseHoverPage.MoveMouseonPayGTablets.click();
				Screenshots.captureScreenshot();

				log.debug("Clicking on PayM Phones");


				Worksfine = true;
				Screenshots.captureScreenshot();

			} catch (ElementNotVisibleException e) {
				// check if popup is present, if yes, handle it.
				Environment.driver.switchTo().frame("edr_l_first");
				System.out.println("********We are switch to the iframe*******");
				log.debug("Popup has appeared on the screen, Hence trying to close the survey");
				Screenshots.captureScreenshot();
				// Saying no to survey
				driver.findElement(By.xpath("//a[@id='no']/span")).click();
				log.debug("Closing the popup by saying No to Survey");
				System.out.println("*******Saying no to survey*******");
				System.out.println("*********Existing the popups present in iframe***************");
				log.debug("Exiting the Survey");
				Environment.driver.switchTo().defaultContent();
				Thread.sleep(2000);

			}
		}
	}
}
