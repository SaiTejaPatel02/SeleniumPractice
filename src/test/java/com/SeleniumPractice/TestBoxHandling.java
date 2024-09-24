package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBoxHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		WebElement textbox = driver.findElement(By.id("login_field"));//.sendKeys("SaiTeja");
		if(textbox.isDisplayed()){
			if(textbox.isEnabled()) {
				textbox.sendKeys("SaiTeja");
				String Text=textbox.getAttribute("value");
				System.out.println(Text);
			}else {
				System.out.println("textbox is not enabled");
			}
			
		}else {
			System.out.println("textbox is not displayed");
		}
		driver.quit();
		//driver.findElement(By.id("password")).sendKeys("SaiTeja");
	}

}
