package BHighlevelBases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class B14_FlipkartGeneric {
	
	public WebDriver driver;
	public Actions action;
	
	public void generic(String str) {
		
		action = new Actions(driver);
	    WebElement element = driver.findElement(By.xpath(str));
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		
				
	
	
  @Test
  public void clickable() {
	 
	 for (int i = 1; i <= 7 ; i++) {
	generic("//*[@id=\"container\"]/div/div[2]/div/div/span["+i+"]");	 
		 
	
	 
		
	}
  }  
	  
	  
	  
  }
  @BeforeTest
  public void BeforeTest()  {
	  System.setProperty("webdriver.chrome.driver", "D:\\dsdb  workspace\\chromedriver.exe");
			driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=c4b035c8-64e6-4c7e-8db5-e3699ee94452");
		
		driver.manage().window().maximize();
		
	  
	  }

  @AfterTest
  public void AfterTest() {
  }

}
