@End2End
@US123
Feature:  US123 Test Case 23:      Verify address details in checkout page
  Background:
    When  Launch browser
    Then  Navigate to url
    Then  Verify that home page is visible successfully

  @TC23
  Scenario: TC23 Test Case 23:     Verify address details in checkout page




    Then Click on Signup Login button
    Then Fill email, password and click Login button
    Then Verify Logged in as username at top
    Then Add products to cart
    Then Click Cart button
    Then Verify that cart page is displayed
    Then Click Proceed To Checkout
    Then Verify that the delivery address is same address filled at the time registration of account
    Then Verify that the billing address is same address filled at the time registration of account
    Then Click Delete Account button
    Then Verify ACCOUNT DELETED! and click Continue button