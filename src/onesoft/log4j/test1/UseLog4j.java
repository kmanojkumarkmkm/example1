package onesoft.log4j.test1;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class UseLog4j {
	static Logger log= Logger.getLogger(UseLog4j.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("I am a INFO");
		log.warn("WARN");
		log.debug("DEBUG");
		log.error("Error");
		log.fatal("FATAL");
		
	}
	

}
