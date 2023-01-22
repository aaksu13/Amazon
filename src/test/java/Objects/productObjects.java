package Objects;

import org.openqa.selenium.By;

public class productObjects {
    public static final By price = By.xpath("//span[@class='a-price aok-align-center']/span[@class='a-offscreen']");
    public static final By model = By.xpath("//tr[@class='a-spacing-small po-model_name']/td[@class='a-span9']/span");
    public static final By cpu = By.xpath("//tr[@class='a-spacing-small po-cpu_model.family']/td[@class='a-span9']/span");
}
