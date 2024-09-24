package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//		WebElement course = driver.findElement(By.id("course"));
//		Select coursedd = new Select(course);
//		coursedd.selectByIndex(0);
//		Thread.sleep(1000);
//		coursedd.selectByValue("net");
//		Thread.sleep(2000);
//		coursedd.selectByVisibleText("Javascript");
//		String selectoption = coursedd.getFirstSelectedOption().getText();
//		System.out.println("selected text"+ selectoption);
//		Thread.sleep(1000);
//        driver.quit();
		
//       Multi select Dropdown		
		
		WebElement ide = driver.findElement(By.id("ide"));
		Select ideDD = new Select(ide);
		
		List<WebElement> dd = ideDD.getOptions();
		for (WebElement ddoption : dd) {
			System.out.println(ddoption.getText());
		}
		ideDD.selectByIndex(0);
		Thread.sleep(1000);
		ideDD.selectByValue("ij");Thread.sleep(1000);
		ideDD.selectByVisibleText("NetBeans");Thread.sleep(1000);
		List<WebElement> selected = ideDD.getAllSelectedOptions();
		for (WebElement selectedOption : selected) {
			System.out.println("Selected options are " +selectedOption.getText());
			
			Thread.sleep(1000);//driver.quit();
		}
		driver.quit();		
	}

}
