package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kiran\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement fb = driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
		WebElement fb_it = driver.findElement(By.xpath("//span[@class='KPnG0']"));
		fb.click();
		
		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys("kiran");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("9894551671");
		
	}
}
