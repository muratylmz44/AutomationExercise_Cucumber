@End2End
@US119
Feature:  US119 Test Case 19:   View & Cart Brand Products
  Background:
    When  Launch browser
    Then  Navigate to url

  @TC19
  Scenario: TC19 Test Case 19:  View & Cart Brand Products




    Then Click on Products button
    Then Verify that Brands are visible on left side bar
    Then Click on any brand name
    Then Verify that user is navigated to brand page and brand products are displayed
    Then On left side bar, click on any other brand link
    Then Verify that user is navigated to that brand page and can see products
