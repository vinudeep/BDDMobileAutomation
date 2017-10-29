package helpers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BrowserHelper {

	public static void Invoke_browser(String BrowserType) {
		if (BrowserType.equalsIgnoreCase("ie")) {

			String OSArchitecture = System.getProperty("os.arch");
			System.out.println(OSArchitecture);
			if (OSArchitecture.equalsIgnoreCase("x86")) {

				System.setProperty("webdriver.ie.driver",
						"src\\test\\java\\InternalLibraries\\BrowserDrivers\\Internet_Explorer\\IEDriverServer_Win32_3.1.0\\IEDriverServer.exe");
			} else {
				System.setProperty("webdriver.ie.driver",
						"src\\test\\java\\InternalLibraries\\BrowserDrivers\\Internet_Explorer\\IEDriverServer_x64_3.1.0\\IEDriverServer.exe");
			}

			DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
			capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capability.setCapability("useLegacyInternalServer", true);
			Environment.driver = new InternetExplorerDriver(capability);
			Environment.driver.manage().deleteAllCookies();
			Environment.driver.navigate().refresh();

		} else if (BrowserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Browsers/ChromeDriver/chromedriver.exe");
			// Environment.driver = new ChromeDriver();
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-extensions");
			options.addArguments("--start-maximized");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);

			Environment.driver = new ChromeDriver(capabilities);

			// WebDriver driver = new ChromeDriver (handlSSLErr);
		} else if (BrowserType.equalsIgnoreCase("mozilla")) {

			System.setProperty("webdriver.gecko.driver", "Browsers/GeckoDriver/geckodriver.exe");
			// ProfilesIni firProfiles = new ProfilesIni();
			// FirefoxProfile wbdrverprofile = firProfiles.getProfile("certificateIssue");
			/*
			 * FirefoxProfile profile = new FirefoxProfile();
			 * profile.setAcceptUntrustedCertificates(true);
			 * profile.setAssumeUntrustedCertificateIssuer(false); Environment.driver = new
			 * FirefoxDriver(profile);
			 */

			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			FirefoxProfile fp = new FirefoxProfile();
			fp.setAcceptUntrustedCertificates(true);
			fp.setAssumeUntrustedCertificateIssuer(true);
			fp.setEnableNativeEvents(false);
			capabilities.setCapability(FirefoxDriver.PROFILE, fp);
			Environment.driver = new FirefoxDriver(capabilities);

		}

		Environment.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Environment.driver.manage().window().maximize();
	}

}
