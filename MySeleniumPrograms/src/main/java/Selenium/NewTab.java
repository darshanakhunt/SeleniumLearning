package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTab {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:/Darshana/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		clickOn(driver, driver.findElement(By.xpath("//button[@id='newTabBtn']")),20);
		List<String> handler = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(handler.get(1));
		System.out.println("Title of new tab is:"+ driver.getTitle());
		driver.close();
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
