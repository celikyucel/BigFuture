Feature:Librarian should be able to see book records on the user page

  @EUG14-186
  Scenario: Librarian should be able to see default book records

    Given "librarian" is logged in
    Then Verify default record is 10
    And Verify book records is following options
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |