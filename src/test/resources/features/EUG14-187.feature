@EUG14-187
Feature: Users should have access to 2 modules as a student, to 3 modules as a librarian

  Background:
    Given the user navigates to login page

  Scenario: User accesses to 2 modules as a student

    When  logged in as a "student"
    Then user see <module>
      | Books          |
      | Borrowing Books|

  Scenario: User accesses to 3 modules as a librarian

    When  logged in as a "librarian"
    Then user see <module>
      | Dashboard |
      | Users     |
      | Books     |
