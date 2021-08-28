package Gun06;

import utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_CssSelectorOrnek extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("");

        WebElement element=driver.findElement(By.cssSelector("[class='form-actions'][style='text-align: right']"));
        WebElement element2= driver.findElement(By.cssSelector("[id='wsb-element-00000000-0000-0000-0000-000450914894'] > div > p > span"));


        BekleVeKapat();
    }
}

