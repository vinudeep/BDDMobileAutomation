package pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DeliveryPage {

    @FindBy(how = How.ID, using = "housenumber")
    public static WebElement Housenumber;

    @FindBy(how = How.ID, using = "postcode")
    public static WebElement Postcode;

    @FindBy(how = How.ID, using = "postcode-submit")
    public static WebElement Find_Address;

    @FindBy(how = How.XPATH, using = "//*[@id='delivery-address-selection']/li[1]")
    public static WebElement SelectAddress1;

    @FindBy(how = How.XPATH, using = "//*[@id='delivery-address-selector']")
    public static WebElement SelectAddressDropdown;

    @FindBy(how = How.ID, using = "email")
    public static WebElement Email_Address;

    @FindBy(how = How.ID, using = "title")
    public static WebElement Title;


    @FindBy(how = How.ID, using = "first-name")
    public static WebElement First_Name;

    @FindBy(how = How.ID, using = "last-name")
    public static WebElement Last_Name;

    @FindBy(how = How.ID, using = "contact-number")
    public static WebElement Contact_Number;

    @FindBy(how = How.ID, using = "password")
    public static WebElement Password;

    @FindBy(how = How.ID, using = "security-questions")
    public static WebElement Security_Question;

    @FindBy(how = How.ID, using = "security-answer")
    public static WebElement security_answer;

    @FindBy(how = How.ID, using = "date-dd")
    public static WebElement date;

    @FindBy(how = How.ID, using = "date-mm")
    public static WebElement Month;

    @FindBy(how = How.ID, using = "date-yy")
    public static WebElement year;


    @FindBy(how = How.ID, using = "btn-continue")
    public static WebElement Continue;

    @FindBy(how = How.ID, using = "deliver-to-store-tab")
    public static WebElement Click_And_Collect;

    @FindBy(how = How.ID, using = "storePostcode")
    public static WebElement Town_And_PostCode;

    @FindBy(how = How.ID, using = "store-postcode-submit")
    public static WebElement Find_PostCode;

    @FindBy(how = How.ID, using = "store-postcode-submit")
    public static WebElement Use_my_Location;

    @FindBy(how = How.XPATH, using = "//input[@id='checkbox-terms-agreement-required']")
    public static WebElement FreeSimTC;

    @FindBy(how = How.XPATH, using = "//button[@id='btn-continue']")
    public static WebElement SendMeMySim;

    @FindBy(how = How.XPATH, using = "//*[@id='btn-continue']")
    public static WebElement SendMeMySim2;

    @FindBy(how = How.XPATH, using = "//*[@id='stock-extended-message-single']")
    public static WebElement StockExtMessageDDPODP;

    @FindBy(how = How.XPATH, using = "(//div[@id='account-tiles']/div[@class='account'])[1]")
    public static WebElement SelectAcct;

    @FindBy(how = How.XPATH, using = "//button[@id='btn-continue-1']")
    public static WebElement FastCheckOut;

    @FindBy(how = How.XPATH, using = "//tr[@id='basket-insurance']")
    public static WebElement InsuranceSection;

    //Below if for text headings

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'iPad Pro 9.7 inch')]")
    public static WebElement HouseNumberText;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'iPad Pro 9.7 inch')]")
    public static WebElement PostcodeText;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'iPad Pro 9.7 inch')]")
    public static WebElement emailAddressText;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'iPad Pro 9.7 inch')]")
    public static WebElement titleText;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'iPad Pro 9.7 inch')]")
    public static WebElement nameText;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'iPad Pro 9.7 inch')]")
    public static WebElement ContactNumberText;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'iPad Pro 9.7 inch')]")
    public static WebElement PasswordText;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'iPad Pro 9.7 inch')]")
    public static WebElement SecurityAnswerText;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'iPad Pro 9.7 inch')]")
    public static WebElement DateofBirthText;


}
