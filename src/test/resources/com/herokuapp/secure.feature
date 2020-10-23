#@secure
Feature: Secure Page

  Scenario: Positive Logout test
    Given I am on the Secure page
    When I press the enabled Logout button
    Then I am on the Login page

  Scenario: Successful login message
    Given I am on the Login page
    When I enter user credentials:
      | username | password             |
      | tomsmith | SuperSecretPassword! |
    Then I press the Login button
    Then I am on the Secure page
    When I press the enabled Logout button
    Then I am on the Login page
