Feature: math 

Scenario: The sum of a list of numbers should be calculated 
	Given a list of numbers 
		| 17   |
		| 42   |
		| 4711 |
	When I add them 
	Then I should get "4770" 
	
Scenario: The sum of a list of numbers should be calculated test 
	Given a list of numbers 
		| 20 |
		| 30 |
	When I add them 
	Then I should get "50" 
    