@End2End
@US115
Feature:  US115 Test Case 15:  Place Order: Register before Checkout
  Background:
    When  Launch browser
    Then  Navigate to url
    Then  Verify that home page is visible successfully
  @TC15
  Scenario: TC15 Test Case 15: Place Order: Register before Checkout





    Then Click on Signup Login button
    Then Fill all details in Signup and create account
    Then Verify ACCOUNT CREATED! and click Continue button
    Then Verify Logged in as username at top
    Then Add products to cart
    Then Click Cart button
    Then Verify that cart page is displayed
    Then Click Proceed To Checkout
    Then Verify Address Details and Review Your Order
    Then Enter description in comment text area and click Place Order
    Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
    Then Click Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!
    Then Click Delete Account button
    Then Verify ACCOUNT DELETED! and click Continue button
