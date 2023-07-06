package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class TestHooks 
{
/*
 * Hooks will help to setup preconditions and post conditions
 */
	
	

	@Before
	public void setup()
	{
		System.out.println("This is Setup Prerequisite for browser");
		
	}
	
	@After
	public void tearDown()
	{
		System.out.println("This i spost condition ");
		
	}
	
	@BeforeStep
	public void bstep()
	{
		System.out.println("This is executing before every step");
	}
	
	
	@AfterStep
	public void astep()
	{
		System.out.println("This is executing after every step");
	}
}
