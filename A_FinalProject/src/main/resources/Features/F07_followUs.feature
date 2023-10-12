@smoke
Feature: F07_followUs | users could open followUs links
  Scenario: user opens facebook link
    When user clicks on facebook icon
    Then facebook page is opened in new tab

  Scenario:  user opens Twitter link
    When user clicks on twitter icon
    Then twitter page is opened in new tab

  Scenario:  user opens rss link
    When user clicks on rss icon
    Then rss page is opened in new tab


  Scenario:  user opens youtube link
    When user clicks on youtube icon
    Then youtube page is opened in new tab


