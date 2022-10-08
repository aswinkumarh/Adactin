package com.Demo_Project;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Demo_Project\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File source =ts.getScreenshotAs(OutputType.FILE);
	  File destination = new File(":\\Users\\user\\eclipse-workspace\\Demo_Project\\screenshot\\aswin4.png");
	 
}

}
