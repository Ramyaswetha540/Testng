package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardandSoftAssertions {
	
	SoftAssert softassert=new SoftAssert();
	
	@Test
	public void test1()
	{
		
		SoftAssert softassert1=new SoftAssert();
		System.out.println("open browser");
		
		//Assert.assertEquals(true,false);//hard assertion
		Assert.assertEquals(true,true);
		
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click signon button");
		//Assert.assertEquals(true, false);//hard assertion
		System.out.println("validate homepage");
		softassert1.assertEquals(true,false);
		System.out.println("click on register");
        System.out.println("register");
        softassert1.assertEquals(true,false);
        System.out.println("go to contact page");
        System.out.println("enter the details");
        softassert1.assertEquals(true,false);
        
        softassert1.assertAll();
	}
	
	@Test
	public void test2()
	{
		
		SoftAssert softassert2=new SoftAssert();
		System.out.println("testcase2");
		softassert2.assertEquals(true, false);
		softassert2.assertAll();
	}

}
