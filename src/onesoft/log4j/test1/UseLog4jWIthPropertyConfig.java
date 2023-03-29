package onesoft.log4j.test1;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class UseLog4jWIthPropertyConfig {
	
	static Logger log= Logger.getLogger(UseLog4jWIthPropertyConfig.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("logReport");
		
		log.info("This iS INFO ");
		log.debug("Debug");
		log.error("This iS Error message");
		log.fatal("Fatel Message");
		
	}

}
