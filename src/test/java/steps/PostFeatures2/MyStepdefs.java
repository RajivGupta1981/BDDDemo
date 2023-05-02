package steps.PostFeatures2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
        @Given("^User should be logged in and should be present on his wall$")
        public void user_should_be_logged_in_and_should_be_present_on_his_wall() throws Throwable {
            System.out.println("user_should_be_logged_in_and_should_be_present_on_his_wall");
        }

        @When("^I type the message in the box$")
        public void i_type_the_message_in_the_box() throws Throwable {
            System.out.println("i_type_the_message_in_the_box");
        }

        @Then("^The message should get posted$")
        public void the_message_should_get_posted() throws Throwable {
            System.out.println("the_message_should_get_posted");
        }

        @And("^Click on post button$")
        public void click_on_post_button() throws Throwable {
            System.out.println("click_on_post_button");

        }

    }


