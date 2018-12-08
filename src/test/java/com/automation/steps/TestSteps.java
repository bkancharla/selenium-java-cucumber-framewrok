package com.automation.steps;


import cucumber.api.PendingException;
import cucumber.api.java8.En;
import framework.driverfactory.DriverFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class TestSteps implements En {

    private static Logger log = Logger.getLogger(TestSteps.class);

    @Autowired
    DriverFactory driverFactory;

    public TestSteps() {
        Given("I test", () -> {
            log.info("hi");
        });
        Given("I open Google site", () -> {
       log.info("Opening Google Site");
       driverFactory.getDriver().navigate().to("https://www.google.com/");


        });

        Then("Verify page title is {string}", (String string) -> {

            Assert.assertEquals( driverFactory.getDriver().getTitle(),"Google");

        });

        Then("Verify Hoome page as {string} link", (String string) -> {
          Assert.assertTrue(driverFactory.getDriver().findElement(By.cssSelector("a[href*='mail.google.com']")).isDisplayed(),"Gmail link is Displayed");

        });

    }
}
