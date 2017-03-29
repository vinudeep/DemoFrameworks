Feature: Ecom_10207 Tarrif Decending order validation. 

  @Regressioncdcdcdc
  Scenario: Validate the tarrif containing in the decending order
    Given that I am a merchandising manager
    When I am deciding the order of the pay-monthly sim tariffs
    Then on landing of the Pay monthly sims page, the default order of the tariffs from the tile below the promoted white tile should be from High to low data
