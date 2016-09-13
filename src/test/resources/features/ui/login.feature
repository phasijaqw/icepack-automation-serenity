Feature:
  As a User
  I should be able perform basic operations on Sling Home page
  So that I want to make sure none of these features are broken

  @Smoke
  Scenario: Validate Watch Now 7 Days Free button
    Given I am on Sling Home Page
    When I click on WATCH NOW 7 DAYS FREE button
    Then I should be redirected to Create User Account page

  @regression
  Scenario: Validate Offerdetails link
    Given I am on Sling Home Page
    When I click on Offerdetails link
    Then I should be redirect to Offerdetails page

  @regression
  Scenario: Validate MEMBER SIGN IN link
    Given I am on Sling Home Page
    When I click on MEMBER SIGN IN link
    Then I should be redirected to Sign In page

  @regression
  Scenario: Validate take back tv link
    Given I am on Sling Home Page
    When I click on take back tv link
    Then I should be redirected to Commercial page

  @regression
  Scenario: Validate Forgot Your Password link
    Given I am on Sling Home Page
    When I click on MEMBER SIGN IN link
    Then I click on Forgot Your Password link
    And I should be redirected to Forgot Your Password page

  @regression
  Scenario: Validate Not a member link
    Given I am on Sling Home Page
    When I click on MEMBER SIGN IN link
    And I click on Not a member link
    Then I should be redirected to Sling Home page

  @regression
  Scenario: Validate Sign in feature with invalid email
    Given I am on MEMBER SIGN IN Page
    When I enter invalid email address "John@com"
    Then I should see a proper error message for email field

  @regression
  Scenario: Validate Sign in feature with non registered email address
    Given I am on MEMBER SIGN IN Page
    When I enter non existing email address "John@yopmail.com" and password "123456"
    Then I hit Sign In button
    And I should see "Invalid email/password combination" error message

  @regression
  Scenario: Validate Sign in feature with valid email address and password
    Given I am on MEMBER SIGN IN Page
    When I enter valid email address "harshith@mailinator.com" and valid password "123456"
    And I hit Sign In button
    Then I should be redirected to My Account Subscription page
