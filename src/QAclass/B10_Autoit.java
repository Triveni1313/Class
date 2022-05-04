package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class B10_Autoit {
	public WebDriver driver;
	
	
  @Test
  public void fun() throws Exception{
	  
	  WebElement ele = driver.findElement(By.id("myFile");
	  Thread.sleep(2000);
	  
	  ele.sendKeys("\\C:\\Users\\hp\\Desktop\\test code.txt\\");
	  Thread.sleep(2000);
	  
//      driver.findElement(By.id("myFile")).click();
//	  
//	  Thread.sleep(8000);
//	  
//	  Runtime.getRuntime().exec("\\C:\\Users\\hp\\Desktop\\Autoit3\\Tri.exe\\");
//	  
	  
	  
  }
  @BeforeTest
  public void BeforeTest()throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\dsdb  workspace\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	  
	  
	  
  }

  @AfterTest
  public void AfterTest() {
  }

}
