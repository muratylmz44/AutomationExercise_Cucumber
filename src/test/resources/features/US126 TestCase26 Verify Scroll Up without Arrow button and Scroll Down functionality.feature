@End2End
@US126
Feature:  US126 Test Case 26:    Verify Scroll Up without 'Arrow' button and Scroll Down functionality
  Background:
    When  Launch browser
    Then  Navigate to url
    Then  Verify that home page is visible successfully

  @TC26
  Scenario: TC26 Test Case 26:    Verify Scroll Up without 'Arrow' button and Scroll Down functionality


    Then Scroll down page to bottom
    Then Verify SUBSCRIPTION is visible
    Then Scroll up page to top
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen
