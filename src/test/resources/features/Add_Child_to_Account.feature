Feature: Add Child to Account
  Adding a child to a parents account so their information can be managed

  Scenario: Successfully Add a Child
    Given I click Add Child on the Home Screen
     When I fill out all required fields
     Then The child should be successfully added
     
  Scenario: Add Child Error Message - missing Name
    Given I click Add Child on the Home Screen 
     When I fill out all fields except name
      And click save
     Then There should be an error message
     
  Scenario: A child error message - missing birthday
    Given I click Add Child on the Home Screen
     When I fill out all the fields except birthday
     Then I should get a no birthday error messagelkj

Scenario: A child error message - missing birthday2
    Given I click Add Child on the Home Screen
     When I fill out all the fields except birthday1
     Then I should get a no birthday error message1
     
Scenario: A child error message - missing birthday3
    Given I click Add Child on the Home Screen
     When I fill out all the fields except birthday1
     Then I should get a no birthday error message1
     
Scenario: The sum of a list of numbers should be calculated
    Given a list of numbers
      | 17   |
      | 42   |
      | 4711 |
    When I summarize them
    Then should I get 4770