package AutomationAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {

	WebDriver driver;

	@BeforeTest
	public void setupToOpen() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=1727527706074642039&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-10573980&hydadcr=14453_2154373");
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void searchForIphone() {

		WebElement sBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		sBox.sendKeys("iphone");
		sBox.submit();
		System.out.println("Search results page title: " + driver.getTitle());
		String actTitle = driver.getTitle();
		String exptitle = "Amazon.in : iphone";
		Assert.assertEquals(actTitle, exptitle);

	}

	@Test(priority = 1)
	public void searchForMask() {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		searchBox.sendKeys("mask");

		// Submit the search query
		searchBox.submit();

		// Find the search result list and get all the result items
		WebElement resultGrid = driver.findElement(By.cssSelector("[data-component-type='s-search-results']"));
		List<WebElement> resultItems = resultGrid
				.findElements(By.cssSelector("[data-component-type='s-search-result']"));

		// Verify that the result list is not empty
		assert !resultItems.isEmpty() : "No search results found!";

		// Print the search results

		for (WebElement resultItem : resultItems) {
//	            System.out.println(resultItem.findElement(By.cssSelector("[data-component-type='s-product-image']")).getAttribute("alt"));
		}
		System.out.println("Search results page title: " + driver.getTitle());

		String actTitle = driver.getTitle();
		String exptitle = "Amazon.in : mask";
		Assert.assertEquals(actTitle, exptitle);
	}

	@Test(priority = 2)
	public void searchForJacket() {
		WebElement jacket=driver.findElement(By.xpath("//input[@type='text']"));
		jacket.clear();
		jacket.sendKeys("Jacket");
		jacket.submit();
		
//		WebElement jacketsList=driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']"));
		List<WebElement> jacketList1 =driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base']"));

		for (WebElement webElement : jacketList1) {
			System.out.println("list of all Jackets= " + webElement.getText() );
			
		}
	}
	
	@Test(priority = 3)
	public void searchTshirt() {
		
		WebElement tShirt=driver.findElement(By.xpath("//input[@type='text']"));
		tShirt.clear();
		tShirt.sendKeys("tshirt");
		tShirt.submit();
		
		List<WebElement> tshirts=driver.findElements(By.xpath("//span[@class=\"a-size-base-plus a-color-base\"]"));
		for (WebElement webElement : tshirts) {
			System.out.println("list of all tshirts: " + webElement.getText());
		}
		
	}

}
