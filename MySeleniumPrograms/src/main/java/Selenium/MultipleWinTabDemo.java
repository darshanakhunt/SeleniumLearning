package Selenium;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MultipleWinTabDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:/Darshana/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		//clickOn(driver,driver.findElement(By.xpath("//button[@id='newWindowBtn']")),20);
		
		List<String> handler = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(handler.get(1));
		System.out.println("Child win title is :"+driver.getTitle());
		driver.manage().window().maximize();
		sendkeysToElement(driver, driver.findElement(By.xpath("//input[@id='firstName']")), "Darshana",20);
		sendkeysToElement(driver, driver.findElement(By.xpath("//input[@id='lastName']")), "Dhameliya", 20);
		clickOn(driver,driver.findElement(By.xpath("//input[@id='femalerb']")),20);
		clickOn(driver,driver.findElement(By.xpath("//input[@id='englishchbx']")),20);
		
		driver.close();
		driver.switchTo().window(handler.get(0));
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Window Handles Practice - H Y R Tutorials", title);
	
		driver.quit();
		
	
		
	}
	
	public static void clickOn(WebDriver driver, WebElement locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	public static void sendkeysToElement(WebDriver driver, WebElement locator, String text, int timeout) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		WebElement element = wait.until(ExpectedConditions.visibilityOf(locator));
		element.sendKeys(text);
		
	}

}
