/*
 * Added by Vinudeep for Mobile Automation Testing
 */

package helpers;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidCapability extends Environment {

    final static Logger log = Logger.getLogger("AndroidCapability");

    public void startApp() throws Exception {
        //Below is starting Appium server from command line

      /*  AppiumServerJava_cmdLine serverStart = new AppiumServerJava_cmdLine();
        System.out.println("Going to start appium server from cmd line");
        serverStart.startServer();*/

        //Below is starting appium server without command line

        AppiumServerJava appiumServer = new AppiumServerJava();

        int port = 4723;
        if (!appiumServer.checkIfServerIsRunnning(port)) {
            appiumServer.startServer();
            System.out.println("Appium server started");
        } else {
            System.out.println("Appium Server already running on Port - " + port);
        }

        //Below is default code

        log.debug("Started Appium Server.waiting for some 10 seconds before actual execution");
        Thread.sleep(20000);
        String relativePath = System.getProperty("user.dir");
        log.debug("The Relative path of the user.dir" + relativePath);

        String EnvPropFilePath = relativePath + "\\Configurations\\Properties\\AppConfig.properties";
        log.debug("The Env prop path is " + EnvPropFilePath);

        String appPath = Filereadingutility.getPropertyValue(EnvPropFilePath, "appName");
        log.debug("The App which will be used for testing is " + appPath);

        // File file = new File("App\\MyO2_v8.7.2_apkpure.com.apk");
        File file = new File("App\\" + appPath);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        //capabilities.setCapability("app", file.getAbsoluteFile());
        capabilities.setCapability("app", file.getAbsoluteFile());
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

    public void startMobileWeb() throws Exception {

        //Below is starting Appium server from command line

      /*  AppiumServerJava_cmdLine serverStart = new AppiumServerJava_cmdLine();
        System.out.println("Going to start appium server from cmd line");
        serverStart.startServer();*/

        //Below is starting appium server without command line

        AppiumServerJava appiumServer = new AppiumServerJava();

        int port = 4723;
        if (!appiumServer.checkIfServerIsRunnning(port)) {
            appiumServer.startServer();
            System.out.println("Appium server started");
        } else {
            System.out.println("Appium Server already running on Port - " + port);
        }

        //Below is default code
        log.debug("Started Appium Server.waiting for some 10 seconds before actual execution as server start will take some time");
        Thread.sleep(10000);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String relativePath = System.getProperty("user.dir");
        String EnvPropFilePath = relativePath + "/Configurations/Properties/AppConfig.properties";
        String Currenturl = Filereadingutility.getPropertyValue(EnvPropFilePath, "url");
        driver.get(Currenturl);


    }

    public void stopAppiumServer() throws Exception {
       // AppiumServerJava_cmdLine serverStart = new AppiumServerJava_cmdLine();

       /* System.out.println("Going to stop appium server");
        serverStart.stopServer();*/

        System.out.println("Going to stop appium server");

        AppiumServerJava appiumServer = new AppiumServerJava();
        appiumServer.stopServer();

        log.debug("Stopped Appium Server.waiting for some 10 seconds before actual execution");
        Thread.sleep(10000);
    }
}

