$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Dell/eclipse-workspace/SmartSkills/CucumberProject/src/main/resources/FlipkartLogin.feature");
formatter.feature({
  "name": "To search product on flipkart",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "To search valid product on searchbox",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To config browser for flipkart",
  "keyword": "Given "
});
formatter.match({
  "location": "DataTableList.to_config_browser_for_flipkart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch flipkart url",
  "keyword": "When "
});
formatter.match({
  "location": "DataTableList.to_launch_flipkart_url()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.get(String)\" because \"this.driver\" is null\r\n\tat org.setpdefinition.DataTableList.to_launch_flipkart_url(DataTableList.java:32)\r\n\tat ✽.To launch flipkart url(C:/Users/Dell/eclipse-workspace/SmartSkills/CucumberProject/src/main/resources/FlipkartLogin.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To pass the values on search box",
  "rows": [
    {
      "cells": [
        "iphone",
        "laptop",
        "charger",
        "book"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataTableList.to_pass_the_values_on_search_box(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click the search buuton",
  "keyword": "And "
});
formatter.match({
  "location": "DataTableList.to_click_the_search_buuton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close the flipkart url",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTableList.to_close_the_flipkart_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});