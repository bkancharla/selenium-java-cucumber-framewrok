package com.automation.framework.driverfactory;

import org.openqa.selenium.remote.RemoteWebDriver;

 class DriverFactory {

     RemoteWebDriver getDriver(String browser) {
        return new ChromeFactory().getWebDriver();
    }

}
