package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


    public class AddToCartTests extends BaseTest {

        private String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "1";
        private String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART_AFTER_DELETE = "0";
        private String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART_AFTER_ADDING = "2";

        @Test(priority = 1)
        public void checkAddToCart() {
            getBasePage().waitForPageLoadComplete(30);
            getHomePage().clickOnElectronicsButton();
            getElectronicsPage().clickOnHomeAudioButton();
            getBasePage().waitForPageLoadComplete(30);
            getHomeAudioPage().clickOnPortableSpeakerButton();
            getBasePage().implicitWait(20);
            getProductPage().clickOnAddToCartButton();
            getBasePage().implicitWait(30);
            assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
        }
        @Test(priority = 2)
        public void checkDeleteFromCart() {
            getBasePage().waitForPageLoadComplete(30);
            getHomePage().clickOnElectronicsButton();
            getElectronicsPage().clickOnHomeAudioButton();
            getBasePage().waitForPageLoadComplete(30);
            getHomeAudioPage().clickOnPortableSpeakerButton();
            getProductPage().clickOnAddToCartButton();
            getBasePage().implicitWait(20);
            assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
            getHomePage().clickOnCartButton();
            getBasePage().waitForPageLoadComplete(30);
            getCartPage().clickOnRemoveProductButton();
            getBasePage().waitForPageLoadComplete(30);
            getHomePage().clickOnGoToHomeButton();
            assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART_AFTER_DELETE);
        }
        @Test(priority = 3)
        public void checkChangingNumberOfItemsInCart() {
            getBasePage().waitForPageLoadComplete(30);
            getHomePage().clickOnElectronicsButton();
            getElectronicsPage().clickOnHomeAudioButton();
            getBasePage().waitForPageLoadComplete(30);
            getHomeAudioPage().clickOnPortableSpeakerButton();
            getBasePage().implicitWait(20);
            getProductPage().clickOnAddToCartButton();
            getBasePage().waitForPageLoadComplete(30);
            assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
            getHomePage().clickOnGoToHomeButton();
            getBasePage().waitForPageLoadComplete(30);
            getHomePage().clickOnCartButton();
            getBasePage().waitForPageLoadComplete(30);
            getCartPage().clickOnQuantityButton();
            getCartPage().clickOnAddOneMoreProductButton();
            getBasePage().implicitWait(20);
            getHomePage().clickOnGoToHomeButton();
            getBasePage().waitForPageLoadComplete(30);
            assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART_AFTER_ADDING);
            getHomePage().clickOnCartButton();
            getBasePage().waitForPageLoadComplete(30);
            getCartPage().clickOnQuantityButton();
            getCartPage().clickOnDeductProductButton();
            getBasePage().implicitWait(20);
            getHomePage().clickOnGoToHomeButton();
            getBasePage().waitForPageLoadComplete(30);
            assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
        }
    }


