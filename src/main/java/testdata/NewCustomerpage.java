package testdata;

import org.openqa.selenium.By;

public class NewCustomerpage extends NewCustomerbase{

	
	public void details(String customername,String dob,String add,String cityname,String statename,String pinnum,String tel,String emaild,String pass)
	{
		   
		   driver.findElement(By.name("name")).sendKeys(customername);
		   driver.findElement(By.xpath("//input[@value='m']")).click();
		   driver.findElement(By.id("dob")).sendKeys(dob);
		   driver.findElement(By.name("addr")).sendKeys(add);
		   driver.findElement(By.name("city")).sendKeys(cityname);
		   driver.findElement(By.name("state")).sendKeys(statename);
		   driver.findElement(By.name("pinno")).sendKeys(pinnum);
		   driver.findElement(By.name("telephoneno")).sendKeys(tel);
		   driver.findElement(By.name("emailid")).sendKeys(emaild);
		   driver.findElement(By.name("password")).sendKeys(pass);
	}
}
