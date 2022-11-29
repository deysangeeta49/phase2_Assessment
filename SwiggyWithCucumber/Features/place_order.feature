Feature: a user should be able to place an order from Swiggy

Scenario: Place order From Swiggy
Given a user is on the home of Swiggy
And he is able to enter your delivery location as "Bangalore" and hit enter
And he is able to click on first search result under restaurants
And he is able to click on Add button under Top Picks of that restaurant
And he is able to click on Checkout button under Cart
Then he must be able to "To place your order now, log in to your existing account or sign up."
