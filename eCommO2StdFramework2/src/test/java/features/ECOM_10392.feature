#Simo_Journey_order_placed  having 1 Test Case

Feature: ECOM10392

  @smokeTest
  Scenario: Simo journey order.
    Given I am an eComm user12
    When I choose 'like new' sim free device
    And Land on the 'Tariffs and extra' page
    And I Land on the basket page and click on "go to checkout" button
    And input all the fields on the Deleivery page and Click on the 'Continue button'
    And I land on the payment page and input all the details and click 'Continue on next step'
    And perform an End to End operation
