#This features containing 4 test cases story of ECOM-10102
Feature: valiudation the Enhanced filter Tab

  @smokeTest
  Scenario: Enhancing Filter Tab on Tablet Listing page
    Given that I am an upgrading/acqusition customer Tablet journey
    And I land on the tablet listing page on O2 Shop
    Then the enhanced filter tab should be displayed to on Tablet as per given Ux

  @smokeTest
  Scenario: Enhancing Filter Tab on Accessory Listing page
    Given that I am an upgrading/acquisition customer Accessory Journey
    And I land on the accessory listing page on O2 Shop
    Then the enhanced filter tab should be displayed to on Accessory as per given UX

  @smokeTest
  Scenario: Enhancing Filter Tab on Fitness Trackers Listing page
    Given that I am an upgrading/acquisition customer Fitness Journey
    And I land on the Ftiness Trackers listing page on O2 Shop
    Then the enhanced filter tab should be displayed to on Fitness as per given Ux

  @smokeTest
  Scenario: Enhancing Filter Tab on Smartwatches Trackers Listing page
    Given that I am an upgrading/acquisition customer Smartwatches
    And I land on the Smartwatches Trackers listing page on O2 Shop
    Then the enhanced filter tab should be displayed to Smartwatches as per given Ux
