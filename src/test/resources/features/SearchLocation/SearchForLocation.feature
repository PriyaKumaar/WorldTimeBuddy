Feature: To verify  search for location feature
 
	Scenario: To search for time in particular place or timezone
		Given User is again on home page2
   	When user type the place in search field
   	Then verify proper timezone is displayed in the search field
  