package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	
	int counter=0;
	int RetryLimit=3;
	
	
	public boolean retry(ITestResult result) {
		
		if(counter<RetryLimit)
		{
			counter++;
			return true;
		}
		
		return false;
	}
	

}
