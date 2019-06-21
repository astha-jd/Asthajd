package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleLoginTest {
	WebDriver driver;
	
	@Given("user is on DemoWebShop homepage")
	public void user_is_on_DemoWebShop_homepage() {
		System.out.println("user is on home page");
		System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String userN, String passW) {
		driver.findElement(By.xpath("//a[contains(.,'Log in')]")).click();
		driver.findElement(By.name("Email")).sendKeys(userN);
		driver.findElement(By.name("Password")).sendKeys(passW);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	    
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("user clicks log in");
	}

	@Then("should display message login successful")
	public void should_display_message_login_successful() {
		System.out.println("user logged in successfully");
	}

}
