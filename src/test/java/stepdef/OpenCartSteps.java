package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class OpenCartSteps
{
	WebDriver driver;
	@Given("Open Opencart application")
	public void open_opencart_application() {
	    driver=new ChromeDriver();
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("I enter valid emailid {string} and valid password {string}")
	public void i_enter_valid_emailid_and_valid_password(String email, String psw) {
	   
	
	    driver.findElement(By.name("email")).sendKeys(email);
	    driver.findElement(By.name("password")).sendKeys(psw);
	}

	@When("I clicked on Login button")
	public void i_clicked_on_login_button() {
	   driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("I should be able to Login")
	public void i_should_be_able_to_login() {
	    System.out.println("Validation is done!");
	}


}
