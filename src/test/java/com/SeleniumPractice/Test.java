package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		driver.getCurrentUrl();
		Thread.sleep(1000);
		driver.findElement(By.id("login_field")).sendKeys("teju");
		//Thread.sleep(3000);
		//driver.sendKeys("success");
		driver.quit();

	}

}
