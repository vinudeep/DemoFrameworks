#Sim_Free_Pacakge_Validation having 2 Test Cases
Feature: ECOM10388 

  @smokeTest
  Scenario: Pacakage validation 12month Tarrif
    Given I am an eComm user in o2
    When I choose 'like new' sim free device"Device_only_sim_free_Select"
    And select "30 days" tariff"30days" and "tariff_30"
    Then Package section Airtime Plan SHOULD also be updated accordingly to show the correct tariff associated data like contract length"30 days contract"

   @smokeTest
  Scenario: Pacakage validation 30days Tarrif
    Given I am an eComm user in o2
    When I choose 'like new' sim free device"Device_only_sim_free_Select"
    And select "12 months" tariff"12months" and "tariff_12"
    Then Package section Airtime Plan SHOULD also be updated accordingly to show the correct tariff associated data like contract length"12 month contract"
