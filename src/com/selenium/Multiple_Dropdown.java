package com.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kiran\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement single = driver.findElement(By.id("select-demo"));
		Select s1 = new Select(single);
		boolean multiple = s1.isMultiple();
		System.out.println("multiple or not :" + multiple);

		WebElement multiple1 = driver.findElement(By.id("multi-select"));
		Select s = new Select(multiple1);
		boolean multiple3 = s.isMultiple();
		System.out.println("multiple or not :" + multiple3);

		System.out.println("=====All Options=====");

		java.util.List<WebElement> options = s.getOptions();
		for (WebElement all_options : options) {
			String text = all_options.getText();
			System.out.println(text);
		}
		System.out.println("===size===");

		int size = options.size();
		System.out.println("size of options" + size);

		for (int i = 0; i < size; i++) {
			if (i == 1 || i == 3 || i == 5) {
				s.selectByIndex(i);

			}

		}
		System.out.println("===All Selected===");

		java.util.List<WebElement> all_selected = s.getAllSelectedOptions();
		for (WebElement selected : all_selected) {
			String text = selected.getText();
			System.out.println(text);
		}

		System.out.println("====first selected options====");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

}
