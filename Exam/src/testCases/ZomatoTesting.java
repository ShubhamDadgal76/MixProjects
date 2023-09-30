package testCases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ZomatoTesting {
	WebDriver driver;
	
	@BeforeClass
	public void startUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.zomato.com/india");
		driver.manage().window().maximize();
	}
	
//	@AfterClass
//	public void endProcess() {
//		driver.quit();
//	}
	
	@Test(priority = 0)
	public void checkSignUpTab() {
		WebElement signUp=driver.findElement(By.xpath("//a[text()='Sign up']"));
		signUp.click();
		
	}
	
	@Test(priority = 1)
	public void checkSignIn() {
		String actMessage=driver.findElement(By.xpath("//h2[text()='Sign up']")).getText();
		System.out.println(actMessage);
		String expMessage="Sign up";
		
		assertEquals(actMessage, expMessage);
		
	}
	
	@Test(priority = 2)
	public void providedata() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement name=driver.findElement(By.xpath("//section[@label=\"Full Name\"]"));
		name.clear();
		name.sendKeys("Shubham");
		
		WebElement email=driver.findElement(By.xpath("//section[@label=\"Email\"]"));
		email.clear();
		email.sendKeys("shubhamdadgal1@gmail.com");
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		WebElement button= driver.findElement(By.xpath("//button"));
	}
	

}
