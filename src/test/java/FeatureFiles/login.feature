Feature: Adactin Hotel Bokking
@regression_run
Scenario: Login Functionality
Given User is Lanuch the Application
When User is enter the "prabu2611" in username field
And User is give timeout
And User is enter the "chenu@2611" in password field
Then User is enter the Submit Button
@regression_run
Scenario: Search Hotel Page Functionality
When User Get Fill Hotel Details in that application
And User is Select Hotel Location in dropdown field
And User is Select Hotel name in dropdown field
And User is Select Hotel Room type in dropdown field
And User is Select No of Rooms in dropdown field
And User is enter the check in date in checkin field
And User is enter the check out date in checkout field
And User is Select No of Adult in dropdown field
And User is Select No of Child in dropdown field
Then User is enter the Search Button
@regression_run
Scenario: Select Hotel Page Functionality
When User Confirmation the Select Hotel Details
And User Confirm the Details are corrected or not
And User is Select Button in radio button field
Then User is click the continue Button
@regression_run
Scenario: Booking Page Functionality
When User Enter the Communication and Credit Card details
And User is enter the firstname in text field
And User is enter the lastname in text field
And User is enter the Billing address in text field
And User is enter the 16 digits Credit card in text field
And User Select the Credit card Type in dropdown field
And User Select the Credit card expiry month in dropdown field
And User Select the Credit card expiry year in dropdown field
And User is enter the Credit card cvv number in text field
Then User is Click Book Now Button
@regression_run
Scenario: Booking Itinerary Functionality
When User Verify the Hotel Details ,Bill Amount and Billing address
And User is click My itinerary button
Then User to See the Booking order id and booking details
@regression_run
Scenario: Logout Functionality
When User is click checkall option
And User is click cancelall option
And user is click alert option ok Button
And user is click logout
And user is get screenshot
Then user is close the browser