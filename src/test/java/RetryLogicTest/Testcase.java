package RetryLogicTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Analyzer.RetryAnalyzer;

public class Testcase {

	//@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class) if there are many testcases it is difficult to write this line for every @test instead 
	//we will define retry login runtime we need to create one transforemer class in analyzer package and implement the method after that we need to mention listner in testng.xml 
	@Test
	public void test1()
	{
	Assert.assertEquals(false,true);
	}
	@Test
	public void test2()
	{
	Assert.assertEquals(false,true);
	}
	
}
