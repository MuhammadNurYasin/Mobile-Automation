@Calculator @android
Feature: Calculator Page


  @test @positive
  Scenario: Adding two numbers
    Given user already login
    When user input 4 on first number field
    And user choose add operator
    And user input 2 on second number field
    And user tap equal button
    Then the result label is "Hasil : 6"

  @test @positive
  Scenario: Subtracting two numbers
    Given user already login
    When user input 4 on first number field
    And user choose subtract operator
    And user input 2 on second number field
    And user tap equal button
    Then the result label is "Hasil : 2"

  @test @positive
  Scenario: Dividing two numbers
    Given user already login
    When user input 4 on first number field
    And user choose divide operator
    And user input 2 on second number field
    And user tap equal button
    Then the result label is "Hasil : 2"

  @test @positive
  Scenario: Multiplicating two numbers
    Given user already login
    When user input 4 on first number field
    And user choose multiplicate operator
    And user input 2 on second number field
    And user tap equal button
    Then the result label is "Hasil : 8"

  @negative
  Scenario: Calculating two decimal numbers
    Given user already login
    When user input 4.5 at first number field
    And user choose "subtract" operator
    And user input 2.5 at second number field
    And user tap equal button
    Then the app is closed