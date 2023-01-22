package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class helpers extends core {

    public static void clickElement(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    public static void sendKeyPressEnter(By by,String value){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).sendKeys(value + Keys.ENTER);
    }

    public static String getAttribute(By by,String atr){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by).getAttribute(atr);
    }

}
