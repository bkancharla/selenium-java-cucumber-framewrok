package com.automation.steps;


import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.apache.log4j.Logger;

public class TestSteps implements En {

    private static Logger log = Logger.getLogger(TestSteps.class);

    public TestSteps() {
        Given("I test", () -> {
            log.info("hi");
        });
        Given("I open Google site", () -> {
            log.info("hi");
            log.info("hi");
            log.info("hi");
            log.info("hi");


        });

        Then("Verify page title is {string}", (String string) -> {

        });

        Then("Verify Hoome page as {string} link", (String string) -> {

        });

    }
}
