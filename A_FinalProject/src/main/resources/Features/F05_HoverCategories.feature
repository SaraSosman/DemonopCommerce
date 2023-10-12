@smoke
Feature: F05_HoverCategories | users could hover Categories and select one of sub options successfully
  Scenario: user hover on the main categories then clicks on the
  sub category
    Given user hover on one of the main categories computer
    When user hover on the sub categories desktops
    Then user gets the desktops page
