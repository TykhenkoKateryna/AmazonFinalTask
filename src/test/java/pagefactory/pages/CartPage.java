package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//input[@value='Delete']")
    private WebElement removeProductButton;

    @FindBy(xpath = "//span[@data-action='a-dropdown-button']")
    private WebElement quantityButton;

    @FindBy(xpath = "//a[@class='a-dropdown-link'][contains(text(),'2')]")
    private WebElement addOneMoreProductButton;

    @FindBy(xpath = "//a[@class='a-dropdown-link'][contains(text(),'1')]")
    private WebElement deductOneProductButton;

    public CartPage (WebDriver driver) {
        super(driver);
    }

    public void clickOnRemoveProductButton() {
        removeProductButton.click();
    }

    public void clickOnQuantityButton() {
        quantityButton.click();
    }

    public void clickOnAddOneMoreProductButton() {addOneMoreProductButton.click(); }

    public void clickOnDeductProductButton() {deductOneProductButton.click(); }
}
