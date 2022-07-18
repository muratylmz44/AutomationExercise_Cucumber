@End2End
@US101
Feature: US101 Test Case 1: Register User

  @TC01
  Scenario: TC01 Test Case 1: Register User

When   Launch browser
Then  Navigate to url
Then   Verify that home page is visible successfully
Then    Click on Signup Login buttonup! is visible
When    Enter name and email addressSig Zipcode, Mobile Number
Then    Click Create Account button
Then    Verify that ACCOUNT CREATED! is visible
When    Click Continue button
Then    Verify that Logged in as username is visible
Then    Click Delete Account button
Then   Verify that ACCOUNT DELETED! is visible and click Continue buttons