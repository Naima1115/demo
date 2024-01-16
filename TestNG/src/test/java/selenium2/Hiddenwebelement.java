package selenium2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hiddenwebelement {
	WebDriver driver;
	String Url="";
	
  @Test
  public void f() {
	  
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get(Url);
  }
}
