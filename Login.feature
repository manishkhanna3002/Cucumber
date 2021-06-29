Feature: Application login

Background:
Given Validate the Browser
When Browser is trigerred
Then Check if Browser is started

@SanityTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User logs into the application with "John" and "1234"
Then Home page is displayed
And Cards displayed are "true"

@RegTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User sign in with the following details
|Jenny | abcd | john@abc.com | Australia|
Then Home page is displayed
And Cards displayed are "true"

@SmokeTest
Scenario Outline: Home page default login
Given User is on Netbanking landing page
When User logs in to the application with <Username> and <Password>
Then Home page is displayed
And Cards displayed are "true"

Examples:
|Username |Password |
|user1    |pass1    |
|user2    |pass2    |
			