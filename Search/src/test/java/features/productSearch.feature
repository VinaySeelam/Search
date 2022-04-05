### Please use endpoint GET https://waarkoop-server.herokuapp.com/api/v1/search/test/{product} for getting the products.
### Available products: "apple", "mango", "tofu", "water"
### Prepare Positive and negative scenarios
Feature: Search for the product

@apple @all
Scenario: TC01_Seaching for apple product
Given Accessing product payload
When he calls "apple" product from resource
Then results should be displayed
 
@mango @all
Scenario: TC02_Seaching for mango product
Given Accessing product payload
When he calls "mango" product from resource
Then results should be displayed
  	
@car @all
Scenario: TC03_Seaching for car product
Given Accessing product payload
When he calls "car" product from resource
Then he don't see the results

@Users @all
Scenario: Find the total number of users
Given I am finding total number of users