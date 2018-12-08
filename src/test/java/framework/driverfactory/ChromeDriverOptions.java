package framework.driverfactory;

import org.openqa.selenium.MutableCapabilities;
import org.springframework.stereotype.Component;

@Component
class ChromeDriverOptions implements BrowserCaps {
    public MutableCapabilities getOptions() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver");
        return new MutableCapabilities();
    }
}
