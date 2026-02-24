Feature: WordPress Mini Project

Scenario: Validate WordPress functionality

Given User launches WordPress website
Then Verify page title
When User performs mouse hover and clicks Get WordPress
Then Verify Get WordPress text
When User navigates to Photo Directory
And User searches image
Then Verify images displayed