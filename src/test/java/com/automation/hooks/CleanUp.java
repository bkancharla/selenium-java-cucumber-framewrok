package com.automation.hooks;

import cucumber.api.java.After;
import framework.driverfactory.DriverFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CleanUp {
// Clean Up any statefull Objects
    // As Component means Singleton so better to re create if it's critical
    // Other way you can put scope as Scenrario but you can only  to intject scenrio scope bean  into other Scenrio bean object.


    @Autowired
    DriverFactory driverFactory;
    @After(order = 500)
    public void cleanUp(){
        driverFactory = null;
        // Spring will re create new object after this( for next scenrio)

    }
}
