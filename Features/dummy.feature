Feature: CFA_Phones_ColourDropdownsWithColourNamesBesideTheColourMultipleColour

  @Web
  Scenario Outline: CFA_Phones_ColourDropdownsWithColourNamesBesideTheColourMultipleColour
    Given I am on delivery page
    And input the below details in Delivery page
      | HouseNumber           | 5            |
      | Post Code             | BS7 0NP      |
      | Title                 | Mr           |
      | FirstName             | Test         |
      | Surname               | Accepta      |
      | Contact Number        | 07822377333 |
      | Password              | TesterSit123 |
      | Security Answer       | Sit Testers  |
      | Date of Birth - Date  | 22           |
      | Date of Birth - Month | 10           |
      | Date of Birth - Year  | 1990         |
   # And Click on the 'Continue button'
   # And land on the payment page and input <Username> and other details and click 'Continue on next step'
   # And Continue to Agreements page and confirm all the agreement checks
   # And Continue to Review page and review the order
   # Then order confirmation is displayed

    #Close the browser
    Examples:
      | handset | Firstname | Surname | Username     |
      | Iphone7 | TEST      | ACCEPTA | TEST ACCEPTA |
