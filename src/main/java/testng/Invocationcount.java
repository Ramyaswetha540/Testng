package testng;

import org.testng.annotations.Test;

public class Invocationcount {
//used to test the testcase as many time required
	//10 times executed
	@Test(invocationCount=10)
	public void sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
}
