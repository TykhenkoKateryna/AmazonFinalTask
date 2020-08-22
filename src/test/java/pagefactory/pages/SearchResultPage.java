package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

    public class SearchResultPage extends BasePage{
        @FindBy(xpath = "//div[contains(@data-cel-widget,'search_result_')]//h2//span[text()]")
        private List<WebElement> searchResultProductsListText;

        @FindBy(xpath = "//span[@cel_widget_id]//h2[contains(@class,'line-clamp')]//span[text()]")
        private List<WebElement> searchResultAppleListText;

        @FindBy(xpath ="//span/a/i/span[contains(text(),'4.9') or contains(text(),'4.8')]")
        private List<WebElement> searchResultFiveStarsProductsList;

        public SearchResultPage(WebDriver driver) {
            super(driver);
        }

        public int getSearchResultsCount() {
            return getSearchResultAppleList().size();
        }

        public int getSearchResultFiveStarsProductsCount() {
            return getSearchResultFiveStarsProductsList().size();
        }

        public List<WebElement> getSearchResultList() { return searchResultProductsListText; }

        public List<WebElement> getSearchResultAppleList() { return searchResultAppleListText; }

        public List<WebElement> getSearchResultFiveStarsProductsList() { return searchResultFiveStarsProductsList; }
    }

