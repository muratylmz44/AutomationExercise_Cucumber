@End2End
@US121
Feature:  US121 Test Case 21:    Add review on product
  Background:
    When  Launch browser
    Then  Navigate to url

  @TC21
  Scenario: TC21 Test Case 21:   Add review on product



    Then  Click on Products button
    Then  Verify user is navigated to ALL PRODUCTS page successfully
    Then  Click on View Product button
    Then  Verify Write Your Review is visible
    Then  Enter name, email and review
    Then  Click Submit button.
    Then  Verify success message Thank you for your review.
