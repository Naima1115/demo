package selenium2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Calender_drp {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
	  
	  driver.findElement(By.xpath("//input[@id='dob']")).click();
	  
	  Select mt = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
	  mt.selectByVisibleText("Jan");
	  
	  Select yr = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
	  yr.selectByValue("1990");
	  
	  String date = "23";
	  List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	  
	  for(int i=0; i<alldates.size(); i++) {
		  
		  WebElement ele = alldates.get(i);
		  String dt = ele.getText();
		  
		  if(dt.equals(date)) {
			  ele.click();
			  break;
		  }
	  }
	  }
}
