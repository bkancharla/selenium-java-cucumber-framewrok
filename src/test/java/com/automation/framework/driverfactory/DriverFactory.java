package com.automation.framework.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private WebDriver driver;


    public void initililzeDriver(){

        String browser = "chrome";
        switch (browser){
            case "chrome":
                driver = new ChromeDriver(new ChromeDriverOptions().getOptions());
        }
    }
}
