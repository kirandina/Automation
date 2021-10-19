package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Concepts {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kiran\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(3000);

		WebElement date = driver.findElement(By.id("day"));

		Select s = new Select(date);
		s.selectByIndex(15);

		WebElement month = driver.findElement(By.name("birthday_month"));

		Select s1 = new Select(month);
		s1.selectByValue("11");

		WebElement year = driver.findElement(By.id("year"));

		Select s2 = new Select(year);
		s2.selectByValue("1994");
	}
}
