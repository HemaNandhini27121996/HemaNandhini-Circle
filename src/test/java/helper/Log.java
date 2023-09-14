package helper;

import org.apache.log4j.Logger;

/**
 * Log class
 */
public class Log {

	private static Logger Log = Logger.getLogger(Log.class.getName());

	/**
	 * Method to print the info log
	 * @param message
	 */
	public static void info(String message) {
		Log.info(message);
		System.out.println(message);
		HelperConstant.logList.add(message);

	}

	/**
	 * Method to print the error log
	 * @param message
	 */
	public static void error(String message) {
		Log.error(message);
		System.out.println(message);
		HelperConstant.logList.add(message);
	}

}
