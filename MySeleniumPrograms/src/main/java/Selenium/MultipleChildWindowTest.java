package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleChildWindowTest {

	public static void main(String[] args) {

      // WebDriverManager.chromedriver().setup();

		//System.setProperty("webdriver.gecko.driver","C:/Darshana/geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:/Darshana/New Chrome Driver/chromedriver-win64/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:/Darshana/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		/*driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();

		List<String> allwin = new ArrayList<>(driver.getWindowHandles());
		
		String mainwin = driver.getWindowHandle();
		
		for(String window : allwin)
		{
			if(!window.equals(mainwin))
			{
				driver.switchTo().window(window);
				String windowtitle = driver.getTitle();
				System.out.println("window title is :"+ windowtitle);
				driver.close();
			}
		}
		driver.switchTo().window(mainwin);
		System.out.println("title is :"+driver.getTitle());
		driver.close(); */
		
		driver.findElement(By.xpath("//button[@id='newTabsBtn']")).click();
		
		List<String> tabs = new ArrayList<>(driver.getWindowHandles());
		
		String firsttab = tabs.get(0);
		String secondtab = tabs.get(1);
		
		driver.switchTo().window(secondtab);
		System.out.println("second tab title:"+ driver.getTitle());
		driver.close();
		
		driver.switchTo().window(firsttab);
		System.out.println("first tab title:"+ driver.getTitle());
		driver.close();
		
		
		
		
		
	}

}
