package listener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotClass {
	
	WebDriver driver;
	
  @Test
  public void f() throws IOException{
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.w3school.com/");
	  driver.manage().window().maximize();
	  
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File file = ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(file, new File("./Screenshot/Image1.png"));
	  driver.quit();
  }
}
