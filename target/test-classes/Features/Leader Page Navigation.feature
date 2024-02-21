Feature: chosen League's  tab  Verification

Scenario: Verifying the chosen League's  Leaders page can be Navigated successfully

Given User is on Home Page
When User Click League menu
Then User is Navigated to Leagues Page
When User Clicks on the "<League>"
Then User is Navigating to the "<League>" page
When User Click on "<Leaguetab>"
Then User is Navigating to the "<Leaguetab>"
When User Click BackButton on "<Leaguetab>"
Then User is Navigated Back


Examples:
| League | Leaguetab |
| NFL | NFLLeader |