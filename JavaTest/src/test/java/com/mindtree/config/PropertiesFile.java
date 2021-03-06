package com.mindtree.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties() {

		try {
			Properties prop = new Properties();
			InputStream input = new FileInputStream("C:\\Users\\m1063195\\Desktop\\Practice Selenium\\JavaTest\\src\\test\\java\\com\\mindtree\\config\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			e.printStackTrace();
		}
	}

	public static void setProperties() {

		try {
			Properties prop = new Properties();
			OutputStream output = new FileOutputStream("C:\\Users\\m1063195\\Desktop\\Practice Selenium\\JavaTest\\src\\test\\java\\com\\mindtree\\config\\config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			e.printStackTrace();
		}
	}
}
