package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import util.I_Browser;

public class Hook {
	static Test_Base test_Base;

	@BeforeAll
	public static void beforeAllHook() {
		test_Base = new Test_Base();
	}

	@Before
	public static void beforeHook() {
		test_Base.beforeEachTest(I_Browser.CHROME);
	}

	@AfterAll
	public static void afterAllHook() {
		System.gc();
	}

	@After
	public static void afterHook(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] ss = ((TakesScreenshot) Test_Base.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(ss, "image/png", "error/png");
		}
		test_Base.closingBrowser();
	}

}
