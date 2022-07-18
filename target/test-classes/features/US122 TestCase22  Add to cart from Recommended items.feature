@End2End
@US122
Feature:  US122 Test Case 22:     Add to cart from Recommended items
  Background:
    When  Launch browser
    Then  Navigate to url

  @TC22
  Scenario: TC22 Test Case 22:    Add to cart from Recommended items




  Then Scroll to bottom of page
  Then Verify RECOMMENDED ITEMS are visible
  Then Click on Add To Cart on Recommended product
  Then Click on View Cart button
  Then Verify that product is displayed in cart page
