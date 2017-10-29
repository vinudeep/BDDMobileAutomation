package GlobalActions;

import helpers.Environment;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.UUID;


public class RandomEmailAddressCreation extends Environment {

	final static Logger log = Logger.getLogger("RandomEmailAddressCreation");

    public static String RandomEmail() throws IOException, InterruptedException {
    	
    	String RandomEmail = "STester11" + UUID.randomUUID().toString() + "@gmail.com";
    			System.out.println("Random Email Address is "+RandomEmail);
				log.debug("Random Email Address is "+RandomEmail);
				

          return RandomEmail;
          
    }
    
    


}