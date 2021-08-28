package Proje3;

import Utils.BaseUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Senaryo2 extends ZeroUtil {
    public static void main(String[] args) {
        /*

1) Bu siteye gidin --> http://zero.webappsecurity.com/login.html

2) Login'e "username" -- Password'a "password" yazın. Sign in button'una tıklayınız.

3) Paybils button'ına tıklayınız.

4) Payee dropdown'unundan rastgele (Random) bir değer seçiniz.

5) Account dropdown'unundan rastgele (Random) bir değer seçiniz..

6) Amount'a bir değer girin..

7) Date'de bir tarih seçiniz.

8) Description'ı her hangi bir şekilde doldurun.

11) Pay button'una tıklayınız.

12) The payment was successfully submitted. mesajının göründüğünü doğrulayınız.

         */
        zeroDemoLogin();

        WebElement transferButton = driver.findElement(By.linkText("Pay Bills"));
        transferButton.click();

        List<WebElement> selectList1 = driver.findElements(By.cssSelector("select[id='sp_payee']>option"));
        random(selectList1);

        List<WebElement> selectList2 = driver.findElements(By.cssSelector("select[id='sp_account']>option"));
        random(selectList2);

        WebElement amount = driver.findElement(By.id("sp_amount"));
        amount.sendKeys("2000");

        WebElement date = driver.findElement(By.id("sp_date"));
        date.click();

        WebElement day=driver.findElement(By.linkText("21"));
        day.click();

        WebElement description = driver.findElement(By.id("sp_description"));
        description.sendKeys("Öğretmen Kredisi");

        WebElement payButton = driver.findElement(By.cssSelector("[class='btn btn-primary'][id='pay_saved_payees']"));
        payButton.click();

        WebElement message = driver.findElement(By.id("alert_content"));
        Assert.assertEquals("The payment was successfully submitted.", message.getText());

        BekleVeKapat();

    }

}
