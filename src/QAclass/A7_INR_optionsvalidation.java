package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A7_INR_optionsvalidation {
	public WebDriver driver;
	
  @Test
  public void optionss() {
	  
	  List<WebElement> allvalues = new Select(driver.findElement(By.id("day"))).getOptions();
	  
	  System.out.println(allvalues.get(30).getText());
	  
	  //print all values from A to Z(Starting to ending)
	  
	  for (int i = 0; i < allvalues.size() ; i++) {
		  
		System.out.println(allvalues.get(i).getText());
		
		//Checking comparison with equalIgnoreCase or Contains (Validation Prospective)
		
		if (allvalues.get(i).getText().contains("26")) {
			
			System.out.println(allvalues.get(i).getText());
			
			System.out.println("27 its available");
			
		}
		
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
