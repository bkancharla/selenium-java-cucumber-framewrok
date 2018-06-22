package com.automation.framework.driverfactory;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

class ChromeFactory implements WebDriverInstance {


    @Override
    public RemoteWebDriver getWebDriver() {
        return new ChromeDriver((ChromeOptions) new ChromeDriverOptions().getOptions());
    }
}
