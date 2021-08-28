package Proje3;

import Utils.BaseUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Senaryo1 extends ZeroUtil {
    public static void main(String[] args) {
        /*

 1) Bu siteye gidin --> http://zero.webappsecurity.com/login.html

2) Login'e "username" -- Password'a "password" yazın . Sign in button'ına tıklayınız.

3) Transfer founds butonuna tıklayınız.

4) From account kısmından herhangı bir(Random'la tıklatın) değer seçınız.

5) To account kısmından herhangı bir(Random'la tıklatın.) değer seçınız.

6) Her hangi bir amount gırınız.

7) Her hangi bir description giriniz.

8)Continue butonuna tiklayiniz.

9)Submit butonuna tiklayiniz.

10) "You successfully submitted your transaction" Yazısı gözükmesi gerekiyor.

         */

        zeroDemoLogin();

        WebElement transferButton = driver.findElement(By.linkText("Transfer Funds"));
        transferButton.click();

        List<WebElement> selectList1 = driver.findElements(By.cssSelector("select[id='tf_fromAccountId']>option"));
        random(selectList1);

        List<WebElement> selectList2 = driver.findElements(By.cssSelector("select[id='tf_toAccountId']>option"));
        random(selectList2);

        WebElement amount = driver.findElement(By.id("tf_amount"));
        amount.sendKeys("2000");

        WebElement description = driver.findElement(By.id("tf_description"));
        description.sendKeys("Tarım Kredisi");

        WebElement continiue = driver.findElement(By.cssSelector("[class='btn btn-primary'][id='btn_submit']"));
        continiue.click();

        WebElement submit2 = driver.findElement(By.cssSelector("[class='btn btn-primary'][id='btn_submit']"));
        submit2.click();

        WebElement message = driver.findElement(By.cssSelector("[class='alert alert-success']"));
        Assert.assertEquals("You successfully submitted your transaction.", message.getText());

        BekleVeKapat();

    }

}
