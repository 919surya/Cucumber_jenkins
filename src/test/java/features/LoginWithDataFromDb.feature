@DbFeature  @Regression
Feature: Techfios Login functionality validation

 @DbScenario1 @Smoke
 Scenario: User should be able to login with correct credential
    Given User is on the Techfios login page
    When User enters "username" from database
    When User enters "password" from database
    When User clicks on the Submit button
    Then User should land on dashboard page 
    