package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:/Darshana/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Thread.sleep(4000);
		driver.findElement(By.name("proceed")).click();
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text=alert.getText();
		
	
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("correct text");
		}
		else
		{
			System.out.println("incorrect text");
		}
		alert.accept();
		//alert .dismiss();
		driver.quit();
	}
	

}
