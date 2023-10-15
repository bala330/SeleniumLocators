package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchResults {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");
       WebElement search= driver.findElement(By.id("js-link-box-en"));
       search.click();
       
     WebElement search1= driver.findElement(By.name("search"));
    		 search1.sendKeys("Artifical Intelligence");
      
     WebElement button=driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/button"));
      button.click();
     
     WebElement history=driver.findElement(By.xpath("//*[@id=\"ca-history\"]/a/span"));
     history.click();
     
     String title=driver.getTitle();
     System.out.println(title);
     if (title.equals("Artificial intelligence: Revision history - Wikipedia")) {
    	 System.out.println("It will execute the title page");
		
	} else {
		System.out.println("It will not execute the title page");

	}
     driver.close();
	}

}
