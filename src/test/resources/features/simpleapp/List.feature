@List @android
Feature: List Page

  @test @positive
  Scenario: Tap List ke-1 with long press
    Given user already login
    When user tap hamburger button
    And user choose list menu
    And user long press in first list
    Then pop up message appear


  @test @positive
  Scenario: tap List ke-1 multiple times
    Given user already login
    When user tap hamburger button
    And user choose list menu
    And user tap in first list with ten times
    Then pop up message appear


