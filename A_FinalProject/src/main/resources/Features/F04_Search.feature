@smoke
Feature:F04_Search| Verify Searching Functionality
 Scenario Outline: user could search using product name
    Given user write product "<Name>" in search bar
    When user clicks on search button
    Then shows the results for the "<Name>"
   Examples:
   |Name|
   |book|
   |laptop|
   |nike|

  Scenario Outline: user could search using product sku
    Given user write products "<sku>" in search bar
    When user clicks on the search button
    And user clicks on the products "<sku>" in search result
    Then shows the result for the "<sku>"
    Examples:
      | sku |
      | SCI_FAITH|
      |  APPLE_CAM |
      | SF_PRO_11  |



