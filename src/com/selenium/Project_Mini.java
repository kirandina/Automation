package com.selenium;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project_Mini {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kiran\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		WebElement mailAdress = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
		mailAdress.sendKeys("kiran83565@gmail.com");
		
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
		
		WebElement radio = driver.findElement(By.id("id_gender1"));
		radio.click();
		
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("kiran");
		
		WebElement last_Name = driver.findElement(By.id("customer_lastname"));
		last_Name.sendKeys("dina");
		
		//WebElement email = driver.findElement(By.id("email"));
		//email.sendKeys("kiran333333333333333@gmail.com");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("kiran123");
		
		WebElement day = driver.findElement(By.id("days"));
		Select s1 = new Select(day);
		s1.selectByIndex(3);
		
		WebElement month = driver.findElement(By.id("months"));
		Select s2 = new Select(month);
		s2.selectByValue("3");
		
		WebElement years = driver.findElement(By.id("years"));
		Select s3 = new Select(years);
		s3.selectByValue("1992");
		
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("greens");
		
		WebElement address1 = driver.findElement(By.id("address1"));
		address1.sendKeys("46 street "+","+ "PO BOX 838 "+","+ "greens"+".");
		
		WebElement address2 = driver.findElement(By.id("address2"));
		address2.sendKeys("Thiruvanmaiyur Rto");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Chennai");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select s4 = new Select(state);
		s4.selectByIndex(52);
		
		WebElement postcode = driver.findElement(By.id("postcode"));
		postcode.sendKeys("63200");
		
		//WebElement country = driver.findElement(By.id("uniform-id_country"));
		//Select s5 = new Select(country);
		//s5.selectByIndex(21);
		
		WebElement additional_information = driver.findElement(By.id("other"));
		additional_information.sendKeys("java+selenium");
		
		WebElement homephone = driver.findElement(By.id("phone"));
		homephone.sendKeys("9894551671");
		
		WebElement referenceAddress = driver.findElement(By.id("alias"));
		referenceAddress.sendKeys("LOSVEGAS");
		
		WebElement register = driver.findElement(By.id("submitAccount"));
		register.click();
		
		WebElement home = driver.findElement(By.xpath("//a[@class='home']"));
		home.click();
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(women).build().perform();
		
		WebElement t_shirt = driver.findElement(By.xpath("(//a[text()='T-shirts'][1])"));
		t_shirt.click();
		
		WebElement pic = driver.findElement(By.xpath("//div[@class='product-container']"));
		Actions ap = new Actions(driver);
		ap.moveToElement(pic).build().perform();
		
		WebElement color_blue = driver.findElement(By.id("color_2"));
		color_blue.click();
		
		WebElement quantity = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		Actions qt = new Actions(driver);
		qt.moveToElement(quantity).build().perform();
		
		WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		plus.click();
		
		WebElement addcart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		addcart.click();
		
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));  
		proceed.click();
		
		WebElement summary = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		summary.click();
		
		
		WebElement review = driver.findElement(By.name("message"));
		review.sendKeys("nice dress");
		
		WebElement addressverify = driver.findElement(By.name("processAddress"));
		addressverify.click();
		
		WebElement check = driver.findElement(By.id("uniform-cgv"));
		check.click();
		
		WebElement shipping = driver.findElement(By.name("processCarrier"));
		shipping.click();
		
		WebElement paymentpage = driver.findElement(By.xpath("//a[@class='bankwire']"));
		paymentpage.click();
		
		WebElement confirmpage = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirmpage.click();
		
		WebElement logout = driver.findElement(By.xpath("//a[@class='logout']"));
		logout.click();
		
		
		
		
		
	}
}