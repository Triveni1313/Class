package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A6_Firstselectedoption {
    public WebDriver driver;
    
	
	@Test
  public void optionss() {
		
		WebElement ele = new Select(driver.findElement(By.id("day"))).getFirstSelectedOption();
	       System.out.println(ele.getText());
	  
	  if (ele.getText().contains("23")) {
		  
		  System.out.println("Its available");
		
	} 
	  else {
		System.out.println("Not available");

	}
	  
	  
  }
 
	
@BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\dsdb  workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/?app_id=1140740696088074&logger_id\n");
		driver.manage().window().maximize();
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
