package GlobalActions;

import helpers.Environment;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class scrollToAnElement extends Environment {

	final static Logger log = Logger.getLogger("scrollToAnElement");
	
	public static void scrollToElement(WebElement data){
		log.debug("Opening scrollToElement function");
		try
		{			
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", data);		
		log.debug("Successfully scrolled to element");			
		}
		catch(Exception e)
		{
			log.debug("Cannot scroll to element"+" - "+e.getMessage());
		}
	}

}
