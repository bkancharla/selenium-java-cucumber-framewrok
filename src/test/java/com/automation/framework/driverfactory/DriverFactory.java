package com.automation.framework.driverfactory;

import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

    public RemoteWebDriver getDriver(String browser) {
        return new ChromeFactory().getWebDrive();
    }

}
