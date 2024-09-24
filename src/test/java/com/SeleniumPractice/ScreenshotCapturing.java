package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapturing {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		// File
//		File sourceFile = driver.getScreenshotAs(OutputType.FILE);
//		File destFile = new File("./Screenshots/img1.jpg");
//		FileUtils.copyFile(sourceFile, destFile);
//		System.out.println("Screenshot saved successfully");
		
		//Bytes
//		byte[] byteArr = driver.getScreenshotAs(OutputType.BYTES);
//		File destFile = new File("./Screenshots/img1.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("Screenshot saved successfully");
		
		//Base64
//		String base64code = driver.getScreenshotAs(OutputType.BASE64);
//		byte[] byteArr = Base64.getDecoder().decode(base64code);
//		File destFile = new File("./Screenshots/img1.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("Screenshot saved successfully");
		
		////////////
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.google.com/");
		
		// File
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//		File destFile = new File("./Screenshots/img1.jpg");
//		FileUtils.copyFile(sourceFile, destFile);
//		System.out.println("Screenshot saved successfully");
		
		//Bytes
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//		byte[] byteArr = takesScreenshot.getScreenshotAs(OutputType.BYTES);
//		File destFile = new File("./Screenshots/img1.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("Screenshot saved successfully");
		
		//Base64
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//		String base64code = takesScreenshot.getScreenshotAs(OutputType.BASE64);
//		byte[] byteArr = Base64.getDecoder().decode(base64code);
//		File destFile = new File("./Screenshots/img1.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("Screenshot saved successfully");
		
		driver.quit();

	}

}
