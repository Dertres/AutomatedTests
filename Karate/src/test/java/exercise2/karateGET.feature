Feature: API test

  Scenario: Test a GET API
    Given url 'https://petstore.swagger.io/v2/pet/701'
    When method GET
    Then status 200
    And print response
    And print responseStatus