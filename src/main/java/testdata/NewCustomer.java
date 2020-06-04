package testdata;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testutil.Dataproviderutil;

public class NewCustomer extends NewCustomerbase{

	WebDriver driver;
	NewCustomerpage page;
	@BeforeMethod
	public void setUp()
	{
		
		intialization();
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver\\chromedriver.exe");
//		  driver=new ChromeDriver();
//		  driver.get("http://www.demo.guru99.com/V4/");
//		  driver.manage().window().maximize();
//		  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
//		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		    driver.findElement(By.name("uid")).sendKeys("mngr251793");
//		    driver.findElement(By.name("password")).sendKeys("dEdyras");
//		    driver.findElement(By.name("btnLogin")).click();
		}
	@DataProvider
	public Object[][] getlogindata()
	{
		Object data[][]=Dataproviderutil.getTestData("sheet1");
		return data;
	}
	
	@Test(dataProvider="getlogindata")
	public void login(String CustomerName,String DateofBirth,String Address,String City,String State,String PIN,String MobileNumber,String Email,String Password)
	
	{
		
	   page= new NewCustomerpage();
	   page.details(CustomerName, DateofBirth, Address, City, State, PIN, MobileNumber, Email, Password);
//	   driver.findElement(By.linkText("New Customer")).click();
//	   driver.findElement(By.name("name")).sendKeys(CustomerName);
//	   driver.findElement(By.xpath("//input[@value='m']")).click();
//	   driver.findElement(By.id("dob")).sendKeys(DataofBirth);
//	   driver.findElement(By.name("addr")).sendKeys(Address);
//	   driver.findElement(By.name("city")).sendKeys(City);
//	   driver.findElement(By.name("state")).sendKeys(State);
//	   driver.findElement(By.name("pinno")).sendKeys(PIN);
//	   driver.findElement(By.name("telephoneno")).sendKeys(MobileNumber);
//	   driver.findElement(By.name("emailid")).sendKeys(Email);
//	   driver.findElement(By.name("password")).sendKeys(Password);
}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
 
	}
}
