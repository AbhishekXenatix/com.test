package com.test.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T1 {
	
	@Test
	public void big() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avyaan\\eclipse-workspace\\MorningCourse\\Driver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/");
		driver.findElement(By.xpath("//ul[@class='header-links-account']//a[@class='ico-register'][contains(text(),'Register')]")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtFirstName']")).sendKeys("Abhishek");
		
	}

}
