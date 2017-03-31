#having 6 Test Cases
Feature: ECOM10205,ECOM10206,ECOM10203,ECOM10202 

  @Regression
  Scenario: CFA Validating  Most Recommended feature in PAYM simonly page
    Given that I am a CFA Pay Monthly SIMO Customer
    Then I should be able to see the "Recommended" tariff on the PAYM sims page
    And there should be a blue badge with Character limit 25 incuding space character
    And the "Recommended" tariff should be displayed to me on TOP of the tariff tiles in WHITE background
    And display the "Recommended" for 12 and 30 days as per the excel sheet

  @Regression
  Scenario: CFA Validating  Most Popular feature in PAYM simonly page
    Given that I am a CFA Pay Monthly SIMO Customer
    Then I should be able to see the "Most-popular" tariff on the PAYM sims page
    And there should be a blue badge with Character limit 25 incuding space character
    And the "Most-popular" tariff should be displayed to me on TOP of the tariff tiles in WHITE background
    And display the "Most-popular" for 12 and 30 days as per the excel sheet

  @Regression
  Scenario: CFA Validating  Most Popular feature in PAYM simonly page
    Given that I am a acquisition customer
    When I land on the Pay monthly sims page
    Then in the horizontal tariff tile I should be able to see the "Was" price & "Now" price

  # below is for upgrade customers
  @Regression1
  Scenario: CFU Validating  Most Recommended feature in PAYM simonly page
    Given that I am a CFU Pay Monthly SIMO Customer
    Then I should be able to see the "Recommended" tariff on the PAYM sims page
    And there should be a blue badge with Character limit 25 incuding space character
    And the "Recommended" tariff should be displayed to me on TOP of the tariff tiles in WHITE background
    And display the "Recommended" for 12 and 30 days as per the excel sheet

 @Regression1
   Scenario: CFU Validating  Most Popular feature in PAYM simonly page
    Given that I am a CFU Pay Monthly SIMO Customer
    Then I should be able to see the "Most-popular" tariff on the PAYM sims page
    And there should be a blue badge with Character limit 25 incuding space character
    And the "Most-popular" tariff should be displayed to me on TOP of the tariff tiles in WHITE background
    And display the "Most-popular" for 12 and 30 days as per the excel sheet

  @Regression1
  Scenario: CFU Validating  Most Popular feature in PAYM simonly page
    Given that I am a Upgrading customer
    When I land on the Pay monthly sims page
    Then in the horizontal tariff tile I should be able to see the "Was" price & "Now" price
