package com.qa.phantomjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomHeadLessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("phantomjs.binary.path", "C:/Users/DarshanaDhameliya/Downloads/phantomjs-2.1.1-windows/phantomjs-2.1.1-windows/bin/phantomjs.exe");
	
		WebDriver driver=new PhantomJSDriver();
		driver.get("https://www.google.com");
		String title =driver.getTitle();
		
		System.out.println("title "+title);
	}

}
