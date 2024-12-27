package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Darshana/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.cogmento.com/?lang=en");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		
		clickOn(driver, driver.findElement(By.xpath("//input[@type='text']")),20);
		
		sendkeysToElement(driver, driver.findElement(By.xpath("//input[@type='text']")),"darshanakhunt@gmail.com",20);
		
		driver.quit();
	}
	public static void sendkeysToElement(WebDriver driver, WebElement locator, String text, int timeout) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		WebElement element = wait.until(ExpectedConditions.visibilityOf(locator));
		element.sendKeys(text);
		
	}
	public static void clickOn(WebDriver driver, WebElement locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

}
