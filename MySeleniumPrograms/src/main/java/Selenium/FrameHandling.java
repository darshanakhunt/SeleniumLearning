package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Darshana/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
	//	driver.get("https://freecrm.com/en");
		driver.get("https://ui.cogmento.com/?lang=en");
		//driver.findElement(By.xpath("//a[contains(@class, 'MuiButtonBase-root') and text()='Login']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("darshanakhunt@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("freecrm@123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		
		Thread.sleep(3000);
	
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='users icon']")));
		button.click();
		
		driver.quit();
		}

}
