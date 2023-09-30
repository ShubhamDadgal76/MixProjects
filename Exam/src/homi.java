import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homi {
    private WebDriver driver;

    private By pageNameField = By.id("pageName");
    private By introMessageField = By.id("introMessage");
    private By socialLinkOption = By.xpath("//div[@class='social-links']//input");
    private By enableMessagingButton = By.id("enableMessagingButton");
    private By monetizationSettingsButton = By.id("monetizationSettingsButton");

    public homi(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPageName(String pageName) {
        WebElement pageNameInput = driver.findElement(pageNameField);
        pageNameInput.sendKeys(pageName);
    }

    public void enterIntroMessage(String introMessage) {
        WebElement introMessageInput = driver.findElement(introMessageField);
        introMessageInput.sendKeys(introMessage);
    }

    public void selectSocialLink(String socialLink) {
        WebElement socialLinkOptionInput = driver.findElement(socialLinkOption);
        socialLinkOptionInput.sendKeys(socialLink);
    }

    public void clickEnableMessagingButton() {
        WebElement enableMessagingButtonElement = driver.findElement(enableMessagingButton);
        enableMessagingButtonElement.click();
    }

    public void clickMonetizationSettingsButton() {
        WebElement monetizationSettingsButtonElement = driver.findElement(monetizationSettingsButton);
        monetizationSettingsButtonElement.click();
    }

    public void completeMonetizationSettings(String socialLink) {
        enterPageName("My Page");
        enterIntroMessage("Welcome to my page");
        selectSocialLink(socialLink);
        clickEnableMessagingButton();
        clickMonetizationSettingsButton();
    }
}
