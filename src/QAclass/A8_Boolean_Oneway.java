package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A8_Boolean_Oneway {
	public WebDriver driver;
  @Test
  public void optionss() {
	  
	  //switching to Roundtrip
	  driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/div[2]/label")).click();
	  
	  //Print Condition True or False
	 boolean printcondition = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/div[2]/label")).isDisplayed();
	  
	  System.out.println(printcondition);
	  
	    WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/div[2]/label"));
	  
	if (ele1.isEnabled()) {
		
		System.out.println("Pass");
		
	} else {
		System.out.println("No Not available");

	}
	  
  }
  @BeforeTest
  public void BeforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\dsdb  workspace\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("https://www.savaari.com/");
	
	driver.manage().window().maximize();
	
	  
	  
	  
	  
  }

  @AfterTest
  public void AfterTest() {
  }

}
