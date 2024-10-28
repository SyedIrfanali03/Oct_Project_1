@Feature2
Feature: To search product on flipkart

@Regression
Scenario: To search valid product on searchbox

Given To config browser for flipkart

When To launch flipkart url

And To pass the values on search box
|	iphone	|	laptop	|	charger	|	book	|

And To click the search buuton

Then To close the flipkart url


