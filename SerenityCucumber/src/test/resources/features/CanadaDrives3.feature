Feature: Searching New Cars

@CD3
  Scenario: User Searching a new car
   Given User accessing CanadaDrives "Url"
   And  Select Ontario Province
   When Filter RAM 1500 vehicles using Make/Model filter
	 And Sort by Price Low to High
	 When Favourite 3 RAM 1500 vehicles
	 And Pick an available RAM 1500 vehicle
	 Then Click on Get Started
	 And In Calculate delivery, Enter Toronto Address
	 And Select 48 Months warranty
	 

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