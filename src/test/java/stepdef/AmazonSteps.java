package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmazonSteps
{

	WebDriver driver;
@Given("Open Amazon application")
public void open_amazon_application()
{ driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.amazon.in");

    
}

@When("I capture home page title")
public void i_capture_home_page_title() {
   System.out.println(driver.getTitle());
}

@Then("Title should match to HomePage")
public void title_should_match_to_home_page()
{
    Assert.assertTrue(driver.getTitle().contains("India"));
    System.out.println("Title Matched!");
}

@When("I open Best sellers page")
public void i_open_best_sellers_page() 
{
   driver.findElement(By.linkText("Best Sellers")).click();
}



@When("I capture Best sellers page title")
public void i_capture_best_sellers_page_title() {
    
	System.out.println(driver.getTitle());
}

@Then("Title should match to BestSeller")
public void title_should_match_to_best_seller() {
	Assert.assertTrue(driver.getTitle().contains("Bestsellers"));
    System.out.println("Title Matched!");
}

@When("I open Mobiles page")
public void i_open_mobiles_page() {
    driver.findElement(By.linkText("Mobiles")).click();
}


@When("I capture Mobile page title")
public void i_capture_mobile_page_title() {
    System.out.println(driver.getTitle());
}

@Then("Title should match to Mobiles page")
public void title_should_match_to_mobiles_page() {
	Assert.assertTrue(driver.getTitle().contains("Phones"));
    System.out.println("Title Matched!");
}

@When("I open Todays deal page")
public void i_open_todays_deal_page() {
    driver.findElement(By.linkText("Today's Deals")).click();
}
@When("I capture Todays deal page title")
public void i_capture_todays_deal_page_title() {
    System.out.println(driver.getTitle());
}

@Then("Title should match to Todays deal")
public void title_should_match_to_todays_deal() {
	Assert.assertTrue(driver.getTitle().contains("Deals"));
    System.out.println("Title Matched!");
}



}
