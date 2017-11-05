/*
 * Added by Vinudeep for Mobile Automation Testing
 */

package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FreeSimPage {

	// ipadsandtablets

	@FindBy(how = How.XPATH, using = "//a[@href='#tablets']")
	public static WebElement iPadsandTabletstab;

	// ipadsim

	@FindBy(how = How.XPATH, using = "(//a[@title='iPad sims'])[1]")
	public static WebElement SteadyiPadsim;

	// EnterManually

	@FindBy(how = How.XPATH, using = "//a[contains(., 'Enter Manually')]")
	public static WebElement EnterManually;

	// flat

	@FindBy(how = How.ID, using = "address-flat")
	public static WebElement Flatnumber;

	// House name

	@FindBy(how = How.ID, using = "address-housename")
	public static WebElement Housename;

	// Address

	@FindBy(how = How.ID, using = "address-line1")
	public static WebElement Address1;

	// town

	@FindBy(how = How.ID, using = "address-town")
	public static WebElement Town;

	// postcode

	@FindBy(how = How.ID, using = "address-postcode")
	public static WebElement Postcode;

	// email

	@FindBy(how = How.ID, using = "email")
	public static WebElement Email_id;

	// title

	@FindBy(how = How.ID, using = "title")
	public static WebElement title;

	// firstname

	@FindBy(how = How.ID, using = "first-name")
	public static WebElement Firstname;

	// secondname

	@FindBy(how = How.ID, using = "last-name")
	public static WebElement Lastname;

	// contact

	@FindBy(how = How.ID, using = "contact-number")
	public static WebElement Contact_number;

	// checkbox

	@FindBy(how = How.ID, using = "checkbox-terms-agreement-required")
	public static WebElement Check_box;

	// orderbutton

	@FindBy(how = How.ID, using = "btn-continue")
	public static WebElement Order;
	@FindBy(how = How.XPATH, using = "(//a[@title='iPad sims'])[1]")
	public static WebElement iPadsim;

	@FindBy(how = How.XPATH, using = "(//a[@title='Tablet sims'])[1]")
	public static WebElement Tabletsim;

	@FindBy(how = How.XPATH, using = "(//a[@title='Dongle sims'])[1]")
	public static WebElement Donglesim;

	@FindBy(how = How.XPATH, using = "(//a[@href='#lightsurfer'])[2]")
	public static WebElement LightSurfer;

	@FindBy(how = How.XPATH, using = "(//a[@href='#steadysurfer'])[2]")
	public static WebElement SteadySurfer;

	@FindBy(how = How.XPATH, using = "(//a[@href='#ultimatesurfer'])[2]")
	public static WebElement UltimateSurfer;

	@FindBy(how = How.XPATH, using = "(//a[@title='iPad sims'])[2]")
	public static WebElement LightSurferiPadSim;

	@FindBy(how = How.XPATH, using = "(//a[@title='Tablet sims'])[2]")
	public static WebElement LightSurferTabletSim;

	@FindBy(how = How.XPATH, using = "(//a[@title='Dongle sims'])[2]")
	public static WebElement LightSurferDongleSim;

	@FindBy(how = How.XPATH, using = "(//a[@title='iPad sims'])[1]")
	public static WebElement SteadySurferiPadSim;

	@FindBy(how = How.XPATH, using = "(//a[@title='Tablet sims'])[1]")
	public static WebElement SteadySurferTabletSim;

	@FindBy(how = How.XPATH, using = "(//a[@title='Dongle sims'])[1]")
	public static WebElement SteadySurferDongleSim;

	@FindBy(how = How.XPATH, using = "(//a[@title='iPad sims'])[3]")
	public static WebElement UltimateSurferiPadSim;

	@FindBy(how = How.XPATH, using = "(//a[@title='Tablet sims'])[3]")
	public static WebElement UltimateSurferTabletSim;

	@FindBy(how = How.XPATH, using = "(//a[@title='Dongle sims'])[3]")
	public static WebElement UltimateSurferDongleSim;

}
