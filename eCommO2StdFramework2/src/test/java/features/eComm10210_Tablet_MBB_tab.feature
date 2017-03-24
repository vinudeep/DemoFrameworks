 Feature: Tablet_MBB tab  - eComm10210 
 
   @Regression
   Scenario: Tablet Tab.
   Given I am an eComm test user02 in o2
    When I choose Sims and Pay Monthly sims
    And select Tablet
    And I am able to see the contract length as 12 months and 30 days
    And I click on 12 months contact length to see all tariffs that are relevant
    And I click on 30 dayscontact length to see all tariffs that are relevant
   
 # Rest step to define according to the flow
 