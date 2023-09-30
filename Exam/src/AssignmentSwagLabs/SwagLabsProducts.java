package AssignmentSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabsProducts {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user");
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");

		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlContains("/inventory.html"));

		WebElement sortingDropdown = driver.findElement(By.className("product_sort_container"));
		Select sortingSelect = new Select(sortingDropdown);
		sortingSelect.selectByValue("lohi");

		WebElement firstProductPrice = driver.findElement(By.cssSelector(".inventory_item_price"));
		WebElement secondProductPrice = driver
				.findElement(By.cssSelector(".inventory_item:nth-child(2) .inventory_item_price"));

		double firstPrice = Double.parseDouble(firstProductPrice.getText().replace("$", ""));
		double secondPrice = Double.parseDouble(secondProductPrice.getText().replace("$", ""));

		if (firstPrice < secondPrice) {
			System.out.println("Products are sorted correctly by price.");
		} else {
			System.out.println("Products are not sorted correctly by price.");
		}

		WebElement firstProductLink = driver
				.findElement(By.cssSelector(".inventory_item:nth-child(1) .inventory_item_name"));
		String productTitle = firstProductLink.getText();
		firstProductLink.click();

		WebElement productTitleElement = driver.findElement(By.className("inventory_details_name"));
		WebElement productPriceElement = driver.findElement(By.className("inventory_details_price"));
		WebElement productDescriptionElement = driver.findElement(By.className("inventory_details_desc"));

		String displayedTitle = productTitleElement.getText();
		String displayedPrice = productPriceElement.getText();
		String displayedDescription = productDescriptionElement.getText();

		if (displayedTitle.equals(productTitle) && displayedPrice.contains("$") && !displayedDescription.isEmpty()) {
			System.out.println("Product details are displayed correctly.");
		} else {
			System.out.println("Product details are not displayed correctly.");
		}

		driver.quit();
	}
}
