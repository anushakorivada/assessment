
Feature: Check Dynamic loading of elements feature

  
 Scenario: User click on Dynamic loading link 
 		Given User launch chrome browser
 		And User opens URL "https://the-internet.herokuapp.com/"
 		When User Click on form Dynamic Loading link
 		Then User navigates to dynamic loading page
 
  
 Scenario: Validate example2 link functionality
    Given User click on example2 link 
    And check page title should be as"Dynamic Loading"
    When Click on start button
    Then check for "Hello World!" message displays after loading bar dissapears
    And close bowser


 
