@End2End
@US105
  Feature:  US105 Test Case 5: Register User with existing email
    @TC05
    Scenario: TC05 Test Case 5:  Register User with existing email



      When  Launch browser
      Then  Navigate to url
      Then  Verify that home page is visible successfully
      Then  Click on Signup Login button
      And   Verify New User Signup! is visible
      Then  Enter name and already registered email address
      Then  Click Signup button
      Then  Verify error Email Address already exist! is visible