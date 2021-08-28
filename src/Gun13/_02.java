package Gun13;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _02 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Actions aksiyonlar=new Actions(driver);

        WebElement btnBank=driver.findElement(By.id("credit2"));
        WebElement kutuBtn=driver.findElement(By.id("bank"));

        Action aksiyon=aksiyonlar.dragAndDrop(btnBank,kutuBtn).build();

        Bekle(7);
        aksiyon.perform();
        Bekle(7);

        Assert.assertTrue(kutuBtn.getText().equals(btnBank.getText()));


        BekleVeKapat();

    }

}
