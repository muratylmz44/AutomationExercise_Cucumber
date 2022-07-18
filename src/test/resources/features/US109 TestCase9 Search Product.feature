@End2End
@US109
Feature:  US109 Test Case 9: Search Product
  Background:
    When  Launch browser
    Then  Navigate to url
    Then  Verify that home page is visible successfully
  @TC09
  Scenario: TC09 Test Case 9: Search Product


    Then  Click on Products button
    Then  Verify user is navigated to ALL PRODUCTS page successfully
    Then  Enter product name in search input and click search button
    Then  Verify SEARCHED PRODUCTS is visible
    Then  Verify all the products related to search are visible