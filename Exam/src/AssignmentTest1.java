
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssignmentTest1 {
    private WebDriver driver;
    private LoginPage loginPage;
    private homi homePage;
    private moni monetizationSettingsPage;

    @BeforeMethod
    public void setUp() {
        // Set up the WebDriver and initialize page objects
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://develop-v2.superlink.io/");
		driver.manage().window().maximize();
    }

//    @AfterMethod
//    public void tearDown() {
//        // Quit the WebDriver
//    }

    @Test
    public void completeAssignment1() {
        loginPage.login("4444444444", "123456");
        homePage.completeMonetizationSettings("Facebook");
        monetizationSettingsPage.connectStripe();
        monetizationSettingsPage.enableTipping();
    }
}