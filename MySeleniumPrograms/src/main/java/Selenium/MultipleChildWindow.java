package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:/Darshana/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		clickOn(driver, driver.findElement(By.xpath("//button[@id='newWindowsBtn']")),20);
		
		//Set<String> handler= driver.getWindowHandles();
		//Iterator<String> it = handler.iterator();
		
		List<String> allwindows = new ArrayList<>(driver.getWindowHandles());
		
		String mainWindowHandle = driver.getWindowHandle();
		
		for(String window : allwindows)
		{
			if(!window.equals(mainWindowHandle))
			{
				driver.switchTo().window(window);
				String windowtitle = driver.getTitle();
				System.out.println("child window title:"+windowtitle);
				
				driver.close();	
			}
		}
		driver.switchTo().window(mainWindowHandle);
		System.out.println(driver.getTitle());
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
