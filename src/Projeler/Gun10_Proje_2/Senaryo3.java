package Gun10_Proje_2;
//Senaryo
//1- https://www.saucedemo.com/ sitesini açınız.
//2- login işlemini yapınız (login işlemi ayrı bir static metodda olsun ordan çağırınız)
//3- Açılan sayfadaki bütün ürünleri sepete ekleyiniz.
//4- Sepete tıklayınız

//5- Sepette listelenen bütün ürünleri REMOVE yapınız.

//6- Sağ üst taraftaki sepet imajındaki ürün sayısını gösteren yerin boş olduğunu
//   Assert ile kontrol ediniz.
//
//    Sadece XPath kullanınız.

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

public class Senaryo3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");

        logIn();

        //  LIST -->> coklu elemanlarda bunu kullanicaz!!!!!
//6 tane elemani   bi seferde   aldik ve ekledik
        List<WebElement> liste=driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        for (WebElement referans:liste)
        {
            referans.click();
        }
// sepete gittik
        WebElement sepet=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();

        //sepetin icindekileri tek tek sildik.
        List<WebElement> sepetSil=driver.findElements(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));

        for (WebElement sepetTemizle:sepetSil)
        {
            sepetTemizle.click();
        }


        String bos="";
        String dolu=driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
        Assert.assertEquals(bos,dolu);


//  aldigim ve sildigim listeyi karsilastirdik....  yukardaki bos dolunun aynisi....ama daha egzantrik :)

//       for (int i=0;i<sepetSil.size();i++)
//        {
//            if (sepetSil.get(i).equals(liste.get(i)))
//            {
//
//                Assert.assertNull(driver.findElement(By.xpath("//a[@class='shopping_cart_link']")));
//                System.out.println("tamamdir");
//            }
//            else
//            {System.out.println("hata olustu!!");}
//        }


        BekleVeKapat();

    }












    public static void logIn()
    {
        WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        WebElement klick=driver.findElement(By.xpath("//input[@id='login-button']"));
        klick.click();

    }

}
