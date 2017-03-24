Feature: Validating Paymonthly Sim free Page.
@12
  Scenario: Phones tab validation
    Given that I am a acquisition/upgrade customer
    When I land on the Pay monthly sims page
    Then I should see 3 tabs - Phone/Tablet and Mobile broadband
    And the "Phone" tab should be open by default
@34
  Scenario: Arrows in the tab
    Given that I am a acquisition/upgrade customer
    When I land on the Pay monthly sims page
    When I click on the Phone tab
    Then the downward arrow of the tab should be changed to the upward arrow as per given design.
@56
  Scenario: Contract length tabs
    Given that I am a acquisition/upgrade customer
    When I land on the Pay monthly sims page
    Then below the phone tab the contract length tabs of 12 months and 30 days should be displayed to me
