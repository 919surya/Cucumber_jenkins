package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	
	LoginPage loginPage;
	DatabasePage databasePage;
	@Before
	public void methodName() {
		initDriver();
		loginPage=PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();
	}

	@Given("^User is on the Techfios login page$")
	public void user_is_on_the_Techfios_login_page() {
		initDriver();
		driver.get("https://codefios.com/ebilling/login");

	}
	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		loginPage.enterUserName(username);
		
	}
	@When("^User enters \"([^\"]*)\" from database$")
	public void user_enters_from_database(String userdata) {
//		
//		if(userdata.equalsIgnoreCase("username")) {
//			loginPage.enterUserName("Get it from Db");
//		}else if(userdata.equalsIgnoreCase("password")) {
//			loginPage.enterPassword("Get it from Db");
//		}else {
//			System.out.println("Unable to retrive data:'"+ userdata +"' from Db!");
//		}
			
		switch(userdata) {
		case "username":
			loginPage.enterUserName(databasePage.getDataFromDb("username"));
			System.out.println("Username from DB: " +databasePage.getDataFromDb("username"));
			break;
		case "password":
			loginPage.enterPassword(databasePage.getDataFromDb("password"));
			System.out.println("Password from DB: "+ databasePage.getDataFromDb("password"));
			break;
		default:
			System.out.println("Unable to retrive data:'"+ userdata +"' from Db!");		
		}
	}
	
	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
		
	}
	@When("^User clicks on the Submit button$")
	public void user_clicks_on_the_Submit_button() {
		loginPage.clickSigninButton();
		
	}
	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() {
		Assert.assertEquals("Codefios", loginPage.getPageTitle());
		
		takeScreenShot(driver);

	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
