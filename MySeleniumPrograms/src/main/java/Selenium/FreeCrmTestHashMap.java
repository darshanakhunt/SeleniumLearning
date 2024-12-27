package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FreeCrmTestHashMap {

	
	WebDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:/Darshana/chromedriver-win64/chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://ui.cogmento.com/?lang=en");	
		
		
	}

	@Test
	public void loginTest()
	{
		String CustCred = HashMapUse.getUserLogin().get("customer");
		String CustInfo[]=CustCred.split("_");
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(CustInfo[0]);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(CustInfo[1]);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}
	
	/*@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	*/

}
