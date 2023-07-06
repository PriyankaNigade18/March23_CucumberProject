@All
Feature: Test Amazon application

  Background: 
    Given Open Amazon application

  @HomePage
  Scenario: Test HomePage Title
    When I capture home page title
    Then Title should match to HomePage

  @BestSellers
  Scenario: Test BestSellers page title
    When I open Best sellers page
    When I capture Best sellers page title
    Then Title should match to BestSeller

  @Mobiles
  Scenario: Test Mobile page title
    When I open Mobiles page
    When I capture Mobile page title
    Then Title should match to Mobiles page

  @Deals
  Scenario: Test Todays deal page title
    When I open Todays deal page
    When I capture Todays deal page title
    Then Title should match to Todays deal
