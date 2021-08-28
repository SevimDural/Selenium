package Gun13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _03 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        Actions aksiyonlar=new Actions(driver);

        WebElement txtBox=driver.findElement(By.id("autiComppleteSingleInput"));

        Action aksiyon=aksiyonlar.moveToElement(txtBox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .build();

        Bekle(2);

        aksiyon.perform();
        Bekle(2);

        BekleVeKapat();
    }
}
