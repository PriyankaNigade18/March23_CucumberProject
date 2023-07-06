package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import generic.BrowserSetup;
import io.cucumber.java.en.*;

public class HrmTest
{
	WebDriver driver=BrowserSetup.getDriver();
	@Given("Open Orangehrm application")
	public void open_orangehrm_application()
	{
	//driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
	}

	@When("user enter valid username {string} and valid password {string}")
	public void user_enter_valid_username_and_valid_password(String un, String psw) {
		//username
		driver.findElement(By.name("username")).sendKeys(un);
		
		//password
		driver.findElement(By.name("password")).sendKeys(psw);
		
		
		    
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		//login
				//driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
				
				driver.findElement(By.className("oxd-button")).click();
				
	}

	@Then("User should be able to login as per validation")
	public void user_should_be_able_to_login_as_per_validation() {
		//Assertion
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login is fail for invalid data");
		System.out.println("Login done Successfully!");
	}


}
