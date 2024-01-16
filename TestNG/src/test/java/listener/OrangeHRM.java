package listener;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(listener.Listener_Test.class)
public class OrangeHRM {
	
	String expectedTitle = "OrangeHRM";
	String expectedTitle1 = "Google";
	WebDriver driver;
	
  @Test(priority= 3)
  public void loginWithValidInformation() throws Exception {
	  
	  Thread.sleep(3000);
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
	  
  }
  
  @Test(priority= 1)
  public void loginWithInvalidInformation() throws Exception {
	  
	  Thread.sleep(3000);
	   driver.findElement(By.name("username")).sendKeys("amin");
	   Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("amin1");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      String expectedTitle = "orange";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  @Test(timeOut= 1000,priority= 2)
  public void timesOutValidInformation() throws Exception {
	  
	  Thread.sleep(3000);
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  @BeforeClass
  public void openOrangeHRM() throws Exception{
	  
	  driver.get("https://www.google.com");
	  Thread.sleep(5000);
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle1);
	  
	  WebElement el = driver.findElement(By.name("q"));
		 el.sendKeys("orangeHRM demo");
		Thread.sleep(2000);
				el.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(2000);
				el.sendKeys(Keys.ENTER);
				driver.findElement(By.xpath("//cite[@role='text']")).click();
			
  }
  
  @AfterClass
  public void closeGoogle() {
	  
	  driver.close();
	  System.out.println("testing is completed");
  }

  @BeforeTest
  public void systemSetUp() throws Exception {
	  
	  driver = new ChromeDriver();
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  System.out.println("System setup is completed");
  }
  

}
