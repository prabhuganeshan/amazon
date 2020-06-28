Feature: validate the amazon page

Scenario:
Given validate the amazon home page
When validate select the product search
And validate the add to cart 
And validate  remove the product in cart 

Scenario: validate the goods order
Given validate the amazon home page
When validate select the product search
And validate the place order
And validate to create the login
And validate address field and payment option
And validate the remove the product from the cart
Then quite the page


