import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class moni {
    private WebDriver driver;

    private By connectStripeButton = By.id("connectStripeButton");
    private By tippingToggleButton = By.id("tippingToggleButton");

    public moni(WebDriver driver) {
        this.driver = driver;
    }

    public void clickConnectStripeButton() {
        WebElement connectStripeButtonElement = driver.findElement(connectStripeButton);
        connectStripeButtonElement.click();
    }

    public void clickTippingToggleButton() {
        WebElement tippingToggleButtonElement = driver.findElement(tippingToggleButton);
        tippingToggleButtonElement.click();
    }

    public void connectStripe() {
        clickConnectStripeButton();
        // Implement the steps to connect Stripe using the provided credentials
    }

    public void enableTipping() {
        clickTippingToggleButton();
    }
}

