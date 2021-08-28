package Gun19proje4._01;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.Set;
/*

            TASK 1
        - Bu siteye gidiniz.  "http://demowebshop.tricentis.com/"
        - Sağ üstteki "Log in" yazısına tıklayınız.
        - "email" ve "password" girip "log in"e tıklayınız.
        - Sayfanın en altındaki "Follow Us" başlığındaki "Facebook" buttonuna tıklayınız.
          Sonrasında açılan pencerenin URL'indeki "facebook" kelimesini doğrulayınız.
        - Ana sayfaya geri dönün.
        - "Information" başlığı altındaki "Contact Us" buttonuna tıklayınız.
        - "Enquiry" yazan yerin altındaki text kutusuna mesajınızı yazıp "submit" butonuna tıklayınız.
        - Sonrasında çıkan yazıyı dpğrulayınız.

 */
public class proje4_1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().deleteAllCookies();
        String anaSayfaIdsi = driver.getWindowHandle();


        WebElement login = driver.findElement(By.cssSelector("a[class='ico-login']"));
        login.click();

        WebElement email = driver.findElement(By.cssSelector("input[id=Email]"));
        email.sendKeys("rcp01_t@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[id=Password]"));
        password.sendKeys("GrupSekiz_.");
        WebElement loginClk = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        loginClk.click();
        WebElement facebookBtn = driver.findElement(By.cssSelector("a[target='_blank'][href='http://www.facebook.com/nopCommerce']"));
        facebookBtn.click();

        Set<String> windowIdler = driver.getWindowHandles();

        for (String id : windowIdler) {

            if (id.equals(anaSayfaIdsi)) continue;

            driver.switchTo().window(id);
            Bekle(2);


        }
        WebElement cerez = driver.findElement(By.cssSelector("button[id^='u_0_20_']"));
        Bekle(3);
        cerez.click();
        Bekle(2);
        WebElement elementUrl = driver.findElement(By.cssSelector("i[class^='fb_logo img sp_']"));
        String url = elementUrl.getText();
        Assert.assertEquals("Facebook", url);
        driver.close();
        Bekle(3);
        driver.switchTo().window(anaSayfaIdsi);
        Bekle(2);
        WebElement contac = driver.findElement(By.linkText("Contact us"));
        contac.click();
        WebElement Enquiry = driver.findElement(By.id("Enquiry"));
        Enquiry.sendKeys("bugun projler calismadi,ama ISMET hoca pes etmedi:)");
        Bekle(4);
        WebElement submit = driver.findElement(By.name("send-email"));
        submit.click();
        WebElement textDogrulama = driver.findElement(By.cssSelector("div[class='result']"));
        String text = textDogrulama.getText();
        Assert.assertEquals("Your enquiry has been successfully sent to the store owner.", text);

        BekleVeKapat();
    }
}
