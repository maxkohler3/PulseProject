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
    
    
  Scenario Outline: eating
    Given there are <start> cucumbers
    When I eat <eat> cucumbers
    Then I should have <left> cucumbers

  Examples:
    | start | eat | left |
    |  12   |  5  |  7   |
    |  20   |  5  |  15  |