package helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import configuration.FilePathConfig;

/**
 * ReadProperty class
 */
public class ReadProperty {

	public static final String ServiceUrlDetails = FilePathConfig.ConnectionDetails;

	/**
	 * Method to get the Service Properties
	 * @throws IOException
	 */
	public static void getServiceProperties() throws IOException {
		String inputFile = ServiceUrlDetails;
		String eachLine;
		BufferedReader read = new BufferedReader(new FileReader(inputFile));

		Map<String, String> serviceMap = new HashMap<String, String>();

		while ((eachLine = read.readLine()) != null) {
			String lineStr[] = eachLine.split("=");
			String fisrtPart = lineStr[0];
			String secPart = lineStr[1];
			serviceMap.put(fisrtPart, secPart);
		}
		read.close();
		HelperConstant.setPropertyMap(serviceMap);
	}

}
