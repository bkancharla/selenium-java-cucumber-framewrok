package com.automation.hooks;

import cucumber.api.java.Before;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Hooks {
    private static final Logger log = LogManager.getLogger(Hooks.class);


    @Before(order = 0)
    public void hi(){

        log.info("Test");

    }
}
