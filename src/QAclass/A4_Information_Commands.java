package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A4_Information_Commands {
	public WebDriver driver;
	
	
	
  @Test 
  public void gmail() throws Exception {
	String str1  = driver.findElement(By.linkText("Gmail")).getText();
	System.out.println(str1);
	Thread.sleep(3000);
	  
	  
	  
	  
  }
  @Test
  public void google_image() throws Exception {
	   String str2  = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).getAttribute("alt");
	   System.out.println(str2);
	   Thread.sleep(3000);
	  
	  
  }
  
  @Test
  public void searchbutton() throws Exception {
	 String str3 = driver.findElement(By.name("btnK")).getAttribute("value");
	 System.out.println(str3);
	 Thread.sleep(3000);
	  
  }
          
           
  @BeforeTest
  public void beforetest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\dsdb  workspace\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
