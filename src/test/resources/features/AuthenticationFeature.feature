
Feature: AuthenticationFeature
  feature desc

  Scenario: Authentication Happy Path
    Given I open the app
     When I put in good credentials
     Then I get redirected to the home screen
