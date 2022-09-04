Meta:
@author Gaurav
Scenario: when a user increases a counter, its value is decreases by 1

Given a counter
And the counter has any integral value
When the user decreases the counter
Then the value of the counter must be 1 lower than previous value