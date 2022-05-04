package BHighlevelBases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class B18_DataDriven {
	public WebDriver driver;
	
	
  @Test
  public void f() {
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\dsdb  workspace\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Windows.html");
	
	driver.manage().window().maximize();
	Thread.sleep(3000); 
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
