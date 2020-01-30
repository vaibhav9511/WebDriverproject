package githubdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Remotedemo 
{

	public static WebDriver driver;
	
	@BeforeTest
	public void setup()
	 {
		System.setProperty("webdriver.gecko.driver", "E:\\umesh\\umesh\\geckodriver.exe");

	  	 driver=new FirefoxDriver();
		
	 }
   @Test	
	public void dologin() throws Exception
	{
		  driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
          
		   Thread.sleep(2000);
     
		     driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("vaibhavkabadecsn1@gmail.com");
		   
			   Thread.sleep(3000);
	   
			     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
			     
			     Thread.sleep(3000);
    		   
		   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("92092994");
		   
		   Thread.sleep(3000);

		   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span")).click();
			     
		   
	}
	
	
}
