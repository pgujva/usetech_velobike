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
  "error_message": "java.lang.AssertionError: неверный заголовок страницы expected [Сколько это стои] but found [Сколько это стоит]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat MenuStepDefinitions.current_Page_URL_and_Page_Name_equals_really_URL_and_page_name(MenuStepDefinitions.java:44)\r\n\tat ✽.Current Page URL and Page Name equals really URL and page name(src\\test\\resources\\bdd\\menu.feature:6)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});