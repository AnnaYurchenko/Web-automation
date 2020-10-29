@secure
Feature: Secure Page

  Scenario: Positive Logout test
    Given I am on the Login page
    When I enter user credentials:
      | username | password             |
      | tomsmith | SuperSecretPassword! |
    When I press the Login button
    Then I see Secure page
    When I press the enabled Logout button
    Then I see Login page

  Scenario: Successful login message
    Given I am on the Login page
    When I enter user credentials:
      | username | password             |
      | tomsmith | SuperSecretPassword! |
    When I press the Login button
    Then I see Secure page
    Then I see success login message
