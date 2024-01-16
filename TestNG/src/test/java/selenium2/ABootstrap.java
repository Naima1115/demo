package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ABootstrap {
	
	
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.get("https://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='menu1']")).click();
	 Thread.sleep(8000);
	 
	 List<WebElement> ddown = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
	 Thread.sleep(3000);
	 
	 for(int i=0; i<ddown.size(); i++) {
		 
		 WebElement element = ddown.get(i);
		 String innerHtml = element.getAttribute("innerHTML");
		 
		 if(innerHtml.contentEquals("JavaScript")) {
			 
			 element.click();
			 break;
		 }
		 System.out.println("values from dropdown=="+innerHtml);
	 }
	 
  }
}
