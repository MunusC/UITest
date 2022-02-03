package hooks;

import baseclass.BaseClass;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import propertyreader.PropertyReader;

/* scenario level hooks are defined in this class  */

public class Hooks extends BaseClass {
	@Before
	public void openBrowser() {

		selectBrowser(PropertyReader.getInstance().getProperty("browser"));
	}

	@After
	public void tearDown(Scenario scenario) {

		driver.quit();
	}
}