package stepsFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.gmail.HomePage;
import com.gmail.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailSteps {

	WebDriver driver;
	
	String scDir = System.getProperty("user.dir");
	
	@Before
	
	public void setup() throws InterruptedException {

		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("-private");

		System.setProperty("webdriver.gecko.driver",
				scDir + "\\src\\test\\resources\\geckodriver.exe");
		driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
	}
	
	@After
	
	public void tearDown() throws InterruptedException{
		
		Thread.sleep(6000);
		driver.manage().deleteAllCookies();
		driver.quit();
		driver = null;
		
	}

	@Given("User navigates to gmail website")
	public void user_navigates_to_gmail_website() throws Throwable {
	    Thread.sleep(3000);
	    driver.get("http://gmail.com");
	    
	}

	@And("User inputs username and password")
	public void user_inputs_username_and_password() throws Throwable {
		
		Thread.sleep(3000);
	    
		LoginPage login = new LoginPage(driver);
		
		//This will type the username and password then press enter
		
		login.typeusermail("testmailfw1904@gmail.com");
		login.typepassword("N70.3brD");
				
	}

	@Then("User should be taken to gmail successful login page")
	public void user_should_be_taken_to_gmail_successful_login_page() throws Throwable {
		
		
		
	}
	
	@Given("User creates a new message")
	public void user_creates_a_new_message() throws Throwable {
	   
		HomePage home = new HomePage(driver);
		
		//Clicks on "Compose" message
		
		home.create_new_message();
		
	}
	
	@Then("User should see a new pop-up window")
	public void user_should_see_a_new_pop_up_window() throws Throwable {
		
	}

	@When("User fills in message")
	public void user_fills_in_message() throws Throwable {
	    
		HomePage home = new HomePage(driver);
		
		home.fill_in_message("testmailfw1904@gmail.com", 
				"test subject", 
				"this is a text sample");
	
	}

	@And("User adds image")
	public void user_adds_image() throws Throwable {
		
		HomePage home = new HomePage(driver);
		
		home.attachfile();
		
	}

	@And("User clicks send")
	public void user_clicks_send() throws Throwable {
	    
		HomePage home = new HomePage(driver);
		
		home.sendmessage();
		
	}

	@Then("The message should be sent")
	public void the_message_should_be_sent() throws Throwable {
		
	}

	@Given("User sent message")
	public void user_sent_message() {
	    
	}

	@And("User reads message")
	public void user_reads_message() throws Throwable {
	    
		HomePage home = new HomePage(driver);
		
		home.readmessage();
		
	}

	@Then("body message is the same that was sent")
	public void body_message_is_the_same_that_was_sent() {
	   
	}
	
	@Given("User read message")
	public void user_read_message() {
	    
	}

	@When("User creates a label")
	public void user_creates_a_label() {
	    
	}

	@And("User tags label to message")
	public void user_tags_label_to_message() throws Throwable {
	    
		HomePage home = new HomePage(driver);
		
		home.createlabel();
		
	}

	@Then("The message should be tagged by created label")
	public void the_message_should_be_tagged_by_created_label() {
	    
	}

	@Given("User created a label")
	public void user_created_a_label() {
	    
	}

	@Then("User checks all existing labels")
	public void user_checks_all_existing_labels() throws Throwable {
	    
		HomePage home = new HomePage(driver);
		
		home.labelnavigation();
		
	}


}
