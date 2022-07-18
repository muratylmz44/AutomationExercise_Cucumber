@End2End
@US125
Feature:  US125 Test Case 25:     Verify Scroll Up using 'Arrow' button and Scroll Down functionality
  Background:
    When  Launch browser
    Then  Navigate to url
    Then  Verify that home page is visible successfully

  @TC25
  Scenario: TC25 Test Case 25:    Verify Scroll Up using 'Arrow' button and Scroll Down functionality



  Then Scroll down page to bottom
  Then Verify SUBSCRIPTION is visible
  Then Click on arrow at bottom right side to move upward
  Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen