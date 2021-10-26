package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps {
	
	WebDriver driver;

//Use the following code only for basic exercises. Not recommended in professional projects
	@Given("user is in index page")
	public void IndexPage() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/index.html");
	}
	
	@When("user clicks in sign up button")
	public void ClickSignUpButton() {
		driver.findElement(By.id("signin2")).click();
	}
	
	@When("user enters username and password")
	public void EnterUsernamePassword() {
		driver.findElement(By.id("sign-username")).sendKeys("User01");
		driver.findElement(By.id("sign-password")).sendKeys("Pass_01");
	}
	
	@When("user clicks in modal window the sign up button")
	public void ModalClickSignUpButton() {
		driver.findElement(By.className("btn-primary")).click();
	}
	
	@Then("new user was generated")
	public void UserGenerated() {
		
		Assert.assertEquals(driver.switchTo().alert().getText(), "Sign up successful.");
		
	}
	
	@Given("user is in index hompepage")
	public void UserHomePage() {
		driver.navigate().to("https://www.demoblaze.com/index.html");
	}
	
	@When("user clicks in log in nav link")
	public void LogInUser() {
		driver.findElement(By.id("login2")).click();
	}
	
	@When("user enters the username and password")
	public void EnterRegisteredUsernamePassword() {
		driver.findElement(By.id("sign-username")).sendKeys("User01");
		driver.findElement(By.id("sign-password")).sendKeys("Pass_01");
	}
	
	@When("user clicks in Log in button")
	public void ModalClickLogInButton() {
		driver.findElement(By.className("btn-primary")).click();
	}
	
	@Then("username goes to homepage")
	public void LogInHomepageUser() {
		
		Assert.assertEquals(driver.findElement(By.id("nameofuser")).getText(), "Welcome User01");
		
	}
	
	@Given("user is in the homepage")
	public void UserHomePage2() {
		driver.navigate().to("https://www.demoblaze.com/index.html");
	}
	
	@When("user clicks on Log out nav link")
	public void GoToLogOut() {
		driver.findElement(By.id("logout2")).click();
	}
	
	@Then("user goes to default index page")
	public void LogOutUser() {
		
		Assert.assertEquals(driver.findElement(By.id("signin2")).getText(), "Sign up");
		
	}
}
