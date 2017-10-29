package GlobalActions;

import helpers.Environment;
import org.apache.log4j.Logger;

public class BatchFileExecution extends Environment {

	final static Logger log = Logger.getLogger("BatchFileExecution");

		public static void BatchFileTermination() throws InterruptedException 
		{
	System.out.println("executing batch run");
		     String filePath = "C:/batchfileForSelenium/QuitAllRemoveTemp.bat";
	         try {
	              
	             Process p = Runtime.getRuntime().exec(filePath);
	             
	         } catch (Exception e) {
	             e.printStackTrace();
	         }
	     }
	  		  	  

	}

