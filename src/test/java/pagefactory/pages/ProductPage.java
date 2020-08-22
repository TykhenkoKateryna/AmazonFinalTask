package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement addToCartButton;

    @FindBy(xpath ="//div/img[contains(@alt,'Connector')]")
    private WebElement zoomProductButton;

    @FindBy(xpath ="//div/img[@class='fullscreen']")
    private WebElement zoomFullscreenProductButton;

    public ProductPage (WebDriver driver) {
        super(driver);
    }

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public void clickOnZoomProductButton() { zoomProductButton.click();    }

    public WebElement getzoomFullscreenProductButton() { return zoomFullscreenProductButton; }

}
