$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CFA_Accessories_Confirmation_Page_changes.feature");
formatter.feature({
  "line": 1,
  "name": "CFA_Accessories_Confirmation_Page_changes",
  "description": "",
  "id": "cfa-accessories-confirmation-page-changes",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "This scenario ensures that when the customer selects a accessory and tries to place an order,\r\nthen the customer should be able to see the changes in Confirmation page",
  "id": "cfa-accessories-confirmation-page-changes;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Web"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am an CFA user and Lands on shop page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Navigate to Accessories",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select an \"Random\" Accessory",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "add Accessories to basket within limit in details page and navigate to basket",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Land on the Non Phone related basket page and choose home delivery option",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on \"go to checkout\" button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "input \u003cFirstname\u003e and \u003cSurname\u003e and other valid details in Delivery page and Click on the \u0027Continue button\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "land on the Non Credit check payment page and input \u003cUsername\u003e and other details and click \u0027Continue on next step\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Continue to Review page and review the order",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "order confirmation is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Verify contents of order confirmation page for Accessories containing \u003cStatus\u003e",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 20,
      "value": "#Step 9 and Step 10 of ALM clubbed together"
    }
  ],
  "line": 21,
  "name": "",
  "description": "",
  "id": "cfa-accessories-confirmation-page-changes;;",
  "rows": [
    {
      "cells": [
        "Firstname",
        "Surname",
        "Username",
        "Status"
      ],
      "line": 22,
      "id": "cfa-accessories-confirmation-page-changes;;;1"
    },
    {
      "cells": [
        "TEST",
        "ACCEPTA",
        "TEST ACCEPTA",
        "In Stock"
      ],
      "line": 23,
      "id": "cfa-accessories-confirmation-page-changes;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 22156912369,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "",
  "description": "This scenario ensures that when the customer selects a accessory and tries to place an order,\r\nthen the customer should be able to see the changes in Confirmation page",
  "id": "cfa-accessories-confirmation-page-changes;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Web"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am an CFA user and Lands on shop page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Navigate to Accessories",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select an \"Random\" Accessory",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "add Accessories to basket within limit in details page and navigate to basket",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Land on the Non Phone related basket page and choose home delivery option",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on \"go to checkout\" button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "input TEST and ACCEPTA and other valid details in Delivery page and Click on the \u0027Continue button\u0027",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "land on the Non Credit check payment page and input TEST ACCEPTA and other details and click \u0027Continue on next step\u0027",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Continue to Review page and review the order",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "order confirmation is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Verify contents of order confirmation page for Accessories containing In Stock",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.i_am_an_CFA_user_and_Lands_on_shop_page()"
});
formatter.result({
  "duration": 876013985,
  "status": "passed"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.navigate_to_Accessories()"
});
formatter.result({
  "duration": 14168915091,
  "error_message": "junit.framework.AssertionFailedError: unable to do mousehover to Accessories\r\n\tat junit.framework.Assert.fail(Assert.java:57)\r\n\tat steps.E2EOrderPlaced_Steps.navigate_to_Accessories(E2EOrderPlaced_Steps.java:161)\r\n\tat ✽.And Navigate to Accessories(CFA_Accessories_Confirmation_Page_changes.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Random",
      "offset": 11
    }
  ],
  "location": "E2EOrderPlaced_Steps.select_an_Accessory(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.add_Accessories_to_basket_within_limit_in_details_page_and_navigate_to_basket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.NonPhoneRelatedBasketPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "go to checkout",
      "offset": 10
    }
  ],
  "location": "E2EOrderPlaced_Steps.CheckoutFromBasket(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "TEST",
      "offset": 6
    },
    {
      "val": "ACCEPTA",
      "offset": 15
    }
  ],
  "location": "E2EOrderPlaced_Steps.DeliveryPage_Inputs_homeDelivery(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "TEST ACCEPTA",
      "offset": 52
    }
  ],
  "location": "E2EOrderPlaced_Steps.NonCreditCheckPaymentPage_HomeDelivery(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.ReviewPageConfirmation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.OrderConfirmationPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.verify_contents_of_order_confirmation_page_for_Accessories_containing_In_Stock()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4050250406,
  "status": "passed"
});
});