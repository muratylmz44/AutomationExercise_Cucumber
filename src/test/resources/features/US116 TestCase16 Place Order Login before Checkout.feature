@End2End
@US116
Feature:  US116 Test Case 16:  Place Order: Login before Checkout
  Background:
    When  Launch browser
    Then  Navigate to url
    Then  Verify that home page is visible successfully
  @TC16
  Scenario: TC16 Test Case 16: Place Order: Login before Checkout





    Then Click on Signup Login button
    Then Fill email, password and click Login button
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