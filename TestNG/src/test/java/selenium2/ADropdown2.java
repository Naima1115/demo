package selenium2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

//verify dropdown in ascending and descending order


public class ADropdown2 {
	
	
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	 
	  driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
	  Select tools = new Select(driver.findElement(By.id("tools")));
	  List actualList = new ArrayList();
	  List<WebElement> myTools = tools.getOptions();
	  
	  for(WebElement ele:myTools) {
		  
		  String data = ele.getText();
		  actualList.add(data);
		  
	  }
	  
	  List temp = new ArrayList();
	  temp.addAll(actualList);
	  
	  //Ascending
	  Collections.sort(temp);
	 Assert.assertTrue(actualList.equals(temp));
	  
  }
}
