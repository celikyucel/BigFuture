Feature:Librarian should be able to see book records on the user page

  Background:
    Given the user navigates to login page
    Then  logged in as a "librarian"

  @EUG14-186
  Scenario: Librarian should be able to see default book records

    And Navigate to Book Record Page
    Then Verify default record is 10
    And Verify book records is following options
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |