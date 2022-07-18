@End2End
@US104
  Feature: US104 Test Case 4: Logout User

    @TC04
    Scenario: TC04 Test Case 4: Logout User


      When   Launch browser
      Then Navigate to url
      Then Verify that home page is visible successfully
      Then Click on Signup Login button
      Then Verify Login to your account is visible
      Then Enter correct email address and password
      Then Click login button
      Then Verify that Logged in as username is visible
      Then Click Logout button
      Then Verify that user is navigated to login page