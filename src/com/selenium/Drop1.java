package com.selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class Drop1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kiran\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("kiran");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("kumar");
		
		WebElement mobnumber = driver.findElement(By.name("reg_email__"));
		mobnumber.sendKeys("9894551671");
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("9894551671");
		WebElement date = driver.findElement(By.id("day"));
		
		Select s = new Select(date);
		s.selectByIndex(30);
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1 =  new Select(month);
		s1.selectByValue("3");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s2 = new Select(year);
		s2.selectByVisibleText("2021");
		
		WebElement sex = driver.findElement(By.name("sex"));
		sex.click();
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.name("websubmit"));
		submit.click();
	}
}
