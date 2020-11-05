Feature: Login functuonility

@wip
Scenario Outline: login as a user
Given the user navigates to login page
When "<role>" enters "<email>" and "<password>"
Then user on  "<page>"

  Examples:
| email            | password |role      |page|
|student62@library |KbybTpIZ |student62|books.|
|student63@library|Jg2orVoF  |student63|books.|
|student64@library|pbdQAvkN  |student64|books.|
|librarian52@library|QKjmEIhB|librarian52|Dashboard|








