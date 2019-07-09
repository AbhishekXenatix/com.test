package com.test.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T1 {
	
	@Test
	public void big() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avyaan\\eclipse-workspace\\MorningCourse\\Driver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/");
	}

}
