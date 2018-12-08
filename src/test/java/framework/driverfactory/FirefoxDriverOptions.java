package framework.driverfactory;

import org.openqa.selenium.Capabilities;
import org.springframework.stereotype.Component;

@Component
 class FirefoxDriverOptions implements BrowserCaps {
    @Override
    public Capabilities getOptions() {
        return null;
    }
}
