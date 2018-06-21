package com.automation.framework.driverfactory;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxFactory implements WebDriverInstance {
    @Override
    public RemoteWebDriver getWebDrive() {
        return new FirefoxDriver((FirefoxOptions)new FirefoxDriverOptions().getOptions());
    }
}
