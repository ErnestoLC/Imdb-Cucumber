$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('cucumberTests\songsBySinatra.feature');
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: jomarnavarro@gmail.com"
    }
  ],
  "line": 4,
  "name": "Sinatra Add Song",
  "description": "",
  "id": "sinatra-add-song",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Create a song",
  "description": "",
  "id": "sinatra-add-song;create-a-song",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I launch home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Home page is displayed correctly",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I log in to the application",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I show a list of songs",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I create a new song",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "The song is created",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.I_lanch_home_page()"
});
formatter.result({
  "duration": 10814373219,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.Home_page_is_displayed_correctly()"
});
formatter.result({
  "duration": 612829532,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.I_log_in_to_the_application()"
});
formatter.result({
  "duration": 2257401904,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.I_show_a_list_of_songs()"
});
formatter.result({
  "duration": 982087359,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.I_create_a_new_song()"
});
formatter.result({
  "duration": 4698322891,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.The_song_is_created()"
});
formatter.result({
  "duration": 463549126,
  "status": "passed"
});
});