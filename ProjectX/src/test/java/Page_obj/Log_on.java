package Page_obj;

import org.openqa.selenium.By;

import Utility.Driver_manager;

public class Log_on extends Driver_manager {
By username_textfield = By.className("loginInputusername");
By password_textfield = By.className("loginInputpwd");
By login_button = By.id("LoginBtn");
String UserDetail = "aut001";
String PasswordDetail = "12345678";


	public void launch_browser(){
	driver.get ("http://automatetillinfinity.co.uk/"); }

		
		public void username(){
		driver.findElement(username_textfield).sendKeys(UserDetail);
		}
		public void password() {
			driver.findElement(password_textfield).sendKeys(PasswordDetail);
		}

		public void click_login_button() {
		  driver.findElement(login_button).click(); 
		}

		public void confirm_homepage(){}
}


		 

		


