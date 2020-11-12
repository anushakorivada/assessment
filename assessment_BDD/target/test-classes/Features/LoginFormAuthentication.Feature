
Feature: Form Authentication
  

  Scenario: Click Form authentication link to navigate to login page
    Given User launch chrome browser
    And User enters URL "https://the-internet.herokuapp.com/"
    When Click on form authentication link
    Then User navigates to login page
    And Page header should be "LoginPage"

  
  Scenario: Successfull login with valid credentials
    Given User launch chrome browser
    And User clicks on form authentication link and navigates to login page
    When User enters username "tomsmith" and password as "SuperSecretPassword!"
    And Clicks on login button
    Then User navigates to secure page and page header should "Secure Page"
    When User clicks on logout button
    And Page header should be "LoginPage"
    And Close browser

  	
  Scenario Outline: Login Data Driven
    Given User launch chrome browser
    And User clicks on orm authentication link and navigates to login page
    When User enters username <username> and password as <password>
    And Clicks on login button
    Then User navigates to secure page and page header should "Secure Page"
    When User clicks on logout button
    And Page header should be "LoginPage"
    And Close browser

    Examples: 
      | username | password                    |      |
      | tomsmith | successSuperSecretPassword! |      |
      | tomsmith | successSuperSecret          | Fail |
      | tom      | successSuperSecretPassword! | Fail |
      | tomsmith |                             | Fail |
      |          | successSuperSecretPAssword! | Fail |
      |          |                             | Fail |

