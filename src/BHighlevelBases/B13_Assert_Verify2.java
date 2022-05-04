package BHighlevelBases;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class B13_Assert_Verify2 {
	public WebDriver driver;
	
	
  @Test
  public void fun() {
	 
	  String ActualTitle = "Material";
	  String ExcpectedTitle = driver.getTitle();
	  
//	  1st statement
	  System.out.println("Assertion starts here...");
	  
//	  2nd statement
	  System.out.println("A");
	  
//	  3rd statement
	  System.out.println("A blog for Software Testers");
	  
	 try {
//		  4th statement
	       Assert.assertEquals(ActualTitle, ExcpectedTitle);
		 
		 
	} catch (Throwable t) {
		
//		BBBBBBB statement
		System.out.println("B");
		
//		CCCCCC
		System.out.println("C");
		
		
	}
	  
	driver.quit();  
	  
			  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\dsdb  workspace\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get(" https://www.softwaretestingmaterial.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(3000); 
	  
	 
  }

  @AfterTest
  public void afterTest() {
  }

}
