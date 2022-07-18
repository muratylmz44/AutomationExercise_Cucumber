@End2End
@US117
Feature:  US117 Test Case 17:  Remove Products From Cart
  Background:
    When  Launch browser
    Then  Navigate to url
    Then  Verify that home page is visible successfully
  @TC17
  Scenario: TC17 Test Case 17: Remove Products From Cart




    Then Add products to cart
    Then Click Cart button
    Then Verify that cart page is displayed
    Then Click X button corresponding to particular product
    Then Verify that product is removed from the cart
