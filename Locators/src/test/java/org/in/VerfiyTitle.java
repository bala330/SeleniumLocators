package org.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerfiyTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        String title= driver.getTitle();
        System.out.println(title);
        if (title.equals("STORE")) {
        	System.out.println("Page landed correct websites");
		} else {
			System.out.println("Page not landed correct websites");

		}
        driver.close();

	}

}
