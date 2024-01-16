package selenium2;


import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CBrokenlink {
	
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://newtours.demoaut.com/");
	   Thread.sleep(5000);
	  //Capture all the links
	  List<WebElement> links = driver.findElements(By.linkText("a"));
	  
	  //number of the links
	  System.out.println(links.size());
	  
	  //using href find the url of the links
	  
	  for(int i=0; i<links.size(); i++) {
		  
		  WebElement ele = links.get(i);
		  String url = ele.getAttribute("href");
		  
          URL link = new URL(url);
          
          //create a connection using url object 'link'
		  HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
		  Thread.sleep(2000);
		  
		  //establish connection
		  httpcon.connect();
		  int rescode = httpcon.getResponseCode();
		  
		  if(rescode>=400) {
			  
			  System.out.println(url +"-"+"is a broken link");
		  }
		  else {
			  System.out.println(url + "-"+ "is valid link");
		  }
	  }
  }
}
