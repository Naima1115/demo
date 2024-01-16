package rozana;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

//import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;

public class AnnoFacebook extends Annotation {
	
  @Test
  public void validInfo () {
	  
	 driver.findElement(By.id("email")).sendKeys("naima.nila115@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("01755304351");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 String expectedTitle = "Facebook";
	 String actualTitle = driver.getTitle();
	 System.out.println(actualTitle);
	 Assert.assertEquals( actualTitle, expectedTitle, "test case is failed");
	 
  }
  
  @Test
  public void invalidEmail() {
	  
	  driver.findElement(By.id("email")).sendKeys("naima.nila115@gmail");
		 driver.findElement(By.id("pass")).sendKeys("111111");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 String expectedTitle = "Facebook";
		 String actualTitle = driver.getTitle();
		 Assert.assertEquals(actualTitle, expectedTitle,"test case is failed");
	  
  }
  
  @Test
  public void invalidPassword() {
	  
	  driver.findElement(By.id("email")).sendKeys("naima.nila115@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("01755304");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 String expectedTitle ="Facebook";
		 String actualTitle = driver.getTitle();
		 Assert.assertEquals(actualTitle, expectedTitle, "test case is failed");
		   
  }
  
  @Test
  public void invalidBoth() {
	  
	  driver.findElement(By.id("email")).sendKeys("naima.nila115@gmail");
		 driver.findElement(By.id("pass")).sendKeys("017553043");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 String expectedTitle ="Facebook";
		 String actualTitle =driver.getTitle();
         Assert.assertEquals( actualTitle, expectedTitle, "test is failed");  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver.getTitle();
  }
 @AfterMethod
  public void screenshot() throws Exception {
	  
	 /* TakesScreenshot scr = ((TakesScreenshot)driver);
	  File file1 = scr.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(file1, new File("C:\\workspace2"));*/
	  System.out.println("screenshot is taken");
	  
  }

  @BeforeClass
  public void setUpUrl() {
	  driver.get("https://www.facebook.com");
	  System.out.println(" url setup is completed");
  }

  @AfterClass
  public void closeUrl() {
	 // driver.close();
	  System.out.println("url is closed");
  }

}
