#Sample Feature Definition Template having 8 test cases
Feature: ECOM10243,ECOM10253 

  @smokeTest
  Scenario: Flow of SIM Free with any accessory
    Given I am an eComm user
    When I add 'sim free' device in my basket along with any accessory
    Then I SHOULD be shown a 'Remove' CTA in front of the 'sim free device'
    And Remove the device from the basket, If I click on Remove

  @smokeTest
  Scenario: Flow of SIM Free with Pay Monthly sim
    Given I am an eComm user
    When I add 'sim free' device in my basket along with Pay Monthly sim
    Then I SHOULD be shown a 'Remove' CTA in front of the 'sim free device'
    And Remove the device from the basket, If I click on Remove

  @smokeTest
  Scenario: Flow of SIM Free with PAYG sim and an accessory
    Given I am an eComm user
    When I add 'sim free' device in my basket along with PAYG sim and an accessory
    Then I SHOULD be shown a 'Remove' CTA in front of the 'sim free device'
    And Remove the device as well as the PAYG Sim from the basket, If I click on 'Remove'

  @smokeTest
  Scenario: Flow of SIM Free with PayM with accessory
    Given I am an eComm user
    When I add 'sim free' device in my basket along with PayM and an accessory
    Then I SHOULD be shown a 'Remove' CTA in front of the 'sim free device'
    And Remove the device from the basket, If I click on Remove

  @smokeTest
  Scenario: Flow of SIM Free with SIM Free Device
    Given I am an eComm user
    When My basket contains 'Sim free' device only
    Then I SHOULD NOT be shown a 'Remove' CTA in front of the 'sim free device'

  @smokeTest
  Scenario: Flow of SIM Free with PAYG Sim
    Given I am an eComm user
    When My basket contains 'Sim free' device with PAYG Sim
    Then I SHOULD NOT be shown a 'Remove' CTA in front of the 'sim free device'

  @smokeTest
  Scenario: Flow to validate the Basket Page
    Given I am an eComm user
    When I add Sim free device along with the Airtime plan"PayG"
    And Land on basket page
    Then I SHOULD be able to see the Sim free Device and Airtime plan separately - please see the attached design
    
    @smokeTest
  Scenario: Flow to validate the Basket Page
    Given I am an eComm user
    When I add Sim free device along with the Airtime plan"PayM"
    And Land on basket page
    Then I SHOULD be able to see the Sim free Device and Airtime plan separately - please see the attached design
    
