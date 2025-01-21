package TestNGTEst;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ThreeWaits {

	
WebDriver driver;
@BeforeTest
public void initialization()
{
	System.setProperty("webdriver.chrome.driver","C:/Darshana/chromedriver-win64/chromedriver.exe");
	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
}

@Test(priority=1)
public void implicitwait()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

@Test(priority=2)
public void explicitwait()
{
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id=test]"))));
}
@Test(priority=3)
public void fluentwait()
{
	FluentWait<WebDriver> wait = new FluentWait<>(driver)
			.withTimeout(Duration.ofSeconds(20))
			.pollingEvery(Duration.ofSeconds(20))
			.ignoring(NoSuchElementException.class);
	
	WebElement element = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.id("test"));
			}
		});
	
	element.click();
}
@AfterTest
public void teardown()
{
	driver.quit();
}
}
