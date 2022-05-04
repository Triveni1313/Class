package QAclass;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A1_Alerts {
	
	private static final String WebDriverManager = null;
	public WebDriver driver;
	
  
	@Test
  public void handlingalerts() throws Exception {
		driver.findElement(By.id("alertButton")).click();
		String str = driver.switchTo().alert().getText();
		
		System.out.println(str);
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		
  }
  
  
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\dsdb  workspace\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
  
  
  
  
  
  }
  
  

}
