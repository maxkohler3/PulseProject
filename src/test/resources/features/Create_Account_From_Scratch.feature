Feature: Create_Account_From_Scratch
  Users should be able to create accounts for themselves

  Scenario: Create_Account_Landing_Page
    Given I open the app
     When I have no account AML
     Then I should see the create account page
      And I should see a name
      And I should see a number of kids input
     
  Scenario Outline: Create_Account_Page
    Given I am on the create account page!
     When I fill in <name> and <numkids> correctly
     Then I should be redirected to the dashboard
     
    Examples:
        | name      | numkids   |
        | Mommy     |  1        | 
        | Daddy     |  5        | 
        | Elise     |  1        |