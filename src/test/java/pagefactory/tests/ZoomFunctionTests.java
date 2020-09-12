package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ZoomFunctionTests extends BaseTest {

    private String SEARCH_KEYWORD = "Apple EarPods with Lightning Connector - White";

    @Test(priority = 1)
    public void checkZoomOfProductPicture() {
        getBasePage().waitForPageLoadComplete(40);
        getHomePage().clickOnElectronicsButton();
        getElectronicsPage().clickOnHomeAudioButton();
        getBasePage().waitForPageLoadComplete(30);
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getHomeAudioPage().clickOnAppleAerPodsButton();
        getProductPage().clickOnZoomProductButton();
        assertNotNull(getProductPage().getzoomFullscreenProductButton());
    }
}
