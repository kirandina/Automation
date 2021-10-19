package com.selenium;

import java.lang.StackWalker.Option;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;
	
	public static WebDriver getBroswer(String broswer) {
		
		try {
			if (broswer.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+("\\drivers\\chromedriver.exe"));
				 driver = new ChromeDriver();
			}else if (broswer.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir")+("\\drivers\\msedgedriver.exe\""));
				driver = new EdgeDriver();
			}
			else {
				System.out.println("invalid broswer");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void url(String value) {
		driver.get(value);
	}
	public static void inputOfElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void clearOnElement(WebElement element) {
		element.clear();
	}
	
	public static void dropDownElement(WebElement element, String Options, String value ) {
		Select s = new Select(element);
		try {
			{
				if (Options.equalsIgnoreCase("byIndex")) {
					int parseInt = Integer.parseInt(value);
					s.selectByIndex(parseInt);
				}
				else if (Options.equalsIgnoreCase("byvalue")) {
					s.selectByValue(value);
				}
				else if (Options.equalsIgnoreCase("byVisibleText")) {
					s.selectByVisibleText(value);
				}
				else {
					System.out.println("Invalid Selections");
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
