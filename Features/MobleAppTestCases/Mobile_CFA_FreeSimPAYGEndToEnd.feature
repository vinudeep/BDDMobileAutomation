Feature: Mobile CFA_PayG_IpadandTablet_SIM_Mobile

  @MobileApp
  Scenario Outline:  Ordering a Ipad or Tablet free sim in Mobile Handset
    Given I am an CFA user and Lands on Mobile shop page


    Examples:
      | SurferType   | SimType |
      | Light surfer | iPad    |