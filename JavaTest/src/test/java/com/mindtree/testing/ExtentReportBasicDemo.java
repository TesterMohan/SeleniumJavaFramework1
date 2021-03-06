package com.mindtree.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		 // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test 1", "This is a test to validate Google search functionality");
        
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        
		test1.log(Status.INFO, "Starting Test Cases");
		
        driver.get("https://google.com");
        test1.pass("Navigated to Google.com");
        
        driver.findElement(By.name("q")).sendKeys(" Automation Testing ");
        test1.pass("Entered text in searchbox");

        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        test1.pass("Pressed keyboard Enter key");
        
        driver.close();
        test1.pass("CLosed the browser");
        
        test1.info("Test is completed");
        
        
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test2 = extent.createTest("Google Search Test 2", "This is a test to validate Google search functionality");
        
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        
		test2.log(Status.INFO, "Starting Test Cases");
		
        driver.get("https://google.com");
        test2.pass("Navigated to Google.com");
        
        driver.findElement(By.name("q")).sendKeys(" Automation Testing ");
        test2.pass("Entered text in searchbox");

        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        test2.fail("Pressed keyboard Enter key");
        
        driver.close();
        test2.pass("CLosed the browser");
        
        test2.info("Test is completed");
        
        
        extent.flush();

	}

}
