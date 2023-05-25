package object;

import static common.CommonAction.*;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreatAccountPage {
	public CreatAccountPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//h1[text()='Create your account']")
	WebElement title;
	
	@FindBy(id="wag-RXUser-firstname")
	WebElement firstName;
	
	@FindBy(name="lastName")
	WebElement lastName;
	
	@FindBy(id="wag-RXUser-DOB")
	WebElement dateOfBirth;
	
	@FindBy(id="wag-phonetype-select")
	WebElement cell;
	
	@FindBy(id="wag-email")
	WebElement email;
	
	@FindBy(name="registerPassword")
	WebElement password;
	
	@FindBy(id="wag-showpassword-checkbox")
	WebElement showPassword;
	
	@FindBy(id="wag-terms-checkbox")
	WebElement readAndAgreeBtn;
	
	@FindBy(xpath="//a[@id='wag-rxuser-continue-btm']")
	WebElement continueBtn;
	
	public void validateTitle(String expected) {
		Assert.assertEquals(getText(title), expected);
	}
	public void insertInformation(String msg) {
		insert(firstName,msg);
		insert(lastName, msg);
		insert(dateOfBirth, msg);
		insert(email, msg);
		insert(password, msg);
		
	}
	public void selectCellNumber(String msg) {
		dropdown(cell,msg);
	}
	public void clickShowPassword() {
		click(showPassword);
		click(readAndAgreeBtn);
	}
	public void clickContinueBtn(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click",continueBtn);
	}

}
