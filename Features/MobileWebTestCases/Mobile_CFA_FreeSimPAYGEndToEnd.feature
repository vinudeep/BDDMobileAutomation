Feature: Mobile CFA_PayG_IpadandTablet_SIM_Mobile

  @Mobile
  Scenario Outline:  Ordering a Ipad or Tablet free sim in Mobile Handset
    Given I am an CFA user and Lands on Mobile shop page
    And navigate to PayG SIMO page in Mobile
    And Tap on iPads and Tablets Tab
    And Pick a Sim <SurferType> and <SimType>
    And Verify user is navigated to Delivery details page
    And input the below details in Free Sim Delivery page
      | HouseNumber    | 5           |
      | Post Code      | BS7 0NP     |
      | Title          | Mr          |
      | FirstName      | TEST        |
      | Surname        | ACCEPTA     |
      | Contact Number | 07822837733 |

   # And Tap on Send me my sim button
    Then Free Sim order confirmation is displayed

    Examples:
      | SurferType   | SimType |
      | Light surfer | iPad    |