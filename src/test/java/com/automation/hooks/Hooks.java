package com.automation.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import framework.driverfactory.DriverFactory;
import framework.springconfig.SpringCucmberConfig;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = SpringCucmberConfig.class)

public class Hooks extends SpringCucmberConfig {
    private static final Logger log = LogManager.getLogger(Hooks.class);

    @Autowired
    DriverFactory driverFactory;


    @Before(value = {"@web"}, order = 0)
    public void beofore(){
        log.info("Initilizing Web Driver");

        driverFactory.initililzeDriver();

    }

    @After(value = {"@web"}, order = 1000)
    public void After(){

        log.info("Stopping Web Driver");

        driverFactory.quitDriver();

    }


}
