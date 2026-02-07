package com.example.selenium_demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterRegexTest {
	@Test
	public void registrationTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/selenium-demo/registerRegex.html");
		driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("9898979698");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.id("submit")).click();
		String msg = driver.getPageSource();
		Assertions.assertTrue(msg.contains("Registration Successful"));
		driver.quit();



	}
}
