

Feature: As a business user, I would like to make a record of all teams which are playing today
  
  Scenario: Output all team names with a match today. If there are no matches today, output a message to convey this.
    Given user is on www.bbc.co.uk homepage
    And user clicks on sport tab header
    When user clicks on Football tab
    And user clicks on Score & Fixtures
    And user click on Today
    Then user should be able to see all team names with a match today
    