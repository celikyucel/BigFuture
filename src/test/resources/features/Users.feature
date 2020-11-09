Feature: librarian should be able to add users from users page

	#AC:
	#1. add users with all valid info.
	#2. Librarians able to close the add user window with "close" button
	#3. Librarians able to edit user info.

	@EUG14-172 @EUG14-170
	Scenario: As a librarian, I should be able to add users from users page
		    Given the user logged in as "librarian"
		    When the user click to "button" "add user"
		    Then the page creates "user"
		    When user click to "button" "close"
		    Then the add user page closes "popup"
		    When user click to "button" "edit"
		    Then the add user page closes "popup"
		        