package rozana;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class faceBook {
	public WebDriver driver;

	
	@BeforeSuite
	public void setUp()throws Exception {
		driver = new ChromeDriver();
		System.out.println("the setup process is completed");
		Thread.sleep(1000);
	}

	@BeforeTest
	public void profileSetUp() {
		
		System.out.println("profile setup is completed");
	}
	
	@BeforeClass
	public void urlSetUp() {
		
		driver.get("https://islahiart.com");
		System.out.println("url setup process is completed");

	}
	
	
	
  @Test
  public void f() {
  }
}
