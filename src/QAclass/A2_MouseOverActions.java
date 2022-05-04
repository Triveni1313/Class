package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class A2_MouseOverActions {
	public WebDriver driver;
	public Actions action;
	
	
	
  @Test
  public void MouseOver() throws Exception {
	  
	  action = new Actions(driver);
	  
	 WebElement ele = driver.findElement(By.linkText("SwitchTo"));
	 action.moveToElement(ele).build().perform();
	 
	 Thread.sleep(3000);
	 
	 driver.findElement(By.linkText("SwitchTo")).click();
	 Thread.sleep(3000);
  
  
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
