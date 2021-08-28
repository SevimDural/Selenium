package Gun16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _02_FrameGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");



        //-->> 1  indesine gore bulma
        driver.switchTo().frame(0);



        WebElement input=driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("Almanya");


        BekleVeKapat();




    }
}
