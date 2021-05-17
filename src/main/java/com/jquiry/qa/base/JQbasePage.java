package com.jquiry.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JQbasePage {
	
	public WebDriver driver;
	
	public void launchPage(String btype, String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noman\\Desktop\\QA Class\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Noman\\Desktop\\QA Class\\Selenium\\geckodriver.exe");
		if(btype.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else {
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}

}
