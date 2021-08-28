package Gun06;

import utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("http://www.practiceselenium.com");

        WebElement linkimiz=driver.findElement(By.linkText("Check Out"));
        linkimiz.click();// tıklatma

        Bekle(2);
        driver.navigate().back();

        Bekle(2);
        driver.navigate().forward();

        BekleVeKapat();
    }
}
