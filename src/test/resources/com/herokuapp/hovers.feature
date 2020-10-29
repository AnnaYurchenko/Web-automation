#@hovers
Feature: Hovers Page
  In order to see the usernames
  I hover over the avatar pictures

  Background:
    Given I am on the Hovers page

  Scenario: View User Profile
    When I hover avatar 1
    When I click on the View profile link
    Then I am on the Users page
    Then I see error

#    only scenario outline can have examples
  Scenario Outline: Hover avatars
    When I hover avatar <avatar_index>
    Then I observe the <username> username
    Examples:
      | avatar_index | username |
      | 1            | user1    |
      | 2            | user2    |
      | 3            | user3    |
