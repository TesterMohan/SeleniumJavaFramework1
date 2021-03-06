package com.mindtree.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {

	static WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public static void googleSearch() {
//function defined

//initiated the chrome driver by using WebDriverManager

//Go to Google // way of opening any web page
		driver.get("https://google.com");

		/*
		 * Enter text in search textbox field if i am using name locator and entering
		 * "Head first Java " in search textbox
		 */

		driver.findElement(By.name("q")).sendKeys(" Head first Java ");

//click on search button
		// driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN); // for keyboard input

	}

	@AfterTest
	public void tearDownTest() {

		// close the browser
		driver.close();

		// Print
		System.out.println("Test is completed successfully");

	}

}
