@LoginFeature  @Regression
Feature: Techfios Login functionality validation

 @Scenario1 @Smoke
 Scenario: User should be able to login with correct credential
    Given User is on the Techfios login page
    When User enters username as "demo@codefios.com"
    When User enters password as "abc123"
    When User clicks on the Submit button
    Then User should land on dashboard page 
    
 @Scenario2
 Scenario: User should be able to login with correct credential
    Given User is on the Techfios login page
    When User enters username as "demo@codefios.com"
    When User enters password as "abc124"
    When User clicks on the Submit button
    Then User should land on dashboard page       