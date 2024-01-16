package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ADropdown {
	
	
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(3000);
	  WebElement ddown = driver.findElement(By.xpath("//*[@id='month']"));
	  ddown.click();
	  Thread.sleep(3000);
	  Select sel = new Select(ddown);
	  
	  //It should return month
	  WebElement selected_value = sel.getFirstSelectedOption();
	  System.out.println("the first selection option is:==="+ selected_value.getText());
	  
	  //select specific month by different method
	  Thread.sleep(3000);
	  sel.selectByIndex(0);
	  Thread.sleep(3000);
	  sel.selectByValue("10");
	  Thread.sleep(3000);
	  sel.selectByVisibleText("Aug");
	 
	  //select actual month list
	List<WebElement> options = sel.getOptions();
	  int totalMonth = options.size();
	  Assert.assertEquals(totalMonth, 12);
	  System.out.println("number of total month is::--->" + totalMonth);
	  
	  for(WebElement ele:options) {
		  
		  String month_name = ele.getText();
		  System.out.println("Month nane is:--->"+ month_name);
		 
	  }
	  
	  //expected list of values and store in list
	  
  }
}
