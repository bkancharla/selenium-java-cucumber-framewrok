package com.automation.framework.driverfactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.openqa.selenium.remote.RemoteWebDriver;


public class WebDriverBase {
private RemoteWebDriver WebDriver;

    @Before
    public void getDriver(Scenario scenario){
        System.out.println("Creating Driver Instance");
      WebDriver =  new DriverFactory().getDriver("");

    }

    public RemoteWebDriver getWebDriver() {
        return WebDriver;
    }

}
