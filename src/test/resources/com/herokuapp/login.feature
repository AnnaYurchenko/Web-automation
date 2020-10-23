#@login
Feature: Login Page

  Background:
    Given I am on the Login page

#  @positive_login
  Scenario: Positive Login test
    When I enter user credentials:
      | username | password             |
      | tomsmith | SuperSecretPassword! |
    Then I press the Login button
    Then I am on the Secure page
    Then I see success login message

  Scenario: Login Button exists and enabled
    And Login button exists

#  @negative_login
  Scenario: Login the unknown user test. Error message is shown
    When I enter user credentials:
    |username|password|
    |  anna  | test   |
    Then I press the Login button
    Then I see error message

  Scenario Outline: Negative Login
    Given I am on the Login page
    When I enter user credentials:
      |username    |passowrd    |
      | <username> | <password> |
    And I press the Login button
    Then I am on the Login page
    And I see Login page title
    Examples:
      | username | password   |
      | anna     | myPassword |
      |          |            |
      | 12345    |            |
