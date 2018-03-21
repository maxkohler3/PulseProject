
Feature: AuthenticationFeature
  feature desc

  Scenario: Authentication Happy Path
    Given I open the app
     When I put in good credentialsasdfasdf
     Then I get redirected to the home screen

  Scenario: AUthentication another path
    Given I do something else
     When I do it
     Then I did it
     
  Scenario: Verify Bad password gives error
    Given I open the login page
     When I put in a good user name and bad password
     Then I should get an error on submit

