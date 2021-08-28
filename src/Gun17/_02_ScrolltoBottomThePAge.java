package Gun17;

import org.openqa.selenium.JavascriptExecutor;
import utils.BaseStaticDriver;

public class _02_ScrolltoBottomThePAge extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Bekle(1);
        js.executeScript("window.scrollTo(0,0)");
        Bekle(1);


        BekleVeKapat();

    }
}
