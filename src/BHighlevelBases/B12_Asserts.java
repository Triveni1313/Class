package BHighlevelBases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class B12_Asserts {
	public WebDriver driver;
	
	
  @Test
  public void fun() {
	  String Actualtitle = " Mercury Tours"; 
	  String Expectedtitle = driver.getTitle();
	  
	  //1st statement
	  System.out.println("Assertion starts here...");
	  
	  //2nd statement
	  Assert.assertEquals(Actualtitle, Expectedtitle);
	  
	  //3rd statement
	  System.out.println("A blog for software Testers");
	  driver.quit();
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\dsdb  workspace\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
