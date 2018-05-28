package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Note: Class prototypes does not have main
//This is a page object
public class LoginPage {
	private WebDriver driver;
	
	/*Elements*/
	WebElement fblogoImg;
	WebElement emailTxt;
	WebElement passwordTxt;
	WebElement loginBtn;
		
	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
	}

	/*Methods*/
	public void login(String user, String pass) {
		driver.findElement(By.id("email")).sendKeys(user);		
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();		
	}	
}
