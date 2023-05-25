package object;

import static common.CommonAction.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id=\"user_name\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement passWord;
	
	@FindBy(xpath="//input[@id=\"ShowCharacter\"]")
	WebElement showPassword;
	
	@FindBy(xpath="//button[@id=\"create_btn\"]")
	WebElement creatAnewAccount;
	
	
	
	public void insertEmail(String msg) {
		insert(email,msg);
	}

	public void insertPassWord(String msg) {
		insert(passWord, msg);
	}
	public void clickShowPassword() {
		click(showPassword);
	}
	public void clickcreatAnewAccountBtn() {
		click(creatAnewAccount);
	}
	

}
