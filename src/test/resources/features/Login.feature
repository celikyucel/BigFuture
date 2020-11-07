Feature: Login functuonility

  @kiss
  Scenario Outline: login as a user
    Given the user navigates to login page
    When user enters "<email>" and "<password>"
    Then "<role>" on  "<page>"

    Examples:
      | email            | password |role      |page|
      |student62@library |KbybTpIZ |student62|Book Management|
      |student63@library|Jg2orVoF  |student63|Book Management|
      |student64@library|pbdQAvkN  |student64|Book Management|
      |librarian52@library|QKjmEIhB|librarian52|Dashboard|





