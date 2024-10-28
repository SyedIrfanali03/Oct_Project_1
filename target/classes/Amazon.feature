Feature: To search the products on amazon

Scenario: To pass the valid product name on searchbox

Given To configure the browser for amazon 

When To launch the amazon url

And To pass the value on amazon search box 
|	laptop	|	phone	|	headphone	|
|	mouse		|	keypad|	helmate		|
|	toys		|	cable	|	connector	|

And To tap the search button

Then To close the amazon browser

