package pagefactory.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchInput;

    @FindBy(xpath = "//div[@id='desktop-grid-3']//a[contains(text(),'See more')]")
    private WebElement electronicsButton;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    private WebElement amountOfProductsInCart;

    @FindBy(xpath = "//a[@id='nav-cart']")
    private WebElement cartButton;

    @FindBy(xpath = "//a[@aria-label='Amazon']")
    private WebElement goToHomeButton;

    @FindBy(xpath = " //a[@role]/i[@class='hm-icon nav-sprite']")
    private WebElement hamburgerButton;

    @FindBy(xpath = "//li/a[contains(@href,'signin')]")
    private WebElement signInButton;

    @FindBy(xpath = "//div/ul[contains(@class,'hmenu-visible')]")
    private WebElement hamburgerPopup;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnElectronicsButton() {
        electronicsButton.click();
    }

    public String getTextOfAmountProductsInCart() {
        return amountOfProductsInCart.getText();
    }

    public void clickOnCartButton() {
        cartButton.click();
    }

    public void clickOnGoToHomeButton() {
        goToHomeButton.click();
    }

    public void clickOnhamburgerButton() {
        hamburgerButton.click();
    }

    public void clickOnSignInButton() {
        signInButton.click();
    }

    public WebElement gethamburgerPopup() {
        return hamburgerPopup;
    }

}
