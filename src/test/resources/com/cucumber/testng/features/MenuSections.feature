Feature: As a user I want to get ability to use menu sections

  @smoke
  Scenario: Docs sections should contains appropriate columns
    Given the user opens Cucumber website
    When the user hover on the Autobaraholka section
    Then page has elements
    When the user hover on the Home and flats section
    Then page elements2 is displayed






