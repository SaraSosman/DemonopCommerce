@smoke
Feature: F03_Currencies| user can change currencies
  Scenario: user change currencies
    Given user clicks on currencies list
    When user select Euro currency from the dropdown list
    Then Euro Symbol is shown successfully
