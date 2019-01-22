$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\bdd\\menu.feature");
formatter.feature({
  "name": "menu",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Go PricePage",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a side menu and then go to PricePage",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuStepDefinitions.a_side_menu_and_then_go_to_PricePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i get Current Page URL and get Page Name",
  "keyword": "When "
});
formatter.match({
  "location": "MenuStepDefinitions.i_get_Current_Page_URL_and_get_Page_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Current Page URL and Page Name equals really URL and page name",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuStepDefinitions.current_Page_URL_and_Page_Name_equals_really_URL_and_page_name()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});