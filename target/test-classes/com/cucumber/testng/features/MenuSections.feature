Feature: As a user I want to get ability to use menu sections

  @smoke
  Scenario: Docs sections should contains appropriate columns
    Given the user opens Cucumber website
    When the user clicks on the "Docs" section
    And the user clicks on the "Gherkin Syntax" item
    Then page with title "Gherkin Syntax" is displayed
    Then the following links are displayed
      | link 1 |
      | link 2 |
      | link 3 |

