package org.tarrif;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	// for Chrome driver
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Lavanya\\\\vignesh\\\\AddTarrif\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		
		}
	//for getting url and maximize
	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	//to pass the values
	public static void type(WebElement element,String name) {
		element.sendKeys(name);
		
	}
	//to click
	public static void Click(WebElement element) {
		element.click();
	}
	//to quit the browser
	public static void quitBrowser() {
		driver.close();
	}
	
	

}
