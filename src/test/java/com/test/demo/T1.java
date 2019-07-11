package com.test.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class T1 {
	
	@Test
	public void big() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avyaan\\eclipse-workspace\\MorningCourse\\Driver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//ul[@class='header-links-account']//a[@class='ico-register'][contains(text(),'Register')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtFirstName']")));
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtFirstName']")).sendKeys("Abhishek");
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtLastName']")).sendKeys("Gupta");
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Email']")).sendKeys("abhishekgupta183@gmail.com");
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_UserName']")).sendKeys("Abhi998877");
		driver.findElement(By.xpath("//select[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ddlCountry']")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ddlCountry']")).sendKeys("India");
		
		Select obj=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ddlRole']")));
		obj.selectByVisibleText("Technical / developer");
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Password']")).sendKeys("Raju@12345");
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ConfirmPassword']")).sendKeys("Raju@12345");
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm___CustomNav0_StepNextButton']")).click();
		
		
		driver.findElement(By.xpath("//ul[@class='header-links-account']//a[@class='ico-login'][contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_UserName']")).sendKeys("Abhi998877");
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_Password']")).sendKeys("Raju@12345");
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_LoginButton']")).click();

	}
	
	
}
