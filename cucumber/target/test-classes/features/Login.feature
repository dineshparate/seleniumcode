Feature: Application Login

Scenario: Home Page default-login
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home Page is populated
And Cards displayed are "true"

Scenario: Home Page default-login
Given User is on NetBanking landing page
When User login into application with "data" and password "4321"
Then Home Page is populated
And Cards displayed are "false"



