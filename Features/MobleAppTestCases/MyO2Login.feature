Feature: MyO2Login

  @MobileApp
  Scenario:  MyO2 login logout scenario validation
    Given I am an existing user and Launch MyO2 app
    When Entered Valid Username, Password and continue
    Then Enter valid Security code and Continue
    And skip get started screen
    When I open the left navigation pane
    And Tap on Sign out
    #Then I should be successfully Signout
