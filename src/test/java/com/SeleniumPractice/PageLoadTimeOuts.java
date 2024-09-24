package com.SeleniumPractice;

import java.time.Duration;
import java.time.Instant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageLoadTimeOuts {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
		
		driver.get("https://www.hyrtutorials.com/");
		
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());
		
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("PageLoad time: "+duration.toMillis() + " milli seconds");
		
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
