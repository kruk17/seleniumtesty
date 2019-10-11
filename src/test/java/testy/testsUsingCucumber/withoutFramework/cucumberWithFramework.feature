Feature: Login


Scenario: Login to Herokuapp


Given I'am on a Login Page
When Enter the Username and Password and click Login Button:
    | tomsmith  | SuperSecretPassword!   |
Then I logged into Site



