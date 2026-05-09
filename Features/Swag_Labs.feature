Feature: E2E order submission 
@Test1
Scenario: Test1 Verify User should able to place backpack E2E order
Given User login to swag_labs application
When User added backpack to the cart
And User proceed with the Checkout page
And User checking verbiage on the checkout page
Then User submitted order successfully

@Test2
Scenario: Test2 User checking price on the checkout page
Given User login to swag_labs application
When User added backpack to the cart
And User proceed with the Checkout page
And User checking price on the checkout page
Then User submitted order successfully
