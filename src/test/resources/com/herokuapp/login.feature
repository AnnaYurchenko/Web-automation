@login
Feature: Login Page

  Scenario: Positive Login
    Given I am on the Login page
    When I enter user credentials:
      | username | password             |
      | tomsmith | SuperSecretPassword! |
    And I click on the Login button
#    Then I should see the Secure Area Title

  Scenario Outline: Negative Login
    Given I am on the Login page
    When I enter user credentials:
      | <username> | <password> |
    And I click on the Login button
    Then I am on the Login page

    Examples:
      | username | password   |
      | anna     | myPassword |
      |          |            |
      | 12345    |            |
