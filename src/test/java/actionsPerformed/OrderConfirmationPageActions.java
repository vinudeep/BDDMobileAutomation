/*
 * Added by Vinudeep for Mobile Automation Testing
 */

package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class OrderConfirmationPageActions extends Environment {
	final static Logger log = Logger.getLogger("OrderConfirmationPageActions");

	public static void OrderConfirmationPageSections() throws IOException, InterruptedException {
		log.debug("Below are order confirmation page details");
		log.debug("The details are " + pageobjects.OrderConfirmationPage.OrderconfirmationMessage.getText());
		log.debug("...................................");
		log.debug("The details are " + pageobjects.OrderConfirmationPage.deliverySection.getText());
		log.debug("...................................");
		log.debug("The details are " + pageobjects.OrderConfirmationPage.imsMessage.getText());
		System.out.println("The details are " + pageobjects.OrderConfirmationPage.OrderconfirmationMessage.getText());
		System.out.println("...................................");
		System.out.println(pageobjects.OrderConfirmationPage.deliverySection.getText());
		System.out.println("...................................");
		System.out.println(pageobjects.OrderConfirmationPage.imsMessage.getText());
		Screenshots.captureScreenshot();
	}

	public static void gettitlepage() throws IOException, InterruptedException {

		System.out.println(driver.getTitle());
		log.info("The Page Title is " + driver.getTitle());
		Screenshots.captureScreenshot();

	}

	public static void MessageDisplayed() throws IOException, InterruptedException {
		System.out.println("This is order confirmation page and the message in this page is as below......");
		log.info("This is order confirmation/information page and the message in this page is as above......");

		try {
			List<WebElement> outercontainer = driver.findElements(By.xpath("//*[@id='order-number']"));
			log.debug("Trying to find the Element for order number using element identifier");

			List<WebElement> DataContainer = outercontainer.get(0).findElements(By.xpath("//*[@id='order-number']"));

			for (int i = 0; i <= DataContainer.size(); i++) {

				System.out.println(DataContainer.get(i).getText());
				log.info(DataContainer.get(i).getText());
			}
			Screenshots.captureScreenshot();
		} catch (IndexOutOfBoundsException e) {
			Screenshots.captureScreenshot();
		}
	}

	public static void VolteMessageDisplayed() throws IOException, InterruptedException {
		System.out.println("The Volte message in this page is as below......");
		try {
			List<WebElement> outercontainer = driver.findElements(By.xpath("//*[@id='imsMessage']"));

			List<WebElement> DataContainer = outercontainer.get(0).findElements(By.xpath("//*[@id='imsMessage']"));

			for (int i = 0; i <= DataContainer.size(); i++) {

				System.out.println(DataContainer.get(i).getText());
			}
			Screenshots.captureScreenshot();
		} catch (IndexOutOfBoundsException e) {
			Screenshots.captureScreenshot();
		}

	}

	public static String TimeslotMessage() {
		System.out.println("The delivery message in this page is as below......");
		try {
			List<WebElement> outercontainer = driver.findElements(By.xpath("//*[@id='home-standard-delivery']"));

			List<WebElement> DataContainer = outercontainer.get(0).findElements(By.xpath("//*[@id='time-slot-info']"));

			for (int i = 0; i <= DataContainer.size(); i++) {
				String ExpectedMessage = "Your order will be delivered for free, via Royal Mail, within three working days.";
				String message = DataContainer.get(i).getText();
				System.out.println(DataContainer.get(i).getText());

			}
		} catch (IndexOutOfBoundsException e) {

		}
		return null;

	}

	public static String DelayedDeliveryMessage() {
		System.out.println("The Delayed Delivery message in this page is as below......");
		try {
			List<WebElement> outercontainer = driver.findElements(By.xpath("//*[@id='delivery-section']"));

			List<WebElement> DataContainer = outercontainer.get(0)
					.findElements(By.xpath("//*[@id='delivery-section']"));

			for (int i = 0; i <= DataContainer.size(); i++) {
				String ExpectedMessage = "Your order will be delivered for free, via Royal Mail, within three working days.";
				String message = DataContainer.get(i).getText();
				System.out.println(DataContainer.get(i).getText());

			}
		} catch (IndexOutOfBoundsException e) {

		}
		return null;

	}

	public static String PaccodeinfoMessage() {
		System.out.println("The pac-code-info in this page is as below......");
		try {
			List<WebElement> outercontainer = driver.findElements(By.xpath("//*[@id='pac-code-info']"));

			List<WebElement> DataContainer = outercontainer.get(0).findElements(By.xpath("//*[@id='pac-code-info']"));

			for (int i = 0; i <= DataContainer.size(); i++) {
				String ExpectedMessage = "Your order will be delivered for free, via Royal Mail, within three working days.";
				String message = DataContainer.get(i).getText();
				System.out.println(DataContainer.get(i).getText());

			}
		} catch (IndexOutOfBoundsException e) {

		}
		return null;

	}

	public static void downloadPDFcopy() {
		System.out.println("Entering downloadPDFcopy function");
		driver.findElement(By.xpath("//a[@href='orderConfirmation.pdf']")).click();
		System.out.println("Completed downloading order confirmation");

	}

	public static void Orderid() throws Exception {
		System.out.println("Your order has been successfully placed.Order number: ");
		log.info("Your order has been successfully placed.Order number: ");
		System.out.println(pageobjects.OrderConfirmationPage.orderid.getText());
		String confirmation = pageobjects.OrderConfirmationPage.orderid.getText();
		log.debug("order number generated successfully");
		/*String relativePath = System.getProperty("user.dir");
		String ExcelPath = relativePath + "/Configurations/testData/TestResults.xlsx";
		Filereadingutility.ExcelDataConfig(ExcelPath);
		Filereadingutility.setData(1,1,1,confirmation);*/

	}

	public static void FreeSimMessage() {
		System.out.println("This is order confirmation page and the message in this page is as below......");
		log.info("This is order confirmation/information page and the message in this page is as above......");

		System.out.println(pageobjects.OrderConfirmationPage.FreesimOrderConfirmation.getText());
	}

}
