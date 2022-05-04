package BHighlevelBases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class B17_Ajaxcontrol {
	public WebDriver driver;
	
	
  @Test
  public void clickable() throws Exception {
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  Thread.sleep(3000);
	  
	    String str  = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul")).getText();
	  Thread.sleep(3000);
	  
	  System.out.println(str);
	  
	  System.out.println(str.length());
	  
	     String a[] = str.split("\n");
	  
	
	  
	for (int i = 0; i < a.length; i++) {
		
		if (a[i].equalsIgnoreCase("selenium Testing")) {
			driver.findElement(By.name("q")).clear();
			Thread.sleep(3000);
			driver.findElement(By.name("q")).sendKeys(a[i]);
			Thread.sleep(3000);
			System.out.println(a[i]);
			
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			break;
			
		}
		
		
		else {
			System.out.println("Not available");
		}
		
		
	}
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\dsdb  workspace\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
