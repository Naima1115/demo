package rozana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Annotation {
	
		public WebDriver driver;
		String facebook = "https://www.facebook.com";
		String google = "https://www.google.com";
		
	  @BeforeSuite
	  public void setUp() throws Exception {
		  driver = new ChromeDriver();
		  Thread.sleep(3000);
		  System.out.println("the setup process is completed");
		  
	  }
	  
	  @BeforeTest
	  public void profileSetup() {
		  
		  driver.manage().window().maximize();
		  System.out.println("The profile setup is completed");
		  
	  }
	  
	  @AfterTest
	  public void reportReady() {
		  
		  System.out.println("report is ready to be shared, with screenshots of test");
		  
	  }
	  
	  @AfterSuite
	  public void cleanUp() {
		  
		  System.out.println("All closeup activities completed");
	  }
	  
	  
	 
}
