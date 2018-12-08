package com.automation.steps;


import cucumber.api.java8.En;

public class TestSteps implements En {

    public TestSteps() {
        Given("I test", () -> {
            System.out.println("hi");
        });
    }
}
