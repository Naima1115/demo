package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DCheckbox {
	
	WebDriver driver;
	
	
  @Test
  public void f() {
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	  List<WebElement> checkbox = driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
	  
	  for(int i=0; i<checkbox.size(); i++) {
		  
		  WebElement box = checkbox.get(i);
		  String value = box.getAttribute("id");
		  System.out.println("values from the checkbox are:=====>>"+ value);
		  
		  if(value.equalsIgnoreCase("sing")) {
			  
			  box.click();
		  }
	  }
  }
}
