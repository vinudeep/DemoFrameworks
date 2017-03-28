Feature: Sort Order For PAYM Sims Tariffs-eComm10199

 
    
@Test7
Scenario: This scenario ensures that the default order of the tariff tiles is high to low
Given I am an eComm user01 in o2
When I am deciding the order of the pay-monthly sim tariffs 
Then on landing of the Pay monthly sims page Pay monthly sims banner header as per today should be displayed 
And tabbed structure for phone/tablet and mbb should be displayed 
And Why choose an O2 Pay Monthly sim? link should be displayed 
And Horizontal tariff tiles (without any inner modules) should be displayed