@End2End
@US103
  Feature: US103 Test Case 3: Login User with incorrect email and password

    @TC03
    Scenario:TC03 Test Case 3: Login User with incorrect email and password


      When Launch browser
      Then Navigate to url
      Then Verify that home page is visible successfully
      Then Click on Signup Login button
      Then Verify Login to your account is visible
      Then Enter incorrect email address and password
      Then Click login button
      Then Verify error Your email or password is incorrect! is visible