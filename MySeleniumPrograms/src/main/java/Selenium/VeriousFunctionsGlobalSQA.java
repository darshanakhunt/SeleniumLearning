package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VeriousFunctionsGlobalSQA {

	WebDriver driver;

	@BeforeTest
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:/Darshana/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
	}
	
	/*@Test
	public void dropdown()
	{
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement element = driver.findElement(By.xpath("//select"));
		Select select = new Select(element);
		select.selectByVisibleText("India");
		
	}
	@Test
	public void MultiSelectDropdown()
	{
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement element = driver.findElement(By.id("ide"));
		Select select=new Select(element);
		select.selectByVisibleText("NetBeans");
		select.selectByVisibleText("IntelliJ IDEA");
		for(WebElement option : select.getAllSelectedOptions())
		{
			System.out.println(option.getText());
		}
	}
	@Test
	public void iframeTest()
	{
		driver.get("https://demo.automationtesting.in/");
		driver.findElement(By.id("enterimg")).click();
		
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Frames')]")).click();
		
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shloka");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
	
		//Nested frame
		
		WebElement parentframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(parentframe);
		
		WebElement childframe =driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(childframe);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Darshana");
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}
	*/
	
	@Test
	public void FrameTest()
	{
		driver.get("https://demo.automationtesting.in/");
		driver.findElement(By.id("enterimg")).click();
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click') and (@class='btn btn-info')]")).click();
		
		String CurrentWinHandles = driver.getWindowHandle();
		
		Set<String> AllWindHandles = driver.getWindowHandles();
		
		Iterator<String> iterator = AllWindHandles.iterator();
		
		while(iterator.hasNext())
		{
			String windowhandle = iterator.next();
			
			if(!windowhandle.equals(CurrentWinHandles))
			{
				driver.switchTo().window(windowhandle);
				break;
			}
		}
		
		System.out.println("title is :"+ driver.getTitle());
		
		
		
	}

	@AfterTest
	public void teardown() {
		//driver.quit();
	}

}
