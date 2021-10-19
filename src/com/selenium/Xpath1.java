package com.selenium;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kiran\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/?lang=en");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign up with Google']"));
		signin.click();
		Thread.sleep(3000);
		
		
		
		WebElement login = driver.findElement(By.id("//input[@autocomplete='username']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(login).sendKeys("tiger").perform();
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
		//login.sendKeys("kiran");
		
		
		
	}

}
