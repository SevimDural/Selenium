package Proje3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Senaryo3 extends ZeroUtil {
    public static void main(String[] args) {
        /*

1) Bu siteye gidin --> http://zero.webappsecurity.com/login.html

2) Login'e "username" -- Password'a "password" yazın. Sign in button'una tıklayınız.

3) Paybils button'ına tıklayınız.

4) Purchase Foreign Currency'ya tıklayınız.

5) Currency kısmından rastgele(RANDOM) bir değer seçiniz. (Dropdown'ın içindeki Select One değerini, Random'a dahil etmeyin.)

6) Amount'a bir değer girin.

7) U.S. dollar (USD)'ı seçiniz.

8) Purchase button'una tıklayınız.

9) Foreign currency cash was successfully purchased. yazısı görünmelidir.

         */
        zeroDemoLogin();

        WebElement transferButton = driver.findElement(By.linkText("Pay Bills"));
        transferButton.click();

        WebElement day=driver.findElement(By.linkText("Purchase Foreign Currency"));
        day.click();

        List<WebElement> selectList1 = driver.findElements(By.cssSelector("select[id='pc_currency']>option"));
        selectList1.remove(0);

        random(selectList1);

        WebElement amount = driver.findElement(By.id("pc_amount"));
        amount.sendKeys("2000");

        WebElement dolarBox=driver.findElement(By.id("pc_inDollars_true"));
        dolarBox.click();

        WebElement sendButton=driver.findElement(By.id("purchase_cash"));
        sendButton.click();

        WebElement message = driver.findElement(By.id("alert_content"));
        Assert.assertEquals("Foreign currency cash was successfully purchased.", message.getText());

        BekleVeKapat();

    }

}
