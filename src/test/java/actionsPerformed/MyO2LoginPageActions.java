/*
 * Added by Vinudeep for Mobile Automation Testing
 */

/*
 * Added by Vinudeep for Mobile Automation Testing
 */

package actionsPerformed;

import helpers.AndroidCapability;
import helpers.Environment;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static helpers.BaseApp.capabilities;


public class MyO2LoginPageActions extends Environment {

    final static Logger log = Logger.getLogger("MyO2LoginPageActions");


    public static void login() throws Exception {

        driver.findElement(By.xpath("//android.widget.EditText[@text='Email or username']")).sendKeys("bvt2.cfu@gmail.com");
        log.debug("Entered username");
        driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("cfubvt123");
//       baseDriver.capabilities().findElementByAndroidUIAutomator("//android.widget.EditText[@text='Password']").sendKeys("Test");
        log.debug("Entered Password");
        Thread.sleep(3000);
        driver.navigate().back();
        log.debug("Clicked on back option");
        Thread.sleep(3000);
        driver.findElement(By.id("uk.co.o2.android.myo2:id/buttonOKSignIn")).click();
        Thread.sleep(6000);
        log.debug("Clicked on login button");
        Thread.sleep(3000);
    }

    public static void securityPassword() throws Exception {

        runShellCommand("adb shell input text 1234");
        log.debug("Entered Security code ****");


    }

    public static void skip() throws Exception {

        driver.findElement(By.xpath("//android.widget.Button[@text='Skip']")).click();
       /* AndroidDriver<AndroidElement> driver;


        Dimension size;

        size = driver.manage().window().getSize();
        System.out.println(size);

        int startx = (int) (size.width * 0.90);

        int endx = (int) (size.width * 0.10);

        int starty = size.height / 2;


        int noOfScreens = andDriver.findElements(By.className("android.widget.RelativeLayout")).size();
//		NormalDriver(driver).findElement(By.id("uk.co.o2.android.myo2:id/buttonOKSignIn")).click();

        System.out.println("Total number of screens to swipe are " + noOfScreens);

        for (int i = 0; i < noOfScreens; i++) {

           // andDriver.swipe(startx, starty, endx, starty, 6000);
            System.out.println("Swipped on pages = " + i);
            Thread.sleep(2000);*/
        }

    public static void openLeftNavigation() throws Exception {

        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']")).click();

        log.debug("Clicked on top left side Navigation drawer");

    }

    public static void signOut() throws Exception {

        //driver.findElement(By.xpath("//android.widget.TextView[@text='Sign out']")).click();
        //driver.findElement(By.id("uk.co.o2.android.myo2:id/drawer_action_sign_out")).click();


        AndroidElement list =  driver.findElement(By.className("android.widget.ScrollView"));
        MobileElement listGroup = list.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Sign out\"));"));        log.debug("Clicked on cnofirmation for signout");
        listGroup.click();

        log.debug("Clicked on Sign Out link");

        driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();

    }

    private static void runShellCommand(String command) throws Exception {
        Process process = Runtime.getRuntime().exec(command);
        process.waitFor();
    }
    public static AndroidDriver<MobileElement> Adriver(AndroidDriver<MobileElement> andDriver) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
        return andDriver;
    }

}
