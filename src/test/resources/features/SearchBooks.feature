Feature: 

	#As a students, I should be able to search books with different categories.
	@EUG14-183
	Scenario: students should be able to search books with different categories

		Given the user navigates to login page
		When  logged in as a "student"
		    Then user see <module>
		      | Books          | Borrowing Books|
		Then the user should search books on different categories
		