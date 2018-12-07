package com.automation.framework.driverfactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.openqa.selenium.remote.RemoteWebDriver;


public class WebDriverBase {
private RemoteWebDriver WebDriver;


    public RemoteWebDriver getWebDriver() {
        return WebDriver;
    }

}
