@Feature
Feature: Login in facebbok functionality

@Smoke @Regression
Scenario Outline: Login positive data and negative data 

Given config the valid browser

When Launch the valid url

And To pass the valid and invalid "<emaildatas>" on email

And To pass the valid and invalid "<passworddatas>" on password

And To enter the login button

Then clos the particular tab




Examples:

	|	emaildatas					|	passworddatas	|
	|	gmail@gmail.com			|	123333				|
	|	whatsapp@gmail.com	|	672476563			|
	|	instagram@gmail.com	|	7868784				|
