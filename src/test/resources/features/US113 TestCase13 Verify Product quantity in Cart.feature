@End2End
@US113
Feature:  US113 Test Case 13:  Verify Product quantity in Cart
  Background:
    When  Launch browser
    Then  Navigate to url
    Then  Verify that home page is visible successfully
  @TC13
  Scenario: TC13 Test Case 13:  Verify Product quantity in Cart





    Then Click View Product for any product on home page
    Then Verify product detail is opened
    Then Increase quantity to 4
    Then Click Add to cart button
    Then Click View Cart button
    Then Verify that product is displayed in cart page with exact quantity
