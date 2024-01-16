package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoXpath {
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://islahiart.com");
	  Thread.sleep(3000);
      driver.findElement(By.className("account-icon")).click();
  }
}
