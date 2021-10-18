package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
	WebElement admin;
	
	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
	WebElement userManagement;
	
	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
	WebElement userLink;
	
	
	
	public void clickOnUser()
	
	{		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
	 		driver = new ChromeDriver();
		 
		PageFactory.initElements(driver, this);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, this);
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		loginButton.click();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(admin).build().perform();
		
		action.moveToElement(userManagement).build().perform();
		
		userLink.click();
	}

}
