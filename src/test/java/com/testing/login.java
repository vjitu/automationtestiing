package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		String ExpectedUrl= "https://www.saucedemo.com/";
		String Actualurl = driver.getCurrentUrl();
		  if(ExpectedUrl.equals(Actualurl)) {
			  System.out.println("Correct Url");
		  }
		  else {
			  System.out.println("Wrong Url");
		  }
		  
		String Expectedtitle = driver.getTitle();
		String ActualTitle="Swag Labs";
		if(ActualTitle.equals(Expectedtitle)) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Incorrect Title");
		}
		Thread.sleep(2000);
		
		driver.close();  
		
		
	}

}