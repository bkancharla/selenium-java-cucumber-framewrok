package com.automation.framework.driverfactory;

import org.openqa.selenium.MutableCapabilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class ChromeDriverOptions implements    BrowserCaps{
    public MutableCapabilities getOptions() {
        return null;
    }
}
