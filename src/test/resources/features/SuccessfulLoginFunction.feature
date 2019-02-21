Feature: SuccessfulLoginFunction1
  
Scenario: This works
  Given: I am on the sign in page!
  When: I click login
  Then: I should see Welcome Max
  And: We'll see if this works!

  Scenario: Tricentis Search Function
    Given: the web browser is at the Google home page
    When: the user searches for Tricentis
    Then: the results page includes results for Tricentis
    And: search results for Tricentis populate at the top of the page