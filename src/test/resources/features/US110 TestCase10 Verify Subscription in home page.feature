@End2End
@US110
Feature:  US110 Test Case 10: Verify Subscription in home page
  Background:
    When  Launch browser
    Then  Navigate to url
    Then  Verify that home page is visible successfully
  @TC10
  Scenario: TC10 Test Case 10: Verify Subscription in home page


  Then Scroll down to footer
  Then Verify text SUBSCRIPTION
  Then Enter email address in input and click arrow button
  Then Verify success message You have been successfully subscribed! is visible