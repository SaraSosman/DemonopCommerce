@smoke
Feature: F01_Registration| User can create a new account

  Scenario: user register successfully with valid data
    Given user navigate to register page
    When user select gender type
    And user enter first name "automation" and last name "tester"
    And user enter date of birth
    And user enter email "test@example.com" field
    And user fills Password fields "P@ssw0rd" "P@ssw0rd"
    And user clicks on register button
    Then success message is displayed



