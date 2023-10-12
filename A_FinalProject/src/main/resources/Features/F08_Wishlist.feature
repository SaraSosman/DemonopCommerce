@smoke
  Feature: F08_Wishlist | user could select favor product and put it in wish list
    Scenario: verify user adds a product in the wishlist
      Given user clicks on the add to wish list button
      Then confirmation message is displayed

    Scenario: verify  user can see his favour product in wishlist
      Given user clicks on the add to wish list button
      When user clicks on wishlist tab
      Then verify the product added and the quantity is bigger than zero


