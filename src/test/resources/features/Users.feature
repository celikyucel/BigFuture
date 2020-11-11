Feature: librarian should be able to add users from users page

	#AC:
	#1. add users with all valid info.
	#2. Librarians able to close the add user window with "close" button
	#3. Librarians able to edit user info.

	Background:  the user logged in as librarian
	@EUG14-172 @EUG14-170
	Scenario: As a librarian, I should be able to add users from users page
		    When the librarian clicks to addUser button
		    Then a user is created
		    When librarian clicks to close button
			Then the add user window is closed


	@EUG14-172 @EUG14-170
	Scenario: As a librarian, I should be able to edit users from users page
		When user clicks to editUser button
		Then the librarian is able to edit the user
		When librarian clicks to close button
		Then the add user window is closed



		        