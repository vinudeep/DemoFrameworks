#Sample Feature Definition Template ECOM-10243 & ECOM-10253 having 8 test cases
Feature: Validation of the Remove CTA feature

  @smokeTestqw
  Scenario: Flow of SIM Free with any accessory
    Given I am an eComm user
    When I add 'sim free' device in my basket along with any accessory
    Then I SHOULD be shown a 'Remove' CTA in front of the 'sim free device'
    And Remove the device from the basket, If I click on Remove

  @smokeTestqw
  Scenario: Flow of SIM Free with Pay Monthly sim
    Given I am an eComm user
    When I add 'sim free' device in my basket along with Pay Monthly sim
    Then I SHOULD be shown a 'Remove' CTA in front of the 'sim free device'
    And Remove the device from the basket, If I click on Remove

  @smokeTestqw
  Scenario: Flow of SIM Free with PAYG sim and an accessory
    Given I am an eComm user
    When I add 'sim free' device in my basket along with PAYG sim and an accessory
    Then I SHOULD be shown a 'Remove' CTA in front of the 'sim free device'
    And Remove the device as well as the PAYG Sim from the basket, If I click on 'Remove'

  @smokeTest2
  Scenario: Flow of SIM Free with PayM with accessory
    Given I am an eComm user
    When I add 'sim free' device in my basket along with PayM and an accessory
    Then I SHOULD be shown a 'Remove' CTA in front of the 'sim free device'
    And Remove the device from the basket, If I click on Remove

  @smokeTest2
  Scenario: Flow of SIM Free with SIM Free Device
    Given I am an eComm user
    When My basket contains 'Sim free' device only
    Then I SHOULD NOT be shown a 'Remove' CTA in front of the 'sim free device'

  @smokeTest2
  Scenario: Flow of SIM Free with PAYG Sim
    Given I am an eComm user
    When My basket contains 'Sim free' device with PAYG Sim
    Then I SHOULD NOT be shown a 'Remove' CTA in front of the 'sim free device'

  @smokeTest2
  Scenario: Flow to validate the Basket Page
    Given I am an eComm user
    When I add Sim free device along with the Airtime plan"PayG"
    And Land on basket page
    Then I SHOULD be able to see the Sim free Device and Airtime plan separately - please see the attached design
