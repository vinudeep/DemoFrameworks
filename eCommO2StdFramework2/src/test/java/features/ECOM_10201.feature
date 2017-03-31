#Horizontal Tariff Structure Inner modules having 2 Test cases
Feature: ECOM10201  

  @smokeTest
  Scenario: Horizontal Tariff Structure - Inner modules
    Given that I am a acquisition customer
    When I land on the Pay monthly sims page
    And I want to select a phone pay monhtly sim tariff
    Then I should see the below contents inside the horizontal tariff tile
      | Data, Minutes and Texts |
      | Price per month         |
    And 'Buy now' CTA links straight to the basket page.
    And 'Check box' A check box to be displayed with the below details "I'll be using an iPhone"
    And If customer does not select this check box, then the selection is considered as Smartphone


  @smokeTest
  Scenario: Horizontal Tariff Structure - Inner modules
    Given that I am a Upgrade customer
    When I land on the Pay monthly sims page
    And I want to select a phone pay monhtly sim tariff
    Then I should see the below contents inside the horizontal tariff tile
      | Data, Minutes and Texts |
      | Price per month         |
    And 'Buy now' CTA links straight to the basket page.
    And 'Check box' A check box to be displayed with the below details "I'll be using an iPhone"
    And If customer does not select this check box, then the selection is considered as Smartphone
