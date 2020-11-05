Feature: Login functuonility

@wip
Scenario Outline:
When user login as a "<role>"
Then user on  "<page>"

  Examples:
| mail            | password |role      |page|
|student62@library |KbybTpIZ |student62|books.|
|student63@library|Jg2orVoF  |student63|books.|
|student64@library|pbdQAvkN  |student64|books.|
|librarian52@library|QKjmEIhB|librarian52|Dashboard|








