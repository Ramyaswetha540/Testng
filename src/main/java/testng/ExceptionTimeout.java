package testng;

import org.testng.annotations.Test;

public class ExceptionTimeout {
	
	//expectedException keyword is used to handle exceptions in testng
	
	/*if there are n num of testcases in that if one testcase may have infinitloop  */
//@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
//public void infiniteloop() {
//	int i=1;
//	while(i==1)
//	{
//		System.out.println(i);//here we are not incrementing so if u run this you will get 111111....infinite 1's-recurssion
//	}
//}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void testcase1()
	{
		String a="100A";
		Integer.parseInt(a);//here we cannot change we kmow it is expected execution
	}
}

