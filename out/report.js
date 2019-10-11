$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumberWithFramework.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 401884,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login to Herokuapp",
  "description": "",
  "id": "login;login-to-herokuapp",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I\u0027am on a Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Enter the Username and Password and click Login Button:",
  "rows": [
    {
      "cells": [
        "tomsmith",
        "SuperSecretPassword!"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I logged into Site",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberSteps.i_am_on_a_Login_Page()"
});
formatter.result({
  "duration": 11226598808,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.enter_the_Username_and_Password_and_click_Login_Button(DataTable)"
});
formatter.result({
  "duration": 905168793,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.i_logged_into_Site()"
});
formatter.result({
  "duration": 2758672366,
  "status": "passed"
});
formatter.after({
  "duration": 129727,
  "status": "passed"
});
});