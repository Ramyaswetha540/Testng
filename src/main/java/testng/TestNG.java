package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	//preconditions
	@BeforeSuite()//execute first
	public void setup()
	{
		System.out.println("\"setup system property for chrome\"");
	}
	@BeforeTest//execute 2
	public void launchBrowser()
	{
		System.out.println("launch browser");
		
	}
    @BeforeClass//execute-3
    public void enterurl()
    {
	System.out.println("enter url");
    }
	@BeforeMethod//execute-4
	public void login()
	{
		System.out.println("login");
	}
	
	
	/*@BeforeMethod
	 * @Test-1
	 * @AfterMethod
	 *  * =========
	 * @BeforeMethod
	 * @Test-2
	 * @AfterMethod
	 */
	
	//testcase
	@Test//5
	public void googletitletest()
	{
		System.out.println("get the google tile ");
	}
	
	@Test
	public void search()
	{
		System.out.println("search test");
	}
	 
	//post-conditions
	@AfterMethod//6
	public void logout() 
	{
		System.out.println("logout from app");
	}
	@AfterTest//8
	public void deleteallcookies()
	{
		System.out.println("delete all cookies");
	}
	@AfterClass//7
	public void closebrowser()
	{
		System.out.println("closebrowser");
	}
	@AfterSuite//9
	public void generatereport()
	{
		System.out.println("generate reports");
	}
}
