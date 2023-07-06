Feature: Test Orangehrm application

  Scenario Outline: Test data driven for login of hrm
    Given Open Orangehrm application
    When user enter valid username "<un>" and valid password "<psw>"
    And User click on Login button
    Then User should be able to login as per validation

    Examples: 
      | un     | psw      |
      | Admin  | admin123 |
      | Sarang | test123  |
      | Admin  | admin123 |
