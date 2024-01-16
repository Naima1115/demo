package listener;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	WebDriver driver;
	
	
  @Test
  public void assertionTest() throws Exception {
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.findElement(By.name("email")).sendKeys("naima.nila1115gmail", Keys.ENTER);
	  SoftAssert softAssert = new SoftAssert();
	  
	  
	 //Title assertion
	  String actualTitle = driver.getTitle();
	  String expectedTitle ="Log in to Facebook";
	  softAssert.assertEquals(actualTitle, expectedTitle, "Title is misMatched");
	  
	  //Url assertion
	  String actualUrl = driver.getCurrentUrl();
	  String expectedUrl ="www.facebook.com/";
	  softAssert.assertEquals(actualUrl, expectedUrl, "Url is misMatched");
	  
	  //Text assertion
	  String actualText = driver.findElement(By.name("email")).getAttribute("value");
	  String expectedText = "";
	  softAssert.assertEquals(actualText, expectedText, "Username text is mismatched");
	  
	  //Border assertion
	  String actualBorder = driver.findElement(By.name("email")).getCssValue("border");
	  String expectedBorder ="1px solid rgb(240, 40, 73)";
	  softAssert.assertEquals(actualBorder, expectedBorder, "Border is mismatched");
	  
	  //Error message assertion 
	  String actualErrorMessage = driver.findElement(By.xpath("//div[@id='email_container']/div)[last()]")).getText();
		String expectedErrorMessage = "The email or mobile number you entered isn’t connected to an account. Find your account and log in.";
	  softAssert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message is mismatched");
	  
	  softAssert.assertAll();
	  driver.quit();
	  
  }
}
