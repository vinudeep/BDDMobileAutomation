/*
 * Added by Vinudeep for Mobile Automation Testing
 */

/*
 * Added by Vinudeep for Mobile Automation Testing
 */

package actionsPerformed;

import GlobalActions.RandomEmailAddressCreation;
import GlobalActions.Screenshots;
import helpers.Environment;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class MyO2LoginPageActions extends Environment {

    public List<HashMap<String, String>> datamap;
    final static Logger log = Logger.getLogger("FreeSimPageActions");
    public static AndroidDriver<AndroidElement> andDriver;

    public static void login() throws InterruptedException, IOException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        /*jse.executeScript("window.scrollBy(0,150)", "");

		System.out.println("Clicking on iPadsandTabletstab");
		Thread.sleep(3000);
		pageobjects.FreeSimPage.iPadsandTabletstab.click();
		log.debug("Clicking on iPadsandTablets tab");
		Screenshots.captureScreenshot();*/
        driver.findElement(By.xpath("//android.widget.EditText[@text='Email or username']")).sendKeys("bvt2.cfu@gmail.com");
        log.debug("Entered username");
        driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("cfubvt123");
        log.debug("Entered Password");
        //driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys(Keys.TAB);
        log.debug("Tabout worked");
        Thread.sleep(3000);
        //driver.navigate().back();
        Thread.sleep(3000);
        andDriver.findElementById("uk.co.o2.android.myo2:id/ForgottenSignInDetail").click();


        System.out.println("Button");
        /*andDriver.findElementByXPath("//android.widget.Button[@resource-id='uk.co.o2.android.myo2:id/buttonOKSignIn']").click();
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//android.widget.Button[@text='Sign in']")));
        //driver.findElement(By.xpath("//android.widget.Button[@resource-id='uk.co.o2.android.myo2:id/buttonOKSignIn']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='uk.co.o2.android.myo2:id/buttonOKSignIn']")).click();
*/
        log.debug("Clicked on login button");
    }

}
