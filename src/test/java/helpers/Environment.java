package helpers;

import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class Environment {

	public static WebDriver driver;
	public static Logger log;
	public static AndroidDriver AndDriver;
	public Environment() {
		PropertyConfigurator.configure("src/Log4j.properties");

	}
}
