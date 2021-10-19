package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kiran\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//WebDriver email = new ChromeDrer();
		
		
		
		
		
	}

}
