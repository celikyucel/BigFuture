Feature: Logout

  @EUG14-175
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