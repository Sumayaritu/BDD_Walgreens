package stepsdefinition;

import base.Test_Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuSteps extends Test_Base{
	
	@When("user insert email<{string}>")
	public void user_insert_email(String string) {
		signInPage.insertEmail(string);
	}
	@Then("user clicks show password")
	public void user_clicks_show_password() {
		signInPage.clickShowPassword();
	}
	@Then("user clicks create a new account button")
	public void user_clicks_create_a_new_account_button() {
		signInPage.clickcreatAnewAccountBtn();
	}
	@Then("user is in Create-Account page")
	public void user_is_in_create_account_page() {
		creatAccountPage.validateTitle("Create your account");
	}
	@Then("user insert first name <{string}>")
	public void user_insert_first_name(String string) {
		creatAccountPage.insertInformation(string);
	}
	@Then("user insert last name <{string}>")
	public void user_insert_last_name(String string) {
		creatAccountPage.insertInformation(string);
	}


}
