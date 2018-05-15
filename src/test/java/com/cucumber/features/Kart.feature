Feature: Validating price

@tag1
Scenario: Add ruby to kart and verify
	Given I go to website
	And I click on ruby img
	And I click on Add to basket
	When I click on view basket
	Then Ruby shoud be added to kart
	And enter number in quantity field and click update
	Then validate quantity mutliply with price should be the total price
