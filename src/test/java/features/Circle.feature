@Circle
Feature: Circle
@Circle_F001_S001
Scenario Outline: Sign Page
Given I am a patient wanting a knee replacement
When I put in my "<LOCATION>" and date of leave 5th May
Then I can get a consultants* availability and location provided to make my decision
Examples: 
| LOCATION 		| 
| RG1 7NP			| 