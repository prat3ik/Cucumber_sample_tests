Feature: Login Feature

  Scenario: Login with correct username and password
    Given I navigate to login page
    And I enter the username as "ny206822"
    And I enter the password as "x"
    And I click on sublit button
    Then I should see user_icon
    And I quit the browser