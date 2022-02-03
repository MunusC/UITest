

Feature: As a QA, I would like to verify all negative scenarios for login

  Scenario Outline: : User should not be able to login with invalid credential
    Given User is on www.bbc.co.uk homepage
    And  User clicks on Sign in tab
    When User enters username as "<username>"
    And User enters password as "<password>"
    And User clicks on Sign in button
    Then user gets the error message as "<error>" for "<Feild>"
    Examples:
    | username           | password               | Feild       | error                                                                                                |
    | demouser@gmail.com | N0lansT1melinef0und!   | Username    |Sorry, we can’t find an account with that email. You can register for a new account or get help here.|
    | Nolantenet         |                        | Password    |Something's missing. Please check and try again.                                                     |
    |                    | N0lansT1melinef0und!   | Username    |Something's missing. Please check and try again.                                                     |
    | Nolantenet         | 23434343443            | Password    |Sorry234, that password isn't valid. Please include a letter.                                           |
    | Nolantenet         | tenet                  | Password    |Sorry12345, that password is too short. It needs to be eight characters or more.                          | 