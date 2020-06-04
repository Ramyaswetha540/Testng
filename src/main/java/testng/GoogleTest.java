package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	ChromeDriver driver;
	@BeforeMethod
	public void setUp()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
	}
	@Test(priority=2,groups="Title")
	public void googletitletest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Google","title not match");
	}
	
	@Test(priority=1,groups="Logo")
	public void googlelogotest()
	{
		boolean logo=driver.findElement(By.xpath("(//img)[1]")).isDisplayed();
		System.out.println(logo);
		Assert.assertTrue(logo);
	}
	@Test(priority=3,groups="linktest")
	public void gmaillinktest()
	{
		boolean gmaillink=driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(gmaillink);
	}
	
@Test(priority=4,groups="test")
public void testcase1()
{
	System.out.println("testcase 1");
}
@Test(priority=5,groups="test")
public void testcase2()
{
	System.out.println("testcase 2");
}
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}

}
