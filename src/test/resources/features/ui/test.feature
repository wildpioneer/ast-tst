Feature: UI Test
  Scenario: UI Test 1
    Given login page is opened
    When user enter login "atrostyanko+master@gmail.com" and password "QqtRK9elseEfAk6ilYcJ"
    Then projects page is opened