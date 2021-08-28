package Gun18;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

///*
//   Senaryo :
//        1- https://opensource-demo.orangehrmlive.com/  sitesine gidiniz.
//        2- Login işlemini yapınız.
//        3- Welcome yazan sağ üst tarafta kullanıcı adının geçip geçmediğini kontrol ediniz.
//        4- Eğer Kullanıcı adınız gözükmüyorsa , ekran görünütüsnü kaydedip, ilgili kişiye gönderiniz.
// */
public class _02EkranKaydet extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {


            driver.get("https://opensource-demo.orangehrmlive.com/");

            WebElement username=driver.findElement(By.id("txtUsername"));
            username.sendKeys("Admin");

            WebElement password=driver.findElement(By.id("txtPassword"));
            password.sendKeys("admin123 ");

            WebElement btnLogin=driver.findElement(By.id("btnLogin"));
            btnLogin.click();

            List<WebElement> hataMesaji=driver.findElements(By.id("spanMessage"));

            if (hataMesaji.size()==0) // login olabilmiş demektir
            {
                System.out.println("Login oldum: Çünkü sayfada bu hata mesajı elementi bulunamadı.");
            }
            else
            {   // hata oluşmuş
                System.out.println("Login olamadı. Çünkü hala aynı sayfdadayım.");

                // ekran kaydını alalım.
                TakesScreenshot ts= (TakesScreenshot) driver; // 1. Aşama ekran görüntüsü alma değişkenimizi tanımladık.
                File ekranDosyası=ts.getScreenshotAs(OutputType.FILE);// 2. Aşama alınacak Ekran görüntü dosyası tipi seçilerek hafızada oluşturuldu.
                FileUtils.copyFile(ekranDosyası, new File("ekranGoruntuleri/Orange/LoginKontrol.png"));
                // hafızadaki ekranDosyasi nı al bunu verdiğim yola ve isme kaydet.
                // jpg,bmp,gif .. olabilir.
            }





            BekleVeKapat();


    }
}
