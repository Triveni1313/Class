package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A5_Screenshot {
	public WebDriver driver;
	
	
  @Test
  public void alertscreen() throws Exception {
	 
	  driver.findElement(By.id("alertButton")).click();
	  
	  Thread.sleep(3000);
	  
	  String str = driver.switchTo().alert().getText();
	  
	  System.out.println(str);
	 
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  
	  String ATM = "alertscreen1";
		 
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 org.openqa.selenium.io.FileHandler.copy(scrFile, new File("D:\\dsdb  workspace\\2021Triveni\\Triscreens\\"+ATM+".png"));
		  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception  {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\dsdb  workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
	   String ATM = "openurl2";
			 
			 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 
			 org.openqa.selenium.io.FileHandler.copy(scrFile, new File("D:\\dsdb  workspace\\2021Triveni\\Triscreens\\"+ATM+".png"));
			 
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
	 }

}
