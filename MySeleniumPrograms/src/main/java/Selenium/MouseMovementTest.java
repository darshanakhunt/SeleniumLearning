package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseMovementTest {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:/Darshana/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://freecrm.com/en");	
		//Thread.sleep(4000);
		//driver.findElement((By.xpath("//a[@href='https://ui.cogmento.com/?lang=en']"))).click();
		
		
		clickOn(driver, driver.findElement(By.xpath("//a[@href='https://ui.cogmento.com/?lang=en']")),20);
		
		
       // List<String> windowHandle = new ArrayList<>(driver.getWindowHandles());
//driver.switchTo().window(windowHandles.get(1));  // Switch to second tab

        Set<String> windowHandles = driver.getWindowHandles();  
        
        Iterator<String> iterator = windowHandles.iterator();

        String firsttab = iterator.next();
        String secondtab = iterator.next();
        
        driver.switchTo().window(secondtab);
        System.out.println("title of page:"+ driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("darshanakhunt@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("freecrm@123");
		clickOn(driver,driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")),20);
		
		
		Actions action= new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[@href='/contacts']//following-sibling::button[@class='ui mini basic icon button']//child :: i")).click();
		

		action.moveToElement(driver.findElement(By.tagName("body"))).build().perform();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Mehra");
		
		clickOn(driver,driver.findElement(By.xpath("//div[@name='channel_type']")),20);
		
		clickOn(driver,driver.findElement(By.xpath("//div[@role='option']//child :: span[contains(text(),'LinkedIn')]")),20);		
		
		driver.findElement(By.xpath("//div[@class='ui toggle checkbox']//child :: label[contains(text(),'Do not Call')]")).click();
		
		driver.findElement(By.xpath("//input[@name='image']")).sendKeys("C:\\Users\\DarshanaDhameliya\\OneDrive - Xebia\\Darshana\\Sample image pdf\\JPG.jpg");
		
		clickOn(driver,driver.findElement(By.xpath("//button[@class='ui linkedin button']")),20);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@href='/contacts']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
		action.moveToElement(driver.findElement(By.tagName("body"))).build().perform();
		Thread.sleep(3000);
		driver.findElement((By.xpath("//a[contains(text(),'darshana dhameliya')]/parent::td/preceding-sibling::td//div[@class='ui fitted read-only checkbox']"))).click();
		driver.quit();

	}
	public static void clickOn(WebDriver driver, WebElement locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

}
