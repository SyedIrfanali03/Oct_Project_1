Feature: Create fb account 

Scenario: Create valid fb account

Given  To cofigure the browser for fb

When To launch fb url 

And  To enter the create new account button

And To pass the value on firstname
|	name1	|	jack|
|	name2	|	jam	|
|	name3	|	ram	|
|	name4	|	sam	|

And To pass the number on phone number field
|	number1 	|	number2		|
|	123456789 |	987654567	|
|	098765421 |	567897654	|
|	345678656 |	566889891	|

Then To quit the fb tab

