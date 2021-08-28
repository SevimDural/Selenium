package Gun16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class _04_IcICeFrmaeSoru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");


        //1. frame gec ve inputa yaziyi yaz!!!
        driver.switchTo().frame(0);

        WebElement input=driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("almanya");


        driver.switchTo().frame(0);  // 1. framein icindeki frame e gitti
        WebElement chechBox=driver.findElement(By.id("a"));
        chechBox.click();

        // driver.switchTo().defaultContent(); // direk ana sayfa  HOME!!!!!
        driver.switchTo().parentFrame();  // direk ana sayfa ulasirim   BACK !!!!
        driver.switchTo().parentFrame();



        driver.switchTo().frame(1);
        WebElement Eanimals=driver.findElement(By.id("animals"));
        Select animals=new Select(Eanimals);
        animals.selectByIndex(3);





        BekleVeKapat();
    }
}
