package testnngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	WebDriver driver;
	@BeforeTest
	public void beforetest() {
		System.out.println("executing before test");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("Executing before the class");
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	public void setup1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);	
	}
	@Test
	public void login() throws InterruptedException {
		
	WebElement ele= driver.findElement(By.id("user-name"));
	ele.sendKeys("standard_user");
	
	WebElement ele1 = driver.findElement(By.id("password"));
	Thread.sleep(2000);
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	    }
	@AfterMethod
	public void teardown() {
		driver.close();
	}

	@AfterClass
	public void afterclass() {
		System.out.println("executing after the class");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("executing after the test");
	}
}
