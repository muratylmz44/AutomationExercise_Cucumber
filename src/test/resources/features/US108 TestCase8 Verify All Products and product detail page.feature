@End2End
@US108
Feature:  US108 Test Case 8: Verify All Products and product detail page
  Background:
    When  Launch browser
    Then  Navigate to url
    Then  Verify that home page is visible successfully
  @TC08
  Scenario: TC08 Test Case 8: Verify All Products and product detail page

    Then  Click on Products button
    Then  Verify user is navigated to ALL PRODUCTS page successfully
    Then  The products list is visible
    Then  Click on View Product of first product
    Then  User is landed to product detail page
    Then  Verify that detail detail is visible: product name, category, price, availability, condition, brand
