@auto
Feature: Menu button Testing

  Background: 
    * say hello!

  @smoke
  Scenario: Validate Menu button
    Given user select menu button
    When user insert email<'tdd@gmail.com'>
    Then user clicks show password
    And user clicks create a new account button
    Then user is in Create-Account page
    And user insert first name <'Caludia'>
    When user insert last name <'Suarez'>

  @regression
  Scenario Outline: Validate Menu button
    Given user select menu button
    When user insert email<'tdd@gmail.com'>

    Examples: 
      | email              |
      | 'tdd@gmail.com'    |
      | 'sumaya@gmail.com' |
      | 'ritu@gmail.com'   |
