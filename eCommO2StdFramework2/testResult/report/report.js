$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ECOM-10200.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Validating Paymonthly Sim free Page.having 3 Test Cases"
    }
  ],
  "line": 3,
  "name": "ECOM_10200",
  "description": "",
  "id": "ecom-10200",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4334494480,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Arrows in the tab",
  "description": "",
  "id": "ecom-10200;arrows-in-the-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Regression1233"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "that I am a acquisition/upgrade customer",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I land on the Pay monthly sims page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click on the Phone tab",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the downward arrow of the tab should be changed to the upward arrow as per given design.",
  "keyword": "Then "
});
formatter.match({
  "location": "ECOM_10200_Step_Definition.that_I_am_a_acquisition_upgrade_customer()"
});
formatter.result({
  "duration": 102764920088,
  "status": "passed"
});
formatter.match({
  "location": "ECOM_10200_Step_Definition.i_land_on_the_Pay_monthly_sims_page()"
});
formatter.result({
  "duration": 30380,
  "status": "passed"
});
formatter.match({
  "location": "ECOM_10200_Step_Definition.i_click_on_the_Phone_tab()"
});
formatter.result({
  "duration": 224253534,
  "status": "passed"
});
formatter.match({
  "location": "ECOM_10200_Step_Definition.the_downward_arrow_of_the_tab_should_be_changed_to_the_upward_arrow_as_per_given_design()"
});
formatter.result({
  "duration": 36538,
  "status": "passed"
});
formatter.after({
  "duration": 2333764127,
  "status": "passed"
});
formatter.before({
  "duration": 3533739085,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Contract length tabs",
  "description": "",
  "id": "ecom-10200;contract-length-tabs",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Regression1233"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "that I am a acquisition/upgrade customer",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I land on the Pay monthly sims page",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "below the phone tab the contract length tabs of 12 months and 30 days should be displayed to me",
  "keyword": "Then "
});
formatter.match({
  "location": "ECOM_10200_Step_Definition.that_I_am_a_acquisition_upgrade_customer()"
});
formatter.result({
  "duration": 67978703594,
  "status": "passed"
});
formatter.match({
  "location": "ECOM_10200_Step_Definition.i_land_on_the_Pay_monthly_sims_page()"
});
formatter.result({
  "duration": 82929,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 48
    },
    {
      "val": "30",
      "offset": 62
    }
  ],
  "location": "ECOM_10200_Step_Definition.below_the_phone_tab_the_contract_length_tabs_of_months_and_days_should_be_displayed_to_me(int,int)"
});
formatter.result({
  "duration": 2978668287,
  "status": "passed"
});
formatter.after({
  "duration": 159561296,
  "status": "passed"
});
});