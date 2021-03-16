@SmokeTest
Feature: Login feature

  Scenario: Log in with invalid credentials
    Given User need to be in the sign in page
    When Login in with invalid email and password
    Then User shall not be allowed to login, error message shown