package Pages;

import Base.helpers;
import Objects.homepageObjects;
import org.junit.Assert;

public class homepage extends helpers {
    public static void goToUrl(String url) {
        driver.get(url);
        clickElement(homepageObjects.cookie);
    }
    public static void verifyTitle(String key) {
        Assert.assertTrue(driver.getTitle().contains(key));
    }
    public static void searchValue(String value) {
        sendKeyPressEnter(homepageObjects.searchInput,value);
    }
}
