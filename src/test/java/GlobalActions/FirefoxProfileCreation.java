package GlobalActions;

import helpers.Environment;
import org.apache.log4j.Logger;

public class FirefoxProfileCreation extends Environment {

	static Logger log = Logger.getLogger("devpinoyLogger");

		public static void openFirefoxProfile() throws InterruptedException 
		{
	System.out.println("executing batch run");
		     String filePath = "C:/batchfileForSelenium/openFirefoxProfile.bat";
	         try {
	              
	             Process p = Runtime.getRuntime().exec(filePath);
	             
	         } catch (Exception e) {
	             e.printStackTrace();
	         }
	     }
	  		  	  

	}

