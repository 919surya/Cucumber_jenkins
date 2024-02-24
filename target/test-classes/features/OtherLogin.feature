@OtherLoginFeature @Regression
Feature: Techfios OtherLogin validation

 @OtherScenario1
 Scenario Outline: User should not be able to login with incorrect credential
    Given User is on the Techfios login page
    When User enters username as "<username>"
    When User enters password as "<password>"
    When User clicks on the Submit button
    Then User should land on dashboard page 
    
    Examples: 
      |username          |password|
      |demo2@codefios.com|abc123  |
      |demo@codefios.com |abc124  |
      |demo2@codefios.com|abc124  |
      |demo@codefios.com |abc123  |