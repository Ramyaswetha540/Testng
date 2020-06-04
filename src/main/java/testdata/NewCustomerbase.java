package testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewCustomerbase {
	
	public static WebDriver driver;
	
	public static void intialization()

{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.demo.guru99.com/V4/");
	  driver.findElement(By.name("uid")).sendKeys("mngr251793");
	  driver.findElement(By.name("password")).sendKeys("dEdyras");
	  driver.findElement(By.name("btnLogin")).click();
	  driver.findElement(By.linkText("New Customer")).click();

}
}
