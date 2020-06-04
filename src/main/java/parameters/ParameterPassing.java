package parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//passing parameters using @parameters
public class ParameterPassing {
	
	ChromeDriver driver;
	@Test
	@Parameters({"browser","url","username","password"})
	public void setUp(String browser,String url,String username,String password)
	{
		
		if(browser.equals("chrome"))
		{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver=new ChromeDriver();
		}
		  driver.get(url);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


    driver.findElement(By.name("uid")).sendKeys(username);
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.name("btnLogin")).click();
}
	
	
	
}
