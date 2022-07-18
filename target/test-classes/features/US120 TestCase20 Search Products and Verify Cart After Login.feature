@End2End
@US120
Feature:  US120 Test Case 20:   Search Products and Verify Cart After Login
  Background:
    When  Launch browser
    Then  Navigate to url

  @TC20
  Scenario: TC20 Test Case 20:  Search Products and Verify Cart After Login



    Then  Click on Products button
    Then  Verify user is navigated to ALL PRODUCTS page successfully
    Then  Enter product name in search input and click search button
    Then  Verify SEARCHED PRODUCTS is visible
    Then  Verify all the products related to search are visible
    Then Add those products to cart
    Then Click Cart button and verify that products are visible in cart
    Then Click Signup  Login button and submit login details
    Then Again, go to Cart page
    Then Verify that those products are visible in cart after login as well
