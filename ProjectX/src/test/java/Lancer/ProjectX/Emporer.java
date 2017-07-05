package Lancer.ProjectX;

import Page_obj.Log_on;
import Utility.Driver_manager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


	public class Emporer {Driver_manager Login_step_def = new Driver_manager();
	Log_on Login_step_obj = new Log_on();
			
	@Given("^am on the Landing Page$")
	public void am_on_the_Landing_Page() throws Throwable {
		Login_step_def.set_driver("firefox");
		Login_step_obj.launch_browser(); }
		
	@Given("^I enter my Username as wegit$")
	public void i_enter_my_Username_as_wegit() throws Throwable {
	Login_step_obj.username(); }
	
	@Given("^I enter my Password as (\\d+)$")
	public void i_enter_my_Password_as(int arg1) throws Throwable {
	Login_step_obj.password(); }

	@When("^I click Login button$")
	public void i_click_Login_button() throws Throwable {
	//driver.findElement(By.id("LoginBtn")).click();
	Login_step_obj.click_login_button(); }

	@Then("^am on the Home Page$")
	public void am_on_the_Home_Page() throws Throwable {
	 
	}


}
