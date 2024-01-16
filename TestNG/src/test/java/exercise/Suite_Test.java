package exercise;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Suite_Test {
	
	static WebDriver driver;
	String orange = "https://opensource-demo.orangehrmlive.com";
	String url ="https://www.google.com";
	
  @AfterTest
  public void beforeTest() {
	  
	  System.out.println("Report is ready to be shared");
  }

  @BeforeTest
  public void afterTest() {
	  driver.manage().window().maximize();
	  System.out.println("profile setup completed");
  }

  @BeforeSuite
  public void beforeSuite() throws Exception{
	  
	  driver = new ChromeDriver();
	  Thread.sleep(3000);
	  System.out.println("chrome setup completed");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("All closeup activities completed");
  }

}
