package testutil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public static WebDriver driver;
	
		public static void intialization()
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
	}

public  void failedtestcase()
{
File sourcefile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
	FileUtils.copyFile(sourcefile, new File("C:\\Users\\14388\\eclipse-workspace\\testngsession\\screenshots\\testfailure.jpg"));
} catch (IOException e) {
	e.printStackTrace();
}

}
		
		
}
