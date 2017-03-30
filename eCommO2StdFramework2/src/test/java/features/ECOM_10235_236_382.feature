#having 1 Test case
 Feature: ECOM10235,ECOM10236,ECOM10382 

@smokeTestECOM10235ECOM10236ECOM10382
Scenario: CFA Validating  Most Recommended feature in PAYM simonly page
Given that I am a CFA Pay Monthly SIMO Customer
Then I should be able to see the "recommended" tariff on the PAYM sims page 
And there should be a blue badge with Character limit 25 incuding space character
And the "recommended" tariff should be displayed to me on TOP of the tariff tiles in WHITE background
And display the "recommended" for 12 and 30 days as per the excel sheet