$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ECOM-10136.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#This features containing 4 test cases story of ECOM-10102 valiudation the Enhanced Sort Tab having 4 Test Cases"
    }
  ],
  "line": 2,
  "name": "ECOM10102",
  "description": "",
  "id": "ecom10102",
  "keyword": "Feature"
});
formatter.before({
  "duration": 27526814145,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Enhancing \"SORT\" tab on Tablet listing page",
  "description": "",
  "id": "ecom10102;enhancing-\"sort\"-tab-on-tablet-listing-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smokeTestECOM10102"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "that I am an upgrading/acqusition customer Tablet journey",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I land on the tablet listing page on O2 Shop",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on the SORT tab of tablet",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the enhanced SORT Tablet should be displayed to me as per given UX",
  "keyword": "Then "
});
formatter.match({
  "location": "ECOM_10102_Step_Definition.that_I_am_an_upgrading_acqusition_customer_Tablet_journey()"
});
formatter.result({
  "duration": 122402108435,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 38
    }
  ],
  "location": "ECOM_10102_Step_Definition.i_land_on_the_tablet_listing_page_on_O_Shop(int)"
});
formatter.result({
  "duration": 55282393,
  "status": "passed"
});
formatter.match({
  "location": "ECOM_10136_Step_Definition.i_click_on_the_SORT_tab_of_tablet()"
});
formatter.result({
  "duration": 5003575246,
  "status": "passed"
});
formatter.match({
  "location": "ECOM_10136_Step_Definition.the_enhanced_SORT_Tablet_should_be_displayed_to_me_as_per_given_UX()"
});
formatter.result({
  "duration": 164576818,
  "status": "passed"
});
formatter.after({
  "duration": 2358949786,
  "status": "passed"
});
