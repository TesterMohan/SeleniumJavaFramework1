	package com.mindtree.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {

		googleSearch();
	}
	public static void googleSearch() {
//function defined
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//initiated the chrome driver by using WebDriverManager
//Go to Google // way of opening any web page
		driver.get("https://google.com");
		/*
		 * Enter text in search textbox field if i am using name locator and entering
		 * "Head first Java " in search textbox
		 */
		driver.findElement(By.name("q")).sendKeys(" Head first Java ");
//click on search button
		//driver.findElement(By.name("btnK")).click(); 
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN); //for keyboard input
//close the browser
		driver.close();
//Print
		System.out.println("Test is completed successfully");

	}

}
