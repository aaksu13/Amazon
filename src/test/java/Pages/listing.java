package Pages;

import Base.helpers;
import Objects.listingObjects;
import org.openqa.selenium.WebElement;
import java.util.List;


public class listing extends helpers {
    public static void clickProduct(String place) {
        int i = Integer.parseInt(place);
        List<WebElement> products = driver.findElements(listingObjects.products);
        products.get(i+3).click();
    }
}