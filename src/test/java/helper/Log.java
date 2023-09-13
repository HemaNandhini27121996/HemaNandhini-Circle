package helper;

import org.apache.log4j.Logger;

public class Log {

	private static Logger Log = Logger.getLogger(Log.class.getName());

	public static void info(String message) {
		Log.info(message);
		System.out.println(message);
		HelperConstant.logList.add(message);

	}

	public static void error(String message) {
		Log.error(message);
		System.out.println(message);
		HelperConstant.logList.add(message);
	}

}
