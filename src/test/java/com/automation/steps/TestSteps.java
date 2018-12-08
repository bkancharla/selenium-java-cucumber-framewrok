package com.automation.steps;


import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class TestSteps implements En {

    public TestSteps() {
        Given("I test", () -> {
            System.out.println("hi");
        });
        Given("I open Google site", () -> {

        });

        Then("Verify page title is {string}", (String string) -> {

        });

        Then("Verify Hoome page as {string} link", (String string) -> {

        });

    }
}
