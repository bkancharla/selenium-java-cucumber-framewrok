package framework.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DriverFactory {


    private WebDriver driver;

    @Autowired
    ChromeDriverOptions chromeDriverOptions;

    @Autowired
    FirefoxDriverOptions firefoxDriverOptions;


    public void initililzeDriver() {

        String browser = "chrome";
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver(chromeDriverOptions.getOptions());
        }
    }


    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {

        try {
            this.driver.quit();
        } catch (Exception e){

        } finally {
            driver = null;
        }
    }
}
