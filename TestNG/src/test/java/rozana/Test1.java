package rozana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void demo(){	  
	WebDriver driver = new ChromeDriver();
	  String url = "https://www.facebook.com";
	  driver.get(url);
	  System.out.println(driver.getTitle());
	  
	  
  }
}
