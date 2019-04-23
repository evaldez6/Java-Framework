$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/featurefiles/Gmail.feature");
formatter.feature({
  "name": "Gmail Automation Practice",
  "description": "\tPractice different scenarios while using Gmail",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Send an email and tag a created label",
  "description": "\tUser logs in to gmail\n\tUser sends an email with one image attachment\n\tUser verifies email body is the same that was sent\n\tUser creates a label and tags sent message\n\tUser nagigates to all existing lables",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to gmail website",
  "keyword": "Given "
});
formatter.match({
  "location": "GmailSteps.user_navigates_to_gmail_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User inputs username and password",
  "keyword": "And "
});
formatter.match({
  "location": "GmailSteps.user_inputs_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be taken to gmail successful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "GmailSteps.user_should_be_taken_to_gmail_successful_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User creates a new message",
  "keyword": "Given "
});
formatter.match({
  "location": "GmailSteps.user_creates_a_new_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see a new pop-up window",
  "keyword": "Then "
});
formatter.match({
  "location": "GmailSteps.user_should_see_a_new_pop_up_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fills in message",
  "keyword": "When "
});
formatter.match({
  "location": "GmailSteps.user_fills_in_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User adds image",
  "keyword": "And "
});
formatter.match({
  "location": "GmailSteps.user_adds_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks send",
  "keyword": "And "
});
formatter.match({
  "location": "GmailSteps.user_clicks_send()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The message should be sent",
  "keyword": "Then "
});
formatter.match({
  "location": "GmailSteps.the_message_should_be_sent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sent message",
  "keyword": "Given "
});
formatter.match({
  "location": "GmailSteps.user_sent_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User reads message",
  "keyword": "And "
});
formatter.match({
  "location": "GmailSteps.user_reads_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "body message is the same that was sent",
  "keyword": "Then "
});
formatter.match({
  "location": "GmailSteps.body_message_is_the_same_that_was_sent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User read message",
  "keyword": "Given "
});
formatter.match({
  "location": "GmailSteps.user_read_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User creates a label",
  "keyword": "When "
});
formatter.match({
  "location": "GmailSteps.user_creates_a_label()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User tags label to message",
  "keyword": "And "
});
formatter.match({
  "location": "GmailSteps.user_tags_label_to_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The message should be tagged by created label",
  "keyword": "Then "
});
formatter.match({
  "location": "GmailSteps.the_message_should_be_tagged_by_created_label()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User created a label",
  "keyword": "Given "
});
formatter.match({
  "location": "GmailSteps.user_created_a_label()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks all existing labels",
  "keyword": "Then "
});
formatter.match({
  "location": "GmailSteps.user_checks_all_existing_labels()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});