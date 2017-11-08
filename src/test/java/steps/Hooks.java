package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.*;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Hooks extends Environment {

	final static Logger log = Logger.getLogger("Hooks");
	AndroidCapability capability = new AndroidCapability();

	@Before("@Web")

	public WebDriver openBrowser() throws MalformedURLException, InterruptedException {
		System.out.println("Called openBrowser");
		log.debug("Called openBrowser");

		String relativePath = System.getProperty("user.dir");
		log.debug("The Relative path of the user.dir" + relativePath);

		String EnvPropFilePath = relativePath + "/Configurations/Properties/AppConfig.properties";
		log.debug("The Env prop path is " + EnvPropFilePath);

		String BrowserType = Filereadingutility.getPropertyValue(EnvPropFilePath, "Browser_Type");
		log.debug("The Browser type read from EnvProp file is " + BrowserType);

		String Currenturl = Filereadingutility.getPropertyValue(EnvPropFilePath, "url");
		log.debug("The current url is " + Currenturl);

		BrowserHelper.Invoke_browser(BrowserType);
		log.debug("Invoked browser");

		driver.get(Currenturl);
		log.debug("Invoked URL");

		driver.manage().deleteAllCookies();
		log.debug("Deleted all Cookies");

		driver.manage().window().maximize();
		log.debug("Maxismised window");
		return null;
	}

	@Before("@MobileWeb")
	public void setupWeb() throws Exception {
		System.out.println("Opening Mobile browser");
		capability.startMobileWeb();
	}

	@Before("@MobileApp")
	public void setupApp() throws Exception {
		System.out.println("Opening Mobile App");
		capability.startApp();
	}

	@After
	public void embedScreenshot(Scenario scenario) throws Exception {

		if (scenario.isFailed()) {
			try {

				File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File dest = new File("ScreenshotsForFailures\\ScreenshotsForFailures_" + timestamp() + ".jpeg");
				FileUtils.copyFile(scr, dest);

			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			}

		}
		Thread.sleep(2000);
		//capability.stopAppiumServer();
		/*AppiumServerJava appiumServer = new AppiumServerJava();
		appiumServer.stopServer();*/

		capability.stopAppiumServer();
		Thread.sleep(5000);
		log.debug("Stopped Appium server");
		//driver.close();
       // andDriver.closeApp();
        driver.quit();

	}

	private String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}