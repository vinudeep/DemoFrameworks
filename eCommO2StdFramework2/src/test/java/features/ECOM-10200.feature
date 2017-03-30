#Validating Paymonthly Sim free Page.having 3 Test Cases

Feature: ECOM10200

@Test1Ecomm10200
  Scenario: Phones tab validation CFA customer
    Given that I am a acquisition customer
    When I land on the Pay monthly sims page
    Then I should see 3 tabs - Phone/Tablet and Mobile broadband
    And the "Phone" tab should be open by default
    