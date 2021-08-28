package Gun16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class _03_IFrame_Gecis extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");


        //1. frame gec ve inputa yaziyi yaz!!!
        driver.switchTo().frame(0);

        WebElement input=driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("almanya");


        // ayni siradaki  diger IFRAME gecis icin mutlaka ana bolume geri donulmeli

        driver.switchTo().defaultContent(); //ana sayfa

        // driver.switchTo().parentFrame()  -->> bir geri sayfaya git demektir. Yukardaki kodla ayni



        // 2. frame gec oradaki selectin 3. elemanini sec
        driver.switchTo().frame(1);
        WebElement Eanimals=driver.findElement(By.id("animals"));
        Select animals=new Select(Eanimals);
        animals.selectByIndex(2);




        BekleVeKapat();




    }
}
