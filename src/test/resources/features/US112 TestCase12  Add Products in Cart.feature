@End2End
@US112
Feature:  US112 Test Case 12:  Add Products in Cart
  Background:
    When  Launch browser
    Then  Navigate to url
    Then  Verify that home page is visible successfully
  @TC12
  Scenario: TC12 Test Case 12:  Add Products in Cart



    Then  Click on Products button
    Then Hover over first product and click Add to cart
    Then Click Continue Shopping button
    Then Hover over second product and click Add to cart
    Then Click View Cart button
    Then Verify both products are added to Cart
    Then Verify their prices, quantity and total price
