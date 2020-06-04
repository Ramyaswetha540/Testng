package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testutil.Baseclass;
@Listeners(Customlistener.class)
public class ScreenShotTestcase extends Baseclass{
	
	@BeforeMethod
	public void setUp()
	{
		intialization();
	}
	@Test
	public void takescreeshot() {
	Assert.assertEquals(false,true);
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}


}


