$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ECOM_10210_Tablet_MBB_tab.feature");
formatter.feature({
  "line": 1,
  "name": "Tablet_MBB tab  - eComm10210",
  "description": "",
  "id": "tablet-mbb-tab----ecomm10210",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4778923730,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Tablet Tab.",
  "description": "",
  "id": "tablet-mbb-tab----ecomm10210;tablet-tab.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression123123"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am an eComm test user02 in o2",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I choose Sims and Pay Monthly sims",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "select Tablet",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I am able to see the contract length as 12 months and 30 days",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on 12 months contact length to see all tariffs that are relevant",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on 30 dayscontact length to see all tariffs that are relevant",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "02",
      "offset": 23
    },
    {
      "val": "2",
      "offset": 30
    }
  ],
  "location": "ECOM_10210_Tablet_MBB_TAB_Step_Definition.i_am_an_eComm_test_user_in_o(int,int)"
});
formatter.result({
  "duration": 29138600143,
  "status": "passed"
});
formatter.match({
  "location": "ECOM_10210_Tablet_MBB_TAB_Step_Definition.I_choose_Sims_and_Pay_Monthly_Sims()"
});
formatter.result({
  "duration": 46963675066,
  "status": "passed"
});
formatter.match({
  "location": "ECOM_10210_Tablet_MBB_TAB_Step_Definition.Select_Tablet()"
});
formatter.result({
  "duration": 125370512,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 40
    },
    {
      "val": "30",
      "offset": 54
    }
  ],
  "location": "ECOM_10210_Tablet_MBB_TAB_Step_Definition.i_am_able_to_see_the_contract_length_as_months_and_days(int,int)"
});
formatter.result({
  "duration": 115166145,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 11
    }
  ],
  "location": "ECOM_10210_Tablet_MBB_TAB_Step_Definition.i_click_on_months_contact_length_to_see_all_tariffs_that_are_relevant(int)"
});
formatter.result({
  "duration": 30075537601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30",
      "offset": 11
    }
  ],
  "location": "ECOM_10210_Tablet_MBB_TAB_Step_Definition.i_click_on_dayscontact_length_to_see_all_tariffs_that_are_relevant(int)"
});
formatter.result({
  "duration": 35184126084,
  "status": "passed"
});
formatter.after({
  "duration": 289759917,
  "status": "passed"
});
});