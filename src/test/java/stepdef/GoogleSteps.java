package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class GoogleSteps
{
	
	WebDriver driver;
	
	@Given("Open Google Application")
	public void open_google_application()
	{
		System.out.println("Google Application Open!");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	}

	@When("I capture current title of application")
	public void i_capture_current_title_of_application()
	{
	 System.out.println("Application title is Captured!"); 
	 System.out.println(driver.getTitle());
	}

	@Then("Title should match With Google")
	public void title_should_match_with_google() 
	{
	    System.out.println("Validation on Title is done!");
	    Assert.assertTrue(driver.getTitle().equals("Google"),"Title is not macthed!");
	    System.out.println("Title is matched!");
	}

	@When("I search valid keyword in search box of google")
	public void i_search_valid_keyword_in_search_box_of_google() {
	    driver.findElement(By.name("q")).sendKeys("Cucumber");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@Then("I should get valid search result")
	public void i_should_get_valid_search_result() 
	{
	    List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
	    for(WebElement i: list)
	    {
	    	System.out.println(i.getText());
	    }
	}


}
