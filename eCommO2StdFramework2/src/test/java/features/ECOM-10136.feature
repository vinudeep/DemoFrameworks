#This features containing 4 test cases story of ECOM-10102 valiudation the Enhanced Sort Tab having 4 Test Cases
Feature: ECOM-10102 

  @smokeTest
  Scenario: Enhancing "SORT" tab on Tablet listing page
    Given that I am an upgrading/acqusition customer Tablet journey
    And I land on the tablet listing page on O2 Shop
    And I click on the SORT tab of tablet
    Then the enhanced SORT Tablet should be displayed to me as per given UX

  @smokeTest
  Scenario: Enhancing "SORT" tab on Smartwatches trackers listing page
    Given that I am an upgrading/acquisition customer Smartwatches
    And I land on the Smartwatchess Trackers listing page on O2 Shop
    And I click on the SORT tab of Smartwatches
    Then the enhanced SORT Smartwatches should be displayed to me as per given UX in (2 columns)

  @smokeTest
  Scenario: Enhancing "SORT" tab on Fitness trackers listing page
    Given that I am an upgrading/acquisition customer Fitness Journey
    And I land on the FtinessTracker Trackers listing page on O2 Shop
    And I click on the SORT tab of Fitness
    Then the enhanced SORT Fitness should be displayed to me as per given UX in (2 columns)

  @smokeTest
  Scenario: Enhancing "SORT" tab on accessories listing page
    Given that I am an upgrading/acquisition customer Accessory Journey
    And I land on the accessory listing page on O2 Shop
    And I click on the SORT tab of accesory
    Then the enhanced SORT accessories should be displayed to me as per given UX.
