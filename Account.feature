Feature: Application login

@RegTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User logs into the application with "Jin" and "1234"
Then Home page is displayed
And Cards displayed are "false"