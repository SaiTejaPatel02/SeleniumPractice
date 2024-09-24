package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButtonsCheckBoxes {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.findElement(By.id("firstName")).sendKeys("entering test");
		Thread.sleep(2000);
        driver.findElement(By.id("femalerb")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("englishchbx")).click();
        Thread.sleep(2000);
        WebElement hindichkbox = driver.findElement(By.id("hindichbx"));
        hindichkbox.click();
        Thread.sleep(2000);
        //to uncheck the checkbox
        if(hindichkbox.isSelected()) {
        	hindichkbox.click();
        }
        Thread.sleep(2000);
        driver.findElement(By.id("registerbtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("msg")).getText());
        driver.findElement(By.linkText("Click here to navigate to the home page")).click();
        Thread.sleep(1000);
        driver.quit();
	}

}
