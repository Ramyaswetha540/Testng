package testdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testutil.Dataproviderutil;


public class DataproviderTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://www.demo.guru99.com/V4/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	@DataProvider
	public Object[][] getlogindata()
	{
		Object data[][]=Dataproviderutil.getTestData("sheet1");
		return data;
	}
	
	@Test(dataProvider="getlogindata")
	public void login(String username,String password )
	{

	    driver.findElement(By.name("uid")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.name("btnLogin")).click();
//	    Alert alert=driver.switchTo().alert();
//		alert.accept();
//			
	    
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
 
	}
	

}
