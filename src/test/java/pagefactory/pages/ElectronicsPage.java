package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage {

    @FindBy(xpath = "//a[@aria-label='HOME AUDIO']")
    private WebElement homeAudioButton;

    public ElectronicsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnHomeAudioButton() {
        homeAudioButton.click();
    }


}


