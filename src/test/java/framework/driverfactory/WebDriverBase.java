package framework.driverfactory;

import org.openqa.selenium.remote.RemoteWebDriver;


public class WebDriverBase {
private RemoteWebDriver WebDriver;


    public RemoteWebDriver getWebDriver() {
        return WebDriver;
    }
    // We can put some default options and merge when required

}
