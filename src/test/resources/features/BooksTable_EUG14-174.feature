Feature: As a student, I should be able to see tables with default info
  @EUG14-174
  Scenario: Students see tables with default info
    When the user navigates to login page
    Given logged in as a "student"
    Then table should have following column names

      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |