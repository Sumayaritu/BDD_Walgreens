package stepsdefinition;

import base.Test_Base;
import io.cucumber.java.en.Given;
import report.Log;

public class CommonSteps extends Test_Base {

	@Given("say hello!")
	public void say_hello() {
		Log.log("Hello World!");
	}

	@Given("user select menu button")
	public void user_select_menu_button() {
		homepage.selectMenuBtn();
	}

}
