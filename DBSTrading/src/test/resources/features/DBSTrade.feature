Feature: DBS Trading App Functional Validations

Background: Login application 
    Given Login to dbs trade application

@Alert @Functional 
  Scenario: TC04_Validating Alert Tab
  	Given Click on "Set_Alert_Price" button from alerts section
  	And Enter "AlertPrice" in alert dailog
  	When Click on "Set_Alerts" button
  	Then Validate Alerts tab for new alert

@BuyStock @Functional 
  Scenario: TC05_Buy A stock
		Given Click on "Buy" Tab
		And Validate the defaule prise of DBS stock 
		When Select "OrderType" and "Quantity" values
		And Click on "Buy" button from lower section 
		Then Validate total number of stocks in profile page
  	
@SellStock @Functional 
  Scenario: TC06_Sell A stock
		Given Click on "Sell" Tab
		And Validate the availability of sell tab
		When Select "OrderType" and "Quantity" values
		And Click on "Sell" button from lower section 
		Then Validate total number of stocks in profile page 	
 
 @EndtoEnd @Regression @PROD @Sanity @Smoke 
  Scenario: TC07_ Dbs trading end to end sceanrio
		Given User should be able to view comments in social tab
		And Click on "Buy" Tab
		And Validate the defaule prise of DBS stock 
		When Select "OrderType" and "Quantity" from lower section for buy
		And Click on "Sell" button from lower section 
		Then Validate total number of stocks in profile page 	
		And Click on "Sell" Tab from lower section for sell
		And Select "OrderType" and "Quantity" values from lower section for sell
		And Click on "Sell" button from lower section for sell
		And Validate total number of stocks in profile page