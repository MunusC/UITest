

Feature: As a sports user, I would like to read about all articles related to sports

  Scenario: Use the search option to find all articles related to ‘sports’. Output the first heading and the last heading returned on the page
    Given user is  on www.bbc.co.uk homepage
    When I search all articles related to "<sports>"
    Then I should see the first and last headings of the sports news page
    
    