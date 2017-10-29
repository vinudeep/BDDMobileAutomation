$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\Features\\Sim_Free_Acquisition.feature");
formatter.feature({
  "line": 1,
  "name": "Sim_Free_Acquisition_validation.",
  "description": "",
  "id": "sim-free-acquisition-validation.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sim_Free_Acquisition_Journey",
  "description": "",
  "id": "sim-free-acquisition-validation.;sim-free-acquisition-journey",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am an eComm user12",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I choose \u0027like new\u0027 sim free device",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Both 12 months and 30 days tariffs are available",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Land on the \u0027Tariffs and extra\u0027 page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I SHOULD be able to see both 12 month and 30 days tab just above the tariffs tile on the right hand side, to select the associated Pay monthly tariffs with a text \u0027Contract length\u0027 at the right hand side",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Remove copy \u0027Contract length is 12 months.\u0027",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 18
    }
  ],
  "location": "Sim_Free_Aquisition_PayM_Journey.I_am_an_eComm_user(int)"
});
formatter.result({
  "duration": 116446419665,
  "status": "passed"
});
formatter.match({
  "location": "Sim_Free_Aquisition_PayM_Journey.I_choose_like_new_sim_free_device()"
});
formatter.result({
  "duration": 10770247119,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 5
    },
    {
      "val": "30",
      "offset": 19
    }
  ],
  "location": "Sim_Free_Aquisition_PayM_Journey.Both_months_and_days_tariffs_are_available(int,int)"
});
formatter.result({
  "duration": 198293,
  "status": "passed"
});
formatter.match({
  "location": "Sim_Free_Aquisition_PayM_Journey.Land_on_the_Tariffs_and_extra_page()"
});
formatter.result({
  "duration": 15686273987,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 29
    },
    {
      "val": "30",
      "offset": 42
    }
  ],
  "location": "Sim_Free_Aquisition_PayM_Journey.I_SHOULD_be_able_to_see_both_month_and_days_tab_just_above_the_tariffs_tile_on_the_right_hand_side_to_select_the_associated_Pay_monthly_tariffs_with_a_text_Contract_length_at_the_right_hand_side(int,int)"
});
formatter.result({
  "duration": 165860,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 32
    }
  ],
  "location": "Sim_Free_Aquisition_PayM_Journey.Remove_copy_Contract_length_is_months_(int)"
});
formatter.result({
  "duration": 10652750996,
  "status": "passed"
});
});