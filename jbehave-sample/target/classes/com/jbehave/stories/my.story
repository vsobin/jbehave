Narrative:
As a developer
I want to add and remove numbers from the list
So that I can use the basic list functionality

Scenario: A number can be added to the list

Given an empty list
When I add a number 666
Then size becomes 1 and the list contains 666
When I remove 1 number
Then the list is empty

Scenario: Selenium with FF

Given That i'm using Firefox
When I'm navigating to https://www.google.com.ua/
Then I'm closing the browser

Scenario: Selenium with Chrome

Given That i'm using Chrome
When I'm navigating to https://www.google.com.ua/
Then I'm closing the browser
