package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.AfterTest;

public class A3_Popupwindow {
	
	public WebDriver driver;
	
	
	
  @Test
  public void windowpopup() {
	  driver.findElement(By.xpath(""))
  }
  
  
  
  
  
  @BeforeTest
  public void openurl() throws Exception {
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
