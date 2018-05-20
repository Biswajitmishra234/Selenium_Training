package com.uitility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtility {

	public WebDriver getdriver(String browser) {
		if(browser.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b7a.03.26\\Desktop\\Selenium\\chromedriver.exe");
			  driver=new ChromeDriver();
			  
			
		}
		if(browser.equals("mozila")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\training_b7a.03.26\\Desktop\\Selenium\\geckodriver.exe");
			  driver=new FirefoxDriver();
		}
	}
}
