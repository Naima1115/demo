package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderClass {
  @Test(dataProvider = "loginTestData")
  public void loginData(String username, String password) throws Exception{
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "OrangeHRM";
	  Assert.assertEquals(actualTitle,expectedTitle, "mismatched");
	  driver.close();
	  
	  
  }
  
  @DataProvider(name ="loginTestData")
 public  Object[][] loginData(){
	  
	  Object[][] data = new Object[2][2];
	  data[0][0] = "Admin";
	  data[0][1] = "admin123";
	  data[1][0] = "amin";
	  data[1][1] = "123";
	  
	  return data;
	  
  }
}
