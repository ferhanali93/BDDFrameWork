Feature: Login login_using_scenerio_outline
  @FunctionalTest
  Scenario Outline: Login with invalid credentials
    Given User has to be in log in page
    When Try log in by invalid "<userName>" and "<password>"
    Then Unable to log in
    Examples:
      | userName     |password|
      |abcd@gmail.com|MrABCD|
      |mrsabcd@gmail.com|MrsABCD|
      |xyz@gmail.com|xyz        |