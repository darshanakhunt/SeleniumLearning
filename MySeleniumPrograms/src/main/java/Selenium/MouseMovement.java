package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:/Darshana/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'SpiceClub')and @class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8']"))).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Earn Points') and @class='css-76zvg2 r-ubezar']")).click();
		
		driver.quit();
	}

}
