Feature: Finding New Cars

@CD1
  Scenario: User finding a new car
   Given User accessing CanadaDrives "Url"
   And  Select Ontario Province
   When Filter RAM 1500 vehicles using Make/Model filter
	 And Sort by Price Low to High
	 When Favourite 3 RAM 1500 vehicles
	 And Pick an available RAM 1500 vehicle
	 Then Click on Get Started
	 And In Calculate delivery, Enter Toronto Address
	 And Select 48 Months warranty
	 
	 @CD2
	 Scenario: Prasad Sceanrio
		Given I am a person from Wales
		When I put my circumstances into the Checker tool
		Then I should get a result of whether I will get help or not
		And I close the application
	 

  #Scenario: User finding a new car
   #Given User accessing CanadaDrives "Url"
   #And  Select Ontario Province
   #When Filter RAM 1500 vehicles using Make/Model filter
#	 And Sort by Price Low to High
#	 When Favourite 3 RAM 1500 vehicles
#	 And Pick an available RAM 1500 vehicle
#	 Then Click on Get Started
#	 And In Calculate delivery, Enter Toronto Address
#	 And Select 48 Months warranty