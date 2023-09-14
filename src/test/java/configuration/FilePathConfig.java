package configuration;

/**
 * FilePathConfig class
 */
public class FilePathConfig {
	
	public static String workingDir = System.getProperty("user.dir");

	public static String ConnectionDetails = workingDir + "/PropertyFile/ConnectionDetails.txt";
}
