package exam;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    private By phoneNumberField = By.id("phoneNumber");
    private By otpField = By.id("otp");
    private By loginButton = By.id("loginButton");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPhoneNumber(String phoneNumber) {
        WebElement phoneNumberInput = driver.findElement(phoneNumberField);
        phoneNumberInput.sendKeys(phoneNumber);
    }

    public void enterOTP(String otp) {
        WebElement otpInput = driver.findElement(otpField);
        otpInput.sendKeys(otp);
    }

    public void clickLoginButton() {
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
    }

    public void login(String phoneNumber, String otp) {
        enterPhoneNumber(phoneNumber);
        enterOTP(otp);
        clickLoginButton();
    }
}




