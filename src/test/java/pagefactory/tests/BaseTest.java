package pagefactory.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pagefactory.pages.BasePage;
import pagefactory.pages.HomePage;
import pagefactory.pages.*;

public class BaseTest {

    private WebDriver driver;
    private static final String AMAZON_URL = "https://www.amazon.com/";


    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AMAZON_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(getDriver());
    }

    public ElectronicsPage getElectronicsPage() {
        return new ElectronicsPage(getDriver());
    }

    public HomeAudioPage getHomeAudioPage() {
        return new HomeAudioPage(getDriver());
    }

    public ProductPage getProductPage() {
        return new ProductPage(getDriver());
    }

    public CartPage getCartPage() {
        return new CartPage(getDriver());
    }

    public SignInPage getSignInPage() {
        return new SignInPage(getDriver());
    }

}


