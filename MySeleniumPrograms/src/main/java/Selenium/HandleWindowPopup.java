package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:/Darshana/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentwindowid = it.next();
		System.out.println("parent window id:"+parentwindowid);
		
		String childwindowid = it.next();
		System.out.println("Child window id:"+childwindowid);
		
		driver.switchTo().window(childwindowid);
		
		System.out.println("child win title:" + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentwindowid);
		
		System.out.println("parent win titlle:"+ driver.getTitle());
		
		
	}

}
