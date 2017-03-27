 Feature: Automation ecomm10205,ecomm10206, ecomm10203, ecomm10202

@MostRecommended-CFA
Scenario Outline: CFA Validating  Most Recommended feature in PAYM simonly page
Given that I am a CFA Pay Monthly SIMO Customer
Then I should be able to see the "Recommended" tariff on the PAYM sims page 
And there should be a blue badge with Character limit 25 incuding space character
And the "Recommended" tariff should be displayed to me on TOP of the tariff tiles in WHITE background
And display the "Recommended" for 12 and 30 days as per the excel sheet

@MostPopular-CFA
Scenario: CFA Validating  Most Popular feature in PAYM simonly page
Given that I am a CFA Pay Monthly SIMO Customer
Then I should be able to see the "Most-popular" tariff on the PAYM sims page 
And there should be a blue badge with Character limit 25 incuding space character
And the "Most-popular" tariff should be displayed to me on TOP of the tariff tiles in WHITE background
And display the "Most-popular" for 12 and 30 days as per the excel sheet

@StrikethroughandRoundalls-CFA
Scenario: CFA Validating  Most Popular feature in PAYM simonly page
Given that I am a CFA Pay Monthly SIMO Customer
Then I should be able to see the "Most-popular" tariff on the PAYM sims page 
And there should be a blue badge with Character limit 25 incuding space character
And the "Most-popular" tariff should be displayed to me on TOP of the tariff tiles in WHITE background
And display the "Most-popular" for 12 and 30 days as per the excel sheet


# below is for upgrade customers

@MostRecommended_CFU
Scenario: CFA Validating  Most Recommended feature in PAYM simonly page
Given that I am a CFA Pay Monthly SIMO Customer
Then I should be able to see the "recommended" tariff on the PAYM sims page 
And there should be a blue badge with Character limit 25 incuding space character
And the "recommended" tariff should be displayed to me on TOP of the tariff tiles in WHITE background
And display the "recommended" for 12 and 30 days as per the excel sheet

@MostPopular_CFU
Scenario: CFA Validating  Most Popular feature in PAYM simonly page
Given that I am a CFA Pay Monthly SIMO Customer
Then I should be able to see the "Most-popular" tariff on the PAYM sims page 
And there should be a blue badge with Character limit 25 incuding space character
And the "Most-popular" tariff should be displayed to me on TOP of the tariff tiles in WHITE background
And display the "Most-popular" for 12 and 30 days as per the excel sheet

@StrikethroughandRoundalls_CFU
Scenario: CFA Validating  Most Popular feature in PAYM simonly page
Given that I am a CFA Pay Monthly SIMO Customer
Then I should be able to see the "Most-popular" tariff on the PAYM sims page 
And there should be a blue badge with Character limit 25 incuding space character
And the "Most-popular" tariff should be displayed to me on TOP of the tariff tiles in WHITE background
And display the "Most-popular" for 12 and 30 days as per the excel sheet