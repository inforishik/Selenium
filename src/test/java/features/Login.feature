Feature: Application Login

Scenario: Home page default login
Given User in on landing page
When User login into application with "jin" and "123"
Then Home page populated
And Cards are displayed are "true"


Scenario: Home page default login
Given User in on landing page
When User login into application with "john" and "432"
Then Home page populated
And Cards are not displayed are "false"