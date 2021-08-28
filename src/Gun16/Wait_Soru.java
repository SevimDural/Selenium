package Gun16;
/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Çıkan alerte accept yapınız.

     wait.until(ExpectedConditions.alertIsPresent());
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class Wait_Soru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.demoblaze.com/index.html");


        WebElement element=driver.findElement(By.linkText("Samsung galaxy s6"));
        element.click();

        WebElement addCart=driver.findElement(By.linkText("Add to cart"));
        addCart.click();

        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        BekleVeKapat();








    }
}
