package googletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	
	WebDriver driver = new ChromeDriver();
	 
	driver.get("https://www.google.com/");
	
	Actions act=new Actions(driver);
	
	WebElement ele= driver.findElement(By.id("APjFqb"));
	
	driver.close();
	
	

	}

}
