$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Functional/CFD_2044/CFA_Phones_ColourDropdownsWithColourNamesBesideTheColourMultipleColour.feature");
formatter.feature({
  "line": 1,
  "name": "CFA_Phones_ColourDropdownsWithColourNamesBesideTheColourMultipleColour",
  "description": "",
  "id": "cfa-phones-colourdropdownswithcolournamesbesidethecolourmultiplecolour",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "CFA_Phones_ColourDropdownsWithColourNamesBesideTheColourMultipleColour",
  "description": "",
  "id": "cfa-phones-colourdropdownswithcolournamesbesidethecolourmultiplecolour;cfa-phones-colourdropdownswithcolournamesbesidethecolourmultiplecolour",
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
  "line": 5,
  "name": "I am an CFA user and Lands on shop page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "navigate to PAYM Phones page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I choose PayM \u003chandset\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on the color dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify the name of the colour is next to the colour tile in CFAPhoneColour",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Navigate to device details page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "# And select a color"
    }
  ],
  "line": 12,
  "name": "select \u003ccolor\u003e color of the connected device",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Land on the \u0027Tariffs and extra\u0027 page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on the color dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "verify the name of the colour is next to the colour tile in CFAPhoneColour",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select \u003ccolor\u003e color of the connected device",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I Land on the basket page and choose home delivery option",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "click on \"go to checkout\" button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "input the below details in Delivery page",
  "rows": [
    {
      "cells": [
        "HouseNumber",
        "5"
      ],
      "line": 20
    },
    {
      "cells": [
        "Post Code",
        "BS7 0NP"
      ],
      "line": 21
    },
    {
      "cells": [
        "Title",
        "Mr"
      ],
      "line": 22
    },
    {
      "cells": [
        "FirstName",
        "Test"
      ],
      "line": 23
    },
    {
      "cells": [
        "Surname",
        "Accepta"
      ],
      "line": 24
    },
    {
      "cells": [
        "Contact Number",
        "078228377333"
      ],
      "line": 25
    },
    {
      "cells": [
        "Password",
        "TesterSit123"
      ],
      "line": 26
    },
    {
      "cells": [
        "Security Question",
        "Random"
      ],
      "line": 27
    },
    {
      "cells": [
        "Security Answer",
        "Sit Testers"
      ],
      "line": 28
    },
    {
      "cells": [
        "Date of Birth - Date",
        "22"
      ],
      "line": 29
    },
    {
      "cells": [
        "Date of Birth - Month",
        "10"
      ],
      "line": 30
    },
    {
      "cells": [
        "Date of Birth - Year",
        "1990"
      ],
      "line": 31
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Click on the \u0027Continue button\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "land on the payment page and input \u003cUsername\u003e and other details and click \u0027Continue on next step\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Continue to Agreements page and confirm all the agreement checks",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Continue to Review page and review the order",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "order confirmation is displayed",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 38,
      "value": "#Close the browser"
    }
  ],
  "line": 39,
  "name": "",
  "description": "",
  "id": "cfa-phones-colourdropdownswithcolournamesbesidethecolourmultiplecolour;cfa-phones-colourdropdownswithcolournamesbesidethecolourmultiplecolour;",
  "rows": [
    {
      "cells": [
        "handset",
        "Username",
        "color",
        "CFATariffColour"
      ],
      "line": 40,
      "id": "cfa-phones-colourdropdownswithcolournamesbesidethecolourmultiplecolour;cfa-phones-colourdropdownswithcolournamesbesidethecolourmultiplecolour;;1"
    },
    {
      "cells": [
        "Apple8",
        "TEST ACCEPTA",
        "Gold",
        "Gold"
      ],
      "line": 41,
      "id": "cfa-phones-colourdropdownswithcolournamesbesidethecolourmultiplecolour;cfa-phones-colourdropdownswithcolournamesbesidethecolourmultiplecolour;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 41530065201,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d60.0.3112.113)\n  (Driver info: chromedriver\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41),platform\u003dWindows NT 10.0.10586 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027LASST266243\u0027, ip: \u0027192.168.0.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\vmalalu1\\AppData\\Local\\Temp\\1\\scoped_dir9336_17908}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d60.0.3112.113, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 3c4a887778c83873566aaa661bf3f85c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:643)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions.deleteAllCookies(RemoteWebDriver.java:728)\r\n\tat steps.Hooks.openBrowser(Hooks.java:58)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner.feature(ExtendedTestNGRunner.java:69)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:104)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:645)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:851)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1177)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:756)\r\n\tat org.testng.TestRunner.run(TestRunner.java:610)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:387)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:382)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:340)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:289)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1293)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1218)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1133)\r\n\tat org.testng.TestNG.run(TestNG.java:1104)\r\n\tat org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:72)\r\n\tat org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:123)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 41,
  "name": "CFA_Phones_ColourDropdownsWithColourNamesBesideTheColourMultipleColour",
  "description": "",
  "id": "cfa-phones-colourdropdownswithcolournamesbesidethecolourmultiplecolour;cfa-phones-colourdropdownswithcolournamesbesidethecolourmultiplecolour;;2",
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
  "line": 5,
  "name": "I am an CFA user and Lands on shop page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "navigate to PAYM Phones page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I choose PayM Apple8",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on the color dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify the name of the colour is next to the colour tile in CFAPhoneColour",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Navigate to device details page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "# And select a color"
    }
  ],
  "line": 12,
  "name": "select Gold color of the connected device",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Land on the \u0027Tariffs and extra\u0027 page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on the color dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "verify the name of the colour is next to the colour tile in CFAPhoneColour",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select Gold color of the connected device",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I Land on the basket page and choose home delivery option",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "click on \"go to checkout\" button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "input the below details in Delivery page",
  "rows": [
    {
      "cells": [
        "HouseNumber",
        "5"
      ],
      "line": 20
    },
    {
      "cells": [
        "Post Code",
        "BS7 0NP"
      ],
      "line": 21
    },
    {
      "cells": [
        "Title",
        "Mr"
      ],
      "line": 22
    },
    {
      "cells": [
        "FirstName",
        "Test"
      ],
      "line": 23
    },
    {
      "cells": [
        "Surname",
        "Accepta"
      ],
      "line": 24
    },
    {
      "cells": [
        "Contact Number",
        "078228377333"
      ],
      "line": 25
    },
    {
      "cells": [
        "Password",
        "TesterSit123"
      ],
      "line": 26
    },
    {
      "cells": [
        "Security Question",
        "Random"
      ],
      "line": 27
    },
    {
      "cells": [
        "Security Answer",
        "Sit Testers"
      ],
      "line": 28
    },
    {
      "cells": [
        "Date of Birth - Date",
        "22"
      ],
      "line": 29
    },
    {
      "cells": [
        "Date of Birth - Month",
        "10"
      ],
      "line": 30
    },
    {
      "cells": [
        "Date of Birth - Year",
        "1990"
      ],
      "line": 31
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Click on the \u0027Continue button\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "land on the payment page and input TEST ACCEPTA and other details and click \u0027Continue on next step\u0027",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Continue to Agreements page and confirm all the agreement checks",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Continue to Review page and review the order",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "order confirmation is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.i_am_an_CFA_user_and_Lands_on_shop_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.navigate_to_PAYM_Phones_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple8",
      "offset": 14
    }
  ],
  "location": "E2EOrderPlaced_Steps.Choose_PAYM_Handset(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.click_on_the_color_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.verify_the_name_of_the_colour_is_next_to_the_colour_tile_in_CFAPhoneColour()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.Navigate_to_device_details_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Gold",
      "offset": 7
    }
  ],
  "location": "E2EOrderPlaced_Steps.select_color_of_the_device(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.land_on_the_Tariffs_and_extra_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.click_on_the_color_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.verify_the_name_of_the_colour_is_next_to_the_colour_tile_in_CFAPhoneColour()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Gold",
      "offset": 7
    }
  ],
  "location": "E2EOrderPlaced_Steps.select_color_of_the_device(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.i_Land_on_the_basket_page_and_choose_home_delivery_option()"
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
  "location": "E2EOrderPlaced_Steps.inputDetailsDeliveryPage(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.clickOnTheContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "TEST ACCEPTA",
      "offset": 35
    }
  ],
  "location": "E2EOrderPlaced_Steps.CreditCheckPaymentPage_HomeDelivery(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "E2EOrderPlaced_Steps.AgreementsPageConfirmation()"
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
