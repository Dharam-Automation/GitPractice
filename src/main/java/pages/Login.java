package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement loginButton;
	
	WebDriver driver;
	
    
    public void login()
    {		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
	         driver = new ChromeDriver();
		 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
			
		PageFactory.initElements(driver, this);
		
	
		
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		loginButton.click();
		
    }

}
