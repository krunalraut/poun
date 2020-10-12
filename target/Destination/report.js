$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resourse/Features/Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "user should navigate to different categories",
  "description": "",
  "id": "user-should-navigate-to-different-categories",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14716967100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user shuold able to navigate to categories",
  "description": "",
  "id": "user-should-navigate-to-different-categories;user-shuold-able-to-navigate-to-categories",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@trial"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on women category",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click on top category",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should see",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_homepage()"
});
formatter.result({
  "duration": 1048449900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_women_category()"
});
formatter.result({
  "duration": 7526852700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_top_category()"
});
formatter.result({
  "duration": 4233589000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_see()"
});
formatter.result({
  "duration": 678879700,
  "status": "passed"
});
formatter.after({
  "duration": 1178792600,
  "status": "passed"
});
});