Feature: Sim_Free_Acquisition_validation.

  Background: 

  @Test456
  Scenario: Sim_Free_Acquisition_Journey
    Given I am an eComm user12
    When I choose 'like new' sim free device"Device_only_sim_free_Select"
    And Both 12 months and 30 days tariffs are available
    And Land on the 'Tariffs and extra' page
    Then I SHOULD be able to see both 12 month and 30 days tab just above the tariffs tile on the right hand side, to select the associated Pay monthly tariffs with a text 'Contract length' at the right hand side
    And Remove copy 'Contract length is 12 months.
    And I close the browser
