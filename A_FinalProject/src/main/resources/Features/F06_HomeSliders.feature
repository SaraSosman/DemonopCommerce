@smoke
  Feature:P06 HomeSlider| user show slider for seeing products
    Scenario: first slider is clickable on home page
      Given User select first slider
      Then User navigate to product page


      Scenario: second slider is clickable on home page
        Given User select second slider
        Then User Navigate to second product page
