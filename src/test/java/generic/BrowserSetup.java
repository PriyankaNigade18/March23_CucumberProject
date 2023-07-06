package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup
{
	public WebDriver driver;
	
	static ThreadLocal<WebDriver> td=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return td.get();
	}
	
	public WebDriver setBrowser(String bname)
	{
	if(bname.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
		td.set(driver);
	}else if(bname.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
		td.set(driver);
	}else if(bname.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
		td.set(driver);
	}
		
		return getDriver();
		
		
		
	}
	
	
	

}
