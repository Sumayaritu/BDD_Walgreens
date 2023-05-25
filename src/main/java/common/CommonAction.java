package common;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import report.Log;

public class CommonAction {
	public static String getInnerHTML(WebElement element) {
		String innerText=element.getAttribute("innerHTML");
		Log.log(element+"<<<<<innerText>>>>>:"+innerText);
		return innerText;
	}
	public static void click(WebElement element) {
		element.click();
		Log.log(element+"<<<<<<<Has been clicked>>>>>>>>");
	}
	
	public static void insert(WebElement element,String msg) {
		element.sendKeys(msg);
		Log.log(element+"<<<<<value inserted:"+msg);
	}
	
	public static void dropdown(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
		Log.log(element+"<<<<<selected:"+value);
	}
	public static String getText(WebElement element) {
		String innerText=element.getText();
		Log.log(element+"<<<<<innerText: "+innerText);
		return innerText;
	}

}
