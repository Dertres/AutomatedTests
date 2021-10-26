Feature: API test

  Scenario: Test a GET API
    Given url 'https://petstore.swagger.io/v2/pet/1'
    When method GET
    Then status 200
