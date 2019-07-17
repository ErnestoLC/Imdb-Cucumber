#Author: ernestolopezcota@gmail.com

Feature: Sinatra Add Song

  Scenario: Create a song
    Given I launch home page
    And Home page is displayed correctly
    When I log in to the application
    And I show a list of songs
    And I create a new song
    Then The song is created
