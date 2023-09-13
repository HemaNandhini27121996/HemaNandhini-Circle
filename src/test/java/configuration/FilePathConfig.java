package configuration;

public class FilePathConfig {
    public static String workingDir = System.getProperty("user.dir");
	
	public static String chromeDriver = workingDir+"/Driver/chromedriver(1).exe";
	
	public static String ConnectionDetails = workingDir+"/PropertyFile/ConnectionDetails.txt";	
}
