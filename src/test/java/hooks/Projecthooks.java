package hooks;

import org.openqa.selenium.WebDriver;

import generic.BrowserSetup;
import io.cucumber.java.Before;

public class Projecthooks 
{

	public WebDriver driver;
	@Before
	public void setup()
	{
		BrowserSetup obj=new BrowserSetup();
		driver=obj.setBrowser("chrome");
	}
}
