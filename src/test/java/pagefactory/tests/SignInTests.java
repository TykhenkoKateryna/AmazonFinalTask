package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SignInTests extends BaseTest {

    @Test(priority = 1)
    public void checkSignInWithEmptyEmailField() {
        getHomePage().clickOnhamburgerButton();
        getBasePage().waitVisibilityOfHamburgerPopup(30, getHomePage().gethamburgerPopup());
        getHomePage().clickOnSignInButton();
        getBasePage().waitForPageLoadComplete(30);
        assertEquals(getSignInPage().getEmailFieldForSignIn().getText(), "");
        getSignInPage().clickOnContinueButton();
        assertNotNull(getSignInPage().getAlertMessage());
    }

    @Test(priority = 2)
    public void checkSignInWithInvalidEmailField() {
        getHomePage().clickOnhamburgerButton();
        getBasePage().waitVisibilityOfHamburgerPopup(30, getHomePage().gethamburgerPopup());
        getHomePage().clickOnSignInButton();
        getBasePage().waitForPageLoadComplete(30);
        getSignInPage().searchByKeyword("111");
        getSignInPage().clickOnContinueButton();
        assertNotNull(getSignInPage().getphoneAlertMessage());
    }
}