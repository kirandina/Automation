package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Context {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kiran\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions ac = new Actions(driver);
		ac.contextClick(mobile).build().perform();
		Thread.sleep(3000);
		
		Robot rc = new Robot();
		rc.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_ENTER);
		
		WebElement amazon_pay = driver.findElement(By.xpath("//a[text()='Amazon Pay']"));
		Actions ac1 = new Actions(driver);
		ac1.contextClick(amazon_pay).build().perform();
		Thread.sleep(3000);
		
		Robot rc1 = new Robot();
		rc1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rc1.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
	}

}
