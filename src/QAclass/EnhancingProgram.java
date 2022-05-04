package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class EnhancingProgram {
	public WebDriver driver;
	
	
  @Test
  public void improvement() {
	driver.findElement(By.id("firstName")).sendKeys("Triveni");
		
		driver.findElement(By.id("lastName")).sendKeys("Gude");
		
		driver.findElement(By.id("userEmail")).sendKeys("triveni789@gmail.com");
		
		driver.findElement(By.id(""subjectsInput")).send 
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\dsdb  workspace\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
