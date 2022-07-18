@End2End
@US102
Feature: US102 Test Case 2:Login User with correct email and password

  @TC02
  Scenario: TC02 Test Case 2:Login User with correct email and password



  When Launch browser
  Then Navigate to url
  Then Verify that home page is visible successfully
  Then Click on Signup Login button
  Then Verify Login to your account is visible
  Then Enter correct email address and password
  Then Click login button
  Then Verify that Logged in as username is visible
  Then Click Delete Account button
  Then Verify that ACCOUNT DELETED! is visible