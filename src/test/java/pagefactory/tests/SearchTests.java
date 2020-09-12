package pagefactory.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {

    private String SEARCH_KEYWORD = "Apple EarPods with Lightning Connector - White";
    private String SEARCH_FILTER_KEYWORD = "Apple";


    @Test(priority = 1)
    public void checkThatSearchResultsContainsSearchProduct() {
        getBasePage().waitForPageLoadComplete(40);
        getHomePage().clickOnElectronicsButton();
        getElectronicsPage().clickOnHomeAudioButton();
        getBasePage().waitForPageLoadComplete(30);
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        for (WebElement webElement : getSearchResultPage().getSearchResultList()) {
            assertTrue(webElement.getText().contains(SEARCH_KEYWORD));
        }

    }

    @Test(priority = 2)
    public void checkThatFilterResultsContainsFilterWord() {
        getBasePage().waitForPageLoadComplete(40);
        getHomePage().clickOnElectronicsButton();
        getElectronicsPage().clickOnHomeAudioButton();
        getBasePage().waitForPageLoadComplete(30);
        getHomeAudioPage().clickOnAppleFilterButton();
        getBasePage().implicitWait(20);
        for (WebElement webElement : getSearchResultPage().getSearchResultAppleList()) {
            assertTrue(webElement.getText().contains(SEARCH_FILTER_KEYWORD));
        }
    }

    @Test(priority = 3)
    public void checkElementsAmountOnSearchFilteredPage() {
        getBasePage().waitForPageLoadComplete(40);
        getHomePage().clickOnElectronicsButton();
        getElectronicsPage().clickOnHomeAudioButton();
        getBasePage().waitForPageLoadComplete(30);
        getHomeAudioPage().clickOnAppleFilterButton();
        getBasePage().implicitWait(20);
        assertEquals(getSearchResultPage().getSearchResultsCount(), 12);
    }

    @Test(priority = 4)
    public void checkFiveStarsElementsAmountOnSearchFilteredPage() {
        getBasePage().waitForPageLoadComplete(40);
        getHomePage().clickOnElectronicsButton();
        getElectronicsPage().clickOnHomeAudioButton();
        getBasePage().waitForPageLoadComplete(30);
        getHomeAudioPage().clickOnAppleFilterButton();
        getBasePage().implicitWait(20);
        assertEquals(getSearchResultPage().getSearchResultFiveStarsProductsCount(), 4);
    }
}