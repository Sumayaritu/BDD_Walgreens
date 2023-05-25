package object;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import static common.CommonAction.*;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class=\"menu-trigger\"]")
	WebElement MenuBtn;
	
	@FindBy(xpath="//span[text()='Prescriptions']")
	WebElement prescriptionBtn;
	
	@FindBy(xpath="//a[@id=\"records\"]")
	WebElement recordsBtn;
	
	@FindBy(xpath = "//span[text()='Find a Store']")
	WebElement findAStore;

	@FindBy(xpath="//strong[text()='2920 CARTER HILL RD']")
	WebElement addressBtn;
	
	@FindBy(xpath = "//span[text()='Find Care']")
	WebElement findCare;
	
	@FindBy(xpath="//a[text()='Medicare']")
	WebElement medicareBtn;
	
	@FindBy(xpath="//span[text()='Get started']")
	WebElement getStarted;
	
	public void selectMenuBtn() {
		click(MenuBtn);
		click(prescriptionBtn);
		click(recordsBtn);
	}
	public void clickFind_A_Store() {
		click(MenuBtn);
		click(findAStore);
		click(addressBtn);
	}
	public void clickFind_Care_Btn() {
		click(MenuBtn);
		click(findCare);
		click(medicareBtn);
		click(getStarted);
	}
	
	
	
	
}
