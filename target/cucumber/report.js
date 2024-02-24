$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LoginWithDataFromDb.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios Login functionality validation",
  "description": "",
  "id": "techfios-login-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DbFeature"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 5231242500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to login with correct credential",
  "description": "",
  "id": "techfios-login-functionality-validation;user-should-be-able-to-login-with-correct-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@DbScenario1"
    },
    {
      "line": 4,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters \"username\" from database",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"password\" from database",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the Submit button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 6427385400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_from_database(String)"
});
formatter.result({
  "duration": 4019866700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_from_database(String)"
});
formatter.result({
  "duration": 3156912500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_the_Submit_button()"
});
formatter.result({
  "duration": 11746064200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 185697800,
  "status": "passed"
});
formatter.after({
  "duration": 748950500,
  "status": "passed"
});
});