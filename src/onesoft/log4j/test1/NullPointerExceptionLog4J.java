package onesoft.log4j.test1;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class NullPointerExceptionLog4J {

	static Logger log = Logger.getLogger(NullPointerExceptionLog4J.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();

		String a = null;

		try {
			System.out.println(a.charAt(0));
		} catch (Exception e) {
			log.error(" This is Null Value");
			 throw new NullPointerException();
		}

	}

}
