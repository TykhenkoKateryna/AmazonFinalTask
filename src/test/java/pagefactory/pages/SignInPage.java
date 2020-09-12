package pagefactory.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailFieldForSignIn;

    @FindBy(xpath = "//span/input[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[contains(text(),'email or mobile phone')]")
    private WebElement alertMessage;

    @FindBy(xpath = "//div/h4[contains(text(),'Incorrect')]")
    private WebElement phoneAlertMessage;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailFieldForSignIn() {
        return emailFieldForSignIn;
    }

    public void clickOnContinueButton() {
        continueButton.click();
    }

    public WebElement getAlertMessage() {
        return alertMessage;
    }

    public WebElement getphoneAlertMessage() {
        return phoneAlertMessage;
    }

    public void searchByKeyword(final String keyword) {
        emailFieldForSignIn.sendKeys(keyword, Keys.ENTER);
    }
}
