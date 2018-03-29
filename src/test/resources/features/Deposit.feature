
Feature: Deposit
  This is where the deposit features will go

  Scenario: Successful Deposit
    Given I am logged in
     When I deposit 10 dollars
     Then my account should be increased by 10 dollars

  Scenario: Unsuccessful Deposit
    Given I am logged in
     When I deposit 25 dollars
     Then my account should not be increased by 25