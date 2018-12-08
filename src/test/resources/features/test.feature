
@web
Feature: Selenium Multithreading Test Example

    Scenario: Verify Google Title
        Given I open Google site
        Then Verify page title is "Google"

    Scenario: Verify GMail Link
        Given I open Google site
        Then Verify Hoome page as "GMAIL" link

