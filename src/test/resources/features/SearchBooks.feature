Feature: 

	#As a students, I should be able to search books with different categories.
  @EUG14-183
  Scenario Outline: students should be able to search books with different categories

    Given the user navigates to login page
    When  logged in as a "student"
    Then the user navigates to book page
    Then the user should search books on following "<categories>"
    Examples:
      | categories              |
      | ALL                     |
      | Action and Adventure    |
      | Anthology               |
      | Classic                 |
      | Comic and Graphic Novel |
      | Crime and Detective     |
      | Drama                   |
      | Fable                   |
      | Fairy Tale              |
      | Fan-Fiction             |
      | Fantasy                 |
      | Historical Fiction      |
      | Horror                  |
      | Science Fiction         |
      | Biography/Autobiography |
      | Humor                   |
      | Romance                 |
      | Short Story             |
      | Essay                   |
      | Memoir                  |
      | Poetry                  |

