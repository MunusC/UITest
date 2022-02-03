package baseclass;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import propertyreader.PropertyReader;

/* This is the base class .
 * It reads the required basic details from config files 
 * "selectBrowser" method is used to instantiate the webdriver instance  
 */
public class BaseClass {

	public static WebDriver driver;
	public static Integer timeout = Integer.parseInt(PropertyReader.getInstance().getProperty("ExplictTimeOut"));
	String url = PropertyReader.getInstance().getProperty("Url");
	String projectPath = System.getProperty("user.dir");

	public BaseClass() {
		PageFactory.initElements(driver, this);
		PropertyConfigurator.configure(projectPath + "\\src\\test\\resources\\propertiesfile\\log4j.properties");
	}

	public void selectBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("Provide the correct browser name in config , Chrome is supported for now ");
		}

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().deleteAllCookies();
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}
}