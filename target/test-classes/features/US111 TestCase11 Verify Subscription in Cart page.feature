@End2End
@US111
Feature:  US111 Test Case 11: Verify Subscription in Cart page
  Background:
    When  Launch browser
    Then  Navigate to url
    Then  Verify that home page is visible successfully
  @TC11
  Scenario: TC11 Test Case 11: Verify Subscription in Cart page

    Then Click Cart button
    Then Scroll down to footer
    Then Verify text SUBSCRIPTION
    Then Enter email address in input and click arrow button
    Then Verify success message You have been successfully subscribed! is visible