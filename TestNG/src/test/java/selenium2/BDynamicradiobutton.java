package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BDynamicradiobutton {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	  List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
	  
	  for(int i =0; i<radio.size();i++) {
		  
		  WebElement local_radio = radio.get(i);
		  String value = local_radio.getAttribute("value");
		  System.out.println("value from the radio button is:---->"+value);
		   if (value.equalsIgnoreCase("python")) {
			   
			   local_radio.click();
			   break;
		   }
	  }
	  
	  
  }
}
