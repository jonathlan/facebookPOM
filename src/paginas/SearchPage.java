package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	private WebDriver driver;
	public WebDriverWait wait;
	
	/*Elements*/
	WebElement searchTxt;
	WebElement searchBtn;
	
	public SearchPage(WebDriver driver2) {
		this.driver = driver2;
		wait = new WebDriverWait(driver, 15);
	}

	/*Methods*/
	public void findFriend (String friendName) {
		//searchTxt = driver.findElement(By.name("q"));
		searchTxt = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		searchTxt.clear();
		searchTxt.sendKeys(friendName);
		//searchBtn = driver.findElement(By.xpath("//button[@data-testid='facebar_search_button']"));
		searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='facebar_search_button']")));
		searchBtn.click();
	}
}
