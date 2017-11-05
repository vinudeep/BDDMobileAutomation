package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderConfirmationPage {

	@FindBy(how = How.ID, using = "terms")
	public static WebElement TermsCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='order-number']/h2")
	public static WebElement Message;

	@FindBy(how = How.XPATH, using = "//*[@id='order-number']/p")
	public static WebElement OrderconfirmationMessage;

	@FindBy(how = How.XPATH, using = "//*[@id='delivery-section']")
	public static WebElement deliverySection;

	@FindBy(how = How.XPATH, using = "//*[@id='imsMessage']")
	public static WebElement imsMessage;
	
	//@FindBy(how = How.XPATH, using = "//*[@id='contract-message']")
	@FindBy(how = How.ID, using = "contract-message")
	public static WebElement OrderContractMessageOC;
	
	@FindBy(how = How.ID, using = "order-id")
	public static WebElement orderid;
	
	@FindBy(how = How.XPATH, using = "//*[@id='confirmation']/div/div[1]")
	public static WebElement FreesimOrderConfirmation;

}
