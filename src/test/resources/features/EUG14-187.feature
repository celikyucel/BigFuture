Feature: Students should have access to 2 modules


  @EUG14-187
  Scenario: User accesses to 2 modules as a student

    When the user is logged in
    Then user see <module>
      | Books |
      | Borrowing Books|