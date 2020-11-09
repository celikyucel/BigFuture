@EUG14-175
Feature: Logout


  Scenario Outline: user should be able to logout
    Given the user navigates to login page
    When user enters "<email>" and "<password>"
    Then user should be able to logout
    Examples:
      | email               | password |
      | student62@library   | KbybTpIZ |
      | student63@library   | Jg2orVoF |
      | student64@library   | pbdQAvkN |
      | librarian52@library | QKjmEIhB |


  Scenario Outline: when it navigates back, verify it logout or not
    Given the user navigates to login page
    When user enters "<email>" and "<password>"
    Then user should be able to logout
    And when user navigates back, should have logout
    Examples:
      | email               | password |
      | student62@library   | KbybTpIZ |
      | librarian52@library | QKjmEIhB |
