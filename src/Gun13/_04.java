package Gun13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _04 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/auto-complete");
        Actions aksiyonlar=new Actions(driver);

        WebElement txtBox=driver.findElement(By.id("autoCompleteMultipleInput"));

        Action aksiyon=aksiyonlar
                .moveToElement(txtBox)
                .click()
                .sendKeys("b").build();

        aksiyon.perform();
        Bekle(3);


        Bekle(3);
        BekleVeKapat();

        aksiyon=aksiyonlar
                .sendKeys(Keys.ARROW_DOWN)  // yon tuslarina bastik
                .sendKeys(Keys.ENTER)       // enter a bastik
                .build();                   // build

        aksiyon.perform();
        Bekle(3);


        Bekle(5);
        BekleVeKapat();

    }
}
