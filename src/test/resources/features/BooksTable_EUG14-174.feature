Feature:Students default page


	#As a student, I should be able to see tables with default info
  @EUG14-174
  Scenario: Students see tables with default info

    Given the user is logged in

    Then table should have following column names

      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |