Feature: Sim_Free_Acquisition_validation.

  @Regression
  Scenario: Sim_Free_Acquisition_Journey
    Given I am an eComm user12 in Acquisition
    When I choose 'like new' sim free device"Device_only_sim_free_Select"
    And Both 12 months and 30 days tariffs are available in mobile
    And Land on the 'Tariffs and extra' pages in flow1
    Then I SHOULD be able to see both 12 month and 30 days tab just above the tariffs tile on the right hand side, to select the associated Pay monthly tariffs with a text 'Contract length' at the right hand side
    And Remove copy 'Contract length is 12 months..

  @Regression
  Scenario: Sim_Free_Acquisition_PayM_Journey
    Given I am an eComm user12 in Acquisition
    When I choose 'like new' sim free device"PayM_sim_free_Select"
    And Both 12 months and 30 days tariffs are available in mobile
    And I select the 12 month tariff
    And Land on the 'Tariffs and extra' pagess in flow2
    And I see both 12 month and 30 days tab to select the associated Pay monthly tariffs
    And By default I see 12 months tariffs
    And If I click on 30 days tab
    Then I SHOULD be presented with all 30 days Pay monthly tariffs
    And Remove copy 'Contract length is 12 months..

  @Regression
  Scenario: Sim_Free_Journey_with_tab_Select
    Given I am an eComm user12 in Acquisition
    When I choose 'like new' sim free device"Device_only_sim_free_Select"
    And Both 12 months and 30 days tariffs are available in mobile
    And I click on 'select' button of Device only - sim free
    And Land on the 'Tariffs and extra' pagesss in flow3
    And I see both 12 month and 30 days tab to select the associated Pay monthly tariffs
    And By default I see 12 months tariffs
    And If I click on 30 days tab
    And I see all 30 days Pay monthly tariffs
    And If I click on 12 months tab
    Then I SHOULD be presented with all 12 months Pay monthly tariffsss
    And Remove copy 'Contract length is 12 months..

  @Regression
  Scenario: validation_of_the_label
    Given I am an eComm user12 in Acquisition
    When I choose 'like new' sim free device"Device_only_sim_free_Select"
    And Both 12 months and 30 days tariffs are available in mobile
    And Land on the 'Tariffs and extra' page in flow4
    And I see both 12 month and 30 days tab to select the associated Pay monthly tariffs
    And If I click on 30 days tab"30days"
    And I see all 30 days Pay monthly tariffs
    And If I click on 12 months tab"12months"
    Then I SHOULD be presented with all 12 months Pays monthly tariffs
    And Remove copy 'Contract length is 12 months..
