Feature: Test Google Application

  Background: 
    Given Open Google Application

  Scenario: Test Google application title
    When I capture current title of application
    Then Title should match With Google

  Scenario: Test Search Feature with Valid keyword
    When I search valid keyword in search box of google
    Then I should get valid search result
