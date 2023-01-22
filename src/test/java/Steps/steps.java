package Steps;

import Pages.homepage;
import Pages.listing;
import Pages.product;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import static Base.core.driver;
import static Base.core.wait;

public class steps {

    homepage home = new homepage();
    listing listing = new listing();
    product product = new product();

    @Given("Go to {string}")
    public void goToUrl(String url) {
        home.goToUrl(url);

    }

    @Given("Verify {string}")
    public void verifyTitle(String key) {
        home.verifyTitle(key);
    }

    @Given("Search {string}")
    public void searchValue(String value) {
        home.searchValue(value);
    }

    @When("Go to the {string}st product from the product list")
    public void clickProduct(String place) {
        listing.clickProduct(place);
    }

    @Then("Write product {string} info to file")
    public void writeProductInfo(String info) throws IOException {
        product.writeProductInfo(info);
    }

    @Before
    public static void testStarter() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().getCookies();
        wait = new WebDriverWait(driver,10,10);
    }

    @After
    public void stopTest() { driver.close(); }

}
