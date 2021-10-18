package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.Login;
import pages.UserPage;

public class UserTest {
	
  @Test
  public void useTest() {
	 

	  UserPage uPage = new UserPage();
	  
	  uPage.clickOnUser();

	
  }
  
  
}
