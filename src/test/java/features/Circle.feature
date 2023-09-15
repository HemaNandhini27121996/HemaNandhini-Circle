@Circle
Feature: I want to check for consultant availability for my knee replacement

Background:

    Given I navigate to the Circle Health Group Website

  @Circle_F001_S001
  Scenario Outline: Login to Circle Health group and check for consultant for knee replacement surgery
    When I select my "<LOCATION>" and preferred date of leave
    Then I am able to book consultants based on locations
    And I should see the consultant availability at the selected time

    Examples: 
      | LOCATION |
      | RG1 7NP  |