Feature: Logout

  Scenario: Student should be able to logout
    When Student should be able to login
    Then Student should be able to logout

    Scenario: Librarian should be able to logout
      When Librarian should be able to login
      Then Librarian should be able to logout
