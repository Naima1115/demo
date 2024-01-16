package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender_date {
	
	WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.get("https://www.redbus.in/");
	  String month = "July";
	  String year = "2024";
	  String date = "10";
	 
	  driver.findElement(By.xpath("//*[@class='dateText']")).click();
	  
	  while(true) {
		  
		 String monthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		 String arr[] = monthYear.split(" ");
		 String mn = arr[0];
		 String yr = arr[1];
		 
		 if(mn.equalsIgnoreCase(month) && yr.equals(year)) {
			 break;
		 }
		 else {
			 driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
		 }
	  }
	  
	  //date selection
	  List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
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
