Feature: API Test
  Scenario: Get Token
    Given api is up
    When admin send GET request to "api/authenticate"
    Then status code is 200