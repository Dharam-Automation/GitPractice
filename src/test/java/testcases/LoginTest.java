package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.Login;

public class LoginTest {
	
	
  @Test
  public void login() {
	  
	  Login log = new Login();
	  
	  log.login();
	  
	  
  }
  
 

}
