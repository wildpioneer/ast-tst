Feature: UI Test

  Scenario: Login as customer
    Given login page is opened
    When user enter login "steven.moreau@juiceplus.com" and password "Abcd1234"
    Then the customer's profile page is displayed