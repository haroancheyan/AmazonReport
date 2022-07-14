$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/wildcraft.feature");
formatter.feature({
  "name": "Wildcraft product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "wildcraft product",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch amazon appilication",
  "keyword": "Given "
});
formatter.match({
  "location": "WildcraftSteps.user_launch_amazon_appilication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search wildcraft product and select",
  "keyword": "When "
});
formatter.match({
  "location": "WildcraftSteps.user_search_wildcraft_product_and_select()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add the product to cart",
  "keyword": "And "
});
formatter.match({
  "location": "WildcraftSteps.add_the_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate and take screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "WildcraftSteps.validate_and_take_screenshot()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});