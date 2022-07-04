package LoggerTest;

import java.util.logging.*;

public class LoggerTest {
	
	private final static Logger LOGGER = Logger.getLogger(LoggerTest.class.getName());
	
	public static void main(String[] args) {

		 LOGGER.log(Level.INFO, "My first Log Message");
		 LOGGER.info("Second log message");

		
	}

}
