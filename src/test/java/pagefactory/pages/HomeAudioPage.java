package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeAudioPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'OontZ Angle 3')]")
    private WebElement portableSpeakerButton;

    @FindBy(xpath = "//span[contains(text(),'EarPods')]")
    private WebElement appleAerPodsButton;

    @FindBy(xpath = "//li[@aria-label='Apple']//span[text()='Apple']")
    private WebElement appleFilterButton;

    public HomeAudioPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnPortableSpeakerButton() {
        portableSpeakerButton.click();
    }

    public void clickOnAppleAerPodsButton() {
        appleAerPodsButton.click();
    }

    public void clickOnAppleFilterButton() {
        appleFilterButton.click();
    }
}