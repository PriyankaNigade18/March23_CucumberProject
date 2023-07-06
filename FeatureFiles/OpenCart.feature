Feature: Test Opencart application

  Scenario: Test Login functionality with valid data
    Given Open Opencart application
    When I enter valid emailid "sample@gmail.com" and valid password "test123"
    And I clicked on Login button
    Then I should be able to Login
