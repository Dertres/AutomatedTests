Feature: HomePage

  Scenario: Generate new user
    Given user is in index page
    When user clicks in sign up nav link
    And user enters username and password
    And user click in sign up button
    Then new user was generated

  Scenario: Login from new user
    Given user is in index page
    When user clicks in log in nav link
    And user enters the username and password
    And user clicks in Log in button
    Then username goes to homepage

  Scenario: Log out of user
    Given user is in the homepage
    When user clicks on Log out nav link
    Then user goes to default index page