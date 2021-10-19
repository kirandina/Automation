package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kiran\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI5MTA4NzA5LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D;");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("9894551671");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("kiran");
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
		
		
	}
}