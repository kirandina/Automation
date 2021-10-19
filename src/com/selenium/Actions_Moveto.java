package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Moveto {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kiran\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(course).build().perform();
		Thread.sleep(3000);
		
		WebElement selenium = driver.findElement(By.xpath("//a[text()='Selenium']"));
		ac.click(selenium).build().perform();
		
		
	}

}
