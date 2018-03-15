
Feature: Authentication
  This is the feature that does authentication tests

  Scenario: Happy path login
    Given I have opened the home page
     When I put in valid username and bad password
     Then I should be redirected to my dashboard
