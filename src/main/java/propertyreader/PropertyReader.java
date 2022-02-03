package propertyreader;

import java.io.FileInputStream;
import java.util.Properties;

/* Property reader is a singleton class 
* "getProperty" method is used retrieve corresponding value of given key. 
* "getInstance" creates the PropertyReader instance only once and 
*  returns the same instance when called multiple times" 
*/
public class PropertyReader {

	private static PropertyReader propInstance;

	private PropertyReader() {

	}

	public static PropertyReader getInstance() {
		if (propInstance == null) {
			propInstance = new PropertyReader();
		}
		return propInstance;
	}

	public String getProperty(String propertyName) {

		Properties prop = new Properties();
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\propertiesfile\\config.properties");
			prop.load(inputStream);
			if (prop.getProperty(propertyName) != null) {
				return prop.getProperty(propertyName);
			}
		} catch (Exception e) {
			System.out.println("Property not found");
		}
		return null;
	}
}