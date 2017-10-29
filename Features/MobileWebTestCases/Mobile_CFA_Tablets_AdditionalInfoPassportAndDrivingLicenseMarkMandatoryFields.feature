Feature: CFA_Tablets_Additional info driving license validation

  @Web
  Scenario Outline: CFA_Tablets_Additional info driving license validation
    Given I am an CFA user and Lands on shop page
    And navigate to PAYM Tablets page
    And I choose <tabletname> Tablet
    And Navigate to device details page
    And Land on the 'Tariffs and extra' page
    And I Land on the basket page and choose home delivery option
    And click on "go to checkout" button
    And verify copy text You will need to give details for all fields marked with an asterisk is displayed
    And verify asterisk is displayed against mandatory fields of "Delivery page"
    And input the below details in Delivery page
      | HouseNumber           | 5            |
      | Post Code             | BS7 0NP      |
      | Title                 | Mr           |
      | FirstName             | TEST         |
      | Surname               | ADDINFOD     |
      | Contact Number        | 078228377333 |
      | Password              | TesterSit123 |
      | Security Question     | Random       |
      | Security Answer       | Sit Testers  |
      | Date of Birth - Date  | 22           |
      | Date of Birth - Month | 10           |
      | Date of Birth - Year  | 1990         |
    And Click on the 'Continue button'
     #Below is payment page
    And verify copy text You will need to give details for all fields marked with an asterisk is displayed
    And verify asterisk is displayed against mandatory fields of "Payments page"
     #And land on the payment page and input <Username> and other details and click 'Continue on next step'
    Then Additional information page should be displayed
    And verify copy text You will need to give details for all fields marked with an asterisk is displayed
    And verify asterisk is displayed against mandatory fields of "Passport page"
    And Enter valid details for passport
      | CountryCode | pn1        | pn2 | pn3     | pn4 | pn5     | pn6            | pn7 |
      | GBR         | 9342354167 | GBR | 9905116 | M   | 2011097 | <<<<<<<<<<<<<< | 08  |
    And verify asterisk is displayed against mandatory fields of "Driving Licence page"
    And Enter valid details for Driving licence
      | DLinfo1 | DLinfo2 | DLinfo3 | DLinfo4 | PostCode |
      | HOWES   | 905110  | MD9     | 33      | SL14DX   |
    And Click on the 'Continue button'
    And Continue to Agreements page and confirm all the agreement checks
    And Continue to Review page and review the order
    Then order confirmation is displayed

    Examples:
      | tabletname |
      | TEST       |
