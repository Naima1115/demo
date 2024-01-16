package rozana;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class AnnoGoogle extends Annotation {
  @Test
  public void titlelen() {
	  System.out.println("title length is::");
	  
  }
  @BeforeMethod
  public void getOrange() throws Exception {
	  	
	  driver.findElement(By.name("q")).sendKeys("OrangeHRM login");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
		System.out.println("size of autoSuggestion list::"+list.size());
		
		for (WebElement listitem:list)
		if(listitem.getText().contains("login")) {
			listitem.click();
			break;}
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//cite[@role='text']")).click();
	  
	  
  }

  @AfterMethod
  public void screenshot() {
	  System.out.println("screnshot is taken");
  }

  @BeforeClass
  public void setUpurl() {
	  
	  driver.get(google);
	  System.out.println("Url setup completed");
	  
  }

  @AfterClass
  public void closeDriver() {
	  //driver.close();
  }

}
