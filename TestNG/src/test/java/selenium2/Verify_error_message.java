package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Verify_error_message {
	
	WebDriver driver;
	
  @Test
  public void error() throws Exception {
	  
	  driver = new ChromeDriver();
	  driver.get("http://gmail.com");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	  String actual_error_message = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")).getText();
	  String expected_error_message = "Enter an email or phone number";
	  Assert.assertEquals(actual_error_message, expected_error_message);
  }
}
