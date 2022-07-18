@End2End
@US118
Feature:  US118 Test Case 18:   View Category Products
  Background:
    When  Launch browser
    Then  Navigate to url

  @TC18
  Scenario: TC18 Test Case 18:  View Category Products




  Then Verify that categories are visible on left side bar
  Then Click on Women category
  Then Click on any category link under Women category, for example Dress
  Then Verify that category page is displayed and confirm text WOMEN  TOPS PRODUCTS
  Then On left side bar, click on any sub-category link of Men category
  Then Verify that user is navigated to that category page
