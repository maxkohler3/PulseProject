Feature: Subtraction
  In this feature, we will verify that we can subtract one number from another number

  Scenario: Base Case
    Given I have two numbers
      | 10 |
      | 3  |
    When I subtract the second number from the first
    Then I should get the number "7"

  Scenario: Edge Case
    Given I have two numbers
      | 10 |
      | 10  |
    When I subtract the second number from the first
    Then I should get the number "0"