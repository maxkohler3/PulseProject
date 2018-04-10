Feature: Add Child to Account
  Adding a child to a parents account so their information can be managed

  Scenario: Successfully Add a Child
    Given I click Add Child on the Home Screen
     When I fill out all required fields
     Then The child should be successfully added
     
  Scenario: Add Child Error Message - missing Name
     When I fill out all fields except name
      And click save
     Then There should be an error message
