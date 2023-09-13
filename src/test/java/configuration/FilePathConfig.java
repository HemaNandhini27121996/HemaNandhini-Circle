package configuration;

public class FilePathConfig {
    public static String workingDir = System.getProperty("user.dir");
	
	public static String chromeDriver = workingDir+"/ChromeDriver/chromedriver.exe";
	
	public static String ConnectionDetails = workingDir+"/PropertyFile/ConnectionDetails.txt";	
}
