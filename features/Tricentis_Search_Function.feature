Feature: Tricentis Search Function
  
  Scenario: Tricentis search results!
    Given: the web browser is at the Google home page
    When: the user searches for "Tricentis"
    Then: the results page includes results for "Tricentis"
    And: search results for "Tricentis" populate at the top of the page
    
Scenario: QASymphony Search 
    Given: the web browser opens
    When: the user types QASymphony
    Then: results for "Tricentis" appear!