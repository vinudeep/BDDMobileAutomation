package helpers;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Environment {

	public static WebDriver driver;
	public static Logger log;

	public Environment() {
		PropertyConfigurator.configure("src/Log4j.properties");

	}

  /*  public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver;

        // TODO Auto-generated method stub
        File file = new File("App\\MyO2_v8.7.2_apkpure.com.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        capabilities.setCapability("app", file.getAbsoluteFile());
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);

        return driver;
    }*/
}
