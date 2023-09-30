package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Software/SD/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void closseBrowser() {
		driver.quit();
	}
	
	@Test(priority = 0)
	public void checkLogo() {
		WebElement logoImage=driver.findElement(By.xpath("//img"));
		System.out.println(logoImage.isDisplayed());
		assert(logoImage.isDisplayed());
	
	}
	
	@Test(priority = 1)
	public void checkHeading() {
		WebElement acthead1= driver.findElement(By.xpath("//b"));
		String actHead=acthead1.getText();
		String expHead1="Java By Kiran";
		System.out.println(actHead);
		assertEquals(actHead, expHead1);
		
	}
	
	@Test(priority = 2)
	public void checkSubHeading() {
		WebElement actSubhead1= driver.findElement(By.xpath("//h4"));
		String actSubHead=actSubhead1.getText();
		String expSubHead1="JAVA | SELENIUM | PYTHON";
		System.out.println(actSubHead);
		assertEquals(actSubHead, expSubHead1);
		
	}
	
	@Test(priority = 3)
	public void checkSignInMsg() {
		WebElement actmsg1= driver.findElement(By.xpath("//p"));
		String actMsg=actmsg1.getText();
		String expMsg1="Sign in to start your session";
		System.out.println(actMsg);
		assertEquals(actMsg, expMsg1  );
		
	}
	
	@Test(priority = 4)
	public void checkRegisterPage() {
		WebElement registerLink=driver.findElement(By.xpath("//a[text()='Register a new membership']"));
		String linkText=registerLink.getText();
		System.out.println(linkText);
		registerLink.click();
		
		String actHead=driver.getTitle();
		String expHead="JavaByKiran | Registration Page";
		System.out.println(actHead);
		
		assertEquals(actHead, expHead);
		
	}
	
	
	
	@Test(priority = 6)
	public void checkCredentials() {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("kiran@gmail.com");
		
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("123456");
		
		WebElement submitButton= driver.findElement(By.xpath("//button"));
		submitButton.click();
		
		String expTitle="JavaByKiran | Dashboard";
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, expTitle);
	}
	
	
	
	

}
