package AssignmentSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsProductsert {

	WebDriver driver;


	@BeforeMethod
	public void setupToOpen() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("standard_user");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("secret_sauce");

		WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		loginButton.click();
	}

	@Test(priority = 0)
	public void filterDropdown() {
		
		WebElement filterDropdown = driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		filterDropdown.click();
		
		WebElement sorting = driver.findElement(By.xpath("//option[@value=\"za\"]"));
		sorting.click();
		
		
	}

}
