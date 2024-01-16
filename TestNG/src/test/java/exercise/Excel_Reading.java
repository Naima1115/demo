package exercise;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Excel_Reading {
  @Test(dataProvider = "getData", dataProviderClass = ExcelTextRead.class)
  public void LoginTest(String username, String password) throws Exception {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(5000);
	  
	   driver.findElement(By.id("email")).sendKeys(username);
     driver.findElement(By.id("pass")).sendKeys(password);
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     Thread.sleep(5000);
     
     String actualTitle = driver.getTitle();
     String expectedTitle = "Log into Facebook";
     Assert.assertEquals(actualTitle,expectedTitle, "title mismatched");
	 Thread.sleep(5000);
	 driver.quit();
  }
}
