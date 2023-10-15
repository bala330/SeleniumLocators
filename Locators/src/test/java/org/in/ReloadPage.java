package org.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReloadPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		String url=driver.getCurrentUrl();
		System.out.println("Write a current page url : " + url);
		driver.navigate().refresh();
		driver.close();

	}

}
