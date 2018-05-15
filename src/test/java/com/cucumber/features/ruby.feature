
@tag
Feature: Kart functionality checking
	I want to use this template for my feature file

@tag1
Scenario: Add ruby to kart and verify
	Given I go to website
	And I click on ruby img
	And I click on Add to basket
	When I click on view basket
	Then Ruby shoud be added to kart
	
	
	Scenario: Remove item from kart
	Given I go to website
	And I click on ruby img
	And I click on Add to basket
	When I click on view basket
	And Click on remove button
	Then Item shoud be removed	


