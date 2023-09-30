package AssignmentSwagLabs;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLabsLogin {

	WebDriver driver;

	@BeforeMethod
	public void setupToOpen() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}

	@Test(priority = 0)
	public void loginWithValidUsernameAndInvalidPasswordFor1stCredential() {
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("standard_user");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("secret");

		WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		loginButton.click();

		String actError = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		String expError = "Epic sadface: Username and password do not match any user in this service";

		Assert.assertEquals(actError, expError);

	}

	@Test(priority = 1)
	public void loginWithInvalidUsernameAndValidPasswordFor1stCredential() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("standard");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("secret_sauce");

		WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		loginButton.click();

		String actError = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		String expError = "Epic sadface: Username and password do not match any user in this service";

		Assert.assertEquals(actError, expError);

	}

	@Test(priority = 2)
	public void loginWithValidUsernameAndInvalidPasswordFor2ndCredential() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("locked_out_user");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("sauce");

		WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		loginButton.click();

		String actError = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		String expError = "Epic sadface: Username and password do not match any user in this service";

		Assert.assertEquals(actError, expError);

	}

	@Test(priority = 3)
	public void loginWithInvalidUsernameAndValidPasswordFor2ndCredential() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("locked_out");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("secret_sauce");

		WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		loginButton.click();

		String actError = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		String expError = "Epic sadface: Username and password do not match any user in this service";

		Assert.assertEquals(actError, expError);

	}

	@Test(priority = 4)
	public void loginWithValidUsernameAndInvalidPasswordFor3rdCredential() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("problem_user");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("secret");

		WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		loginButton.click();

		String actError = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		String expError = "Epic sadface: Username and password do not match any user in this service";

		Assert.assertEquals(actError, expError);

	}

	@Test(priority = 5)
	public void loginWithInvalidUsernameAndValidPasswordFor3rdCredential() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("problem");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("secret_sauce");

		WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		loginButton.click();

		String actError = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		String expError = "Epic sadface: Username and password do not match any user in this service";

		Assert.assertEquals(actError, expError);

	}

	@Test(priority = 6)
	public void loginWithValidUsernameAndInvalidPasswordFor4thCredential() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("performance_glitch_user");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("sauce");

		WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		loginButton.click();

		String actError = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		String expError = "Epic sadface: Username and password do not match any user in this service";

		Assert.assertEquals(actError, expError);

	}

	@Test(priority = 7)
	public void loginWithInvalidUsernameAndValidPasswordFor4thCredential() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("performance_glitch");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("secret_sauce");

		WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		loginButton.click();

		String actError = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		String expError = "Epic sadface: Username and password do not match any user in this service";

		Assert.assertEquals(actError, expError);

	}

	@Test(priority = 7)
	public void loginWithValidCredential() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("standard_user");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("secret_sauce");

		WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		loginButton.click();

		String actError = driver.getTitle();
		String expError = "Swag Labs";

		Assert.assertEquals(actError, expError);
		
	}
	@Test(priority =8 )
	public void ewew() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("/inventory.html"));
        
        WebElement sortingDropdown = driver.findElement(By.className("product_sort_container"));
        Select sortingSelect = new Select(sortingDropdown);
        sortingSelect.selectByValue("lohi");
        
        WebElement firstProductPrice = driver.findElement(By.cssSelector(".inventory_item_price"));
        WebElement secondProductPrice = driver.findElement(By.cssSelector(".inventory_item:nth-child(2) .inventory_item_price"));

        double firstPrice = Double.parseDouble(firstProductPrice.getText().replace("$", ""));
        double secondPrice = Double.parseDouble(secondProductPrice.getText().replace("$", ""));

        if (firstPrice < secondPrice) {
            System.out.println("Products are sorted correctly by price.");
        } else {
            System.out.println("Products are not sorted correctly by price.");
        }
		
	}





	}


