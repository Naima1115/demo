package exercise;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Parameter extends Suite_Test {
	
  @Parameters({"username" , "password"})
  @Test
  public void login(String username, String password) throws Exception{
	  
	  Thread.sleep(3000);
	   driver.findElement(By.name("username")).sendKeys(username);
	   Thread.sleep(3000);
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	 WebElement el = driver.findElement(By.name("q"));
	 el.sendKeys("orangeHRM demo");
	Thread.sleep(2000);
			el.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			el.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//cite[@role='text']")).click();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("Screenshot is taken");
  }

  @BeforeClass
  public void getUrl() {
	  
	  driver.get(url);
	  System.out.println("Open google");
  }

  @AfterClass
  public void afterClass() {
	  
	  //driver.close();
	  System.out.println("close url");
  }

}
