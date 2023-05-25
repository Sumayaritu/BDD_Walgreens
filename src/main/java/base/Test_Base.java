package base;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import object.CreatAccountPage;
import object.HomePage;
import object.SignInPage;
import util.Configuration;
import util.Key;
import static util.I_Browser.*;
import static util.Key.*;
import java.time.Duration;


public class Test_Base {
	protected static WebDriver driver;
	protected static HomePage homepage;
	protected static SignInPage signInPage;
	protected static CreatAccountPage creatAccountPage;
	Configuration config = new Configuration();

	

	public void beforeEachTest(String browserName) {
		WebDriverManager.chromedriver().setup();
		// String browserName=config.getValue(getProp(browser));
		initiatDriver(browserName);
		initiatClasses();
		// driver.manage().window().fullscreen();
		int pageLoadTime = config.readValueNum(getProp(pageLoad));
		int implicitLoadTime = config.readValueNum(getProp(implicitLoad));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitLoadTime));
		String urlName = config.getValue(getProp(url));
		driver.get(urlName);
	}

	public void initiatDriver(String browser) {
		switch (browser) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}

	}

	public void initiatClasses() {
		homepage = new HomePage(driver);
		signInPage = new SignInPage(driver);
		creatAccountPage = new CreatAccountPage(driver);
	}

	
	public void closingBrowser() {
		driver.quit();
	}

	public String getProp(Key key) {
		return key.name();
	}

}
