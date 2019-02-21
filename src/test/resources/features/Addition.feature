Feature: Addition
  In this feature, we will verify that we can add one number to another number

  Scenario: Add Test - Base Case
    Given I have two numbers
      | 10 |
      | 3  |
    When I add the second number to the first
    Then I should get the number "13"

  Scenario: Addition - Edge Case
    Given I have two numbers
      | 10 |
      | 10  |
    When I add the second number to the first
    Then I should get the number "20"