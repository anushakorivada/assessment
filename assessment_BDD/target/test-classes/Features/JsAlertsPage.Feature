
Feature: Check JavaScript alert functionality
 

  Scenario: Navigate to javascriptalerts page
    Given User launch chrome browser
    And User opens URL "https://the-internet.herokuapp.com/"
    When user clicks on javascipt alerts link
    Then user navigate to javascripts alert page
    Then user clicks on Jsconfirm button
    And confirm popup is openend
    And user accepts the alert
    And USer dismiss the alert
    And Close the browser

  
