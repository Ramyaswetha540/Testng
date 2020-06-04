package testng;

import org.testng.annotations.Test;

public class Testngfeatures {
	
	@Test
	public void loginTest()
	{
		System.out.println("login test");
		//int a=5/0;  if suppose we make this test fail then the homepagetest will be skipped 
	}
	
	/*if logintest fails there is no point to execute second testcase i mean the homepage test is depend on loginpage test
	 * 
	 * 
	 */
	@Test(dependsOnMethods="loginTest")//this indicates the homepagetest is totally depend on login
	public void homepageTest()
	{
		System.out.println("homepage test");
	}

	@Test
	public void searchTest()
	{
		System.out.println("searchtest test");
	}


}
