package QAclass;

import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Enter;

import org.testng.annotations.BeforeTest;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class B11_Array {
	public WebDriver driver;
	
	
	
  @Test
  public void fun() throws Exception {
	  
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  Thread.sleep(3000);
	  
	    String str  = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul")).getText();
	  Thread.sleep(3000);
	  
	  System.out.println(str);
	  
	  System.out.println(str.length());
	  
	     String a[] = str.split("\n");
	  
	  System.out.println(a);
	  
	  System.out.println(a.length);
	  
	for (int i = 0; i < a.length; i++) {
		
		if (a[i].equalsIgnoreCase("selenium tutorial")) {
			driver.findElement(By.name("q")).clear();
			Thread.sleep(3000);
			driver.findElement(By.name("q")).sendKeys(a[i]);
			Thread.sleep(3000);
			System.out.println(a[i]);
			
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			break;
		}
		
		
	}
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\dsdb  workspace\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
