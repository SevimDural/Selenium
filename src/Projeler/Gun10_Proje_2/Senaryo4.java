package Gun10_Proje_2;
//Senaryo:
//1- https://www.saucedemo.com/ sitesine gidiniz.
//2- Login olunuz.
//3- Bütün ürünlerin isimlerini bir yerde tutunuz.
//4- Bütün ürünleri sepete atınız.
//5- Sepete tıklayınız.
//6- Sepetteki ürünlerle , ilk başta aldığını ürünlerin listesi
//   birebir aynı olup olmadığını kontrol ediniz.
//
//   Sadece XPath kullanınız.

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.List;

public class Senaryo4 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com");

        WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        WebElement klick=driver.findElement(By.xpath("//input[@id='login-button']"));
        klick.click();


        List<WebElement> isimlerAl=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

        List<String> depoIsim=new ArrayList<>();
        for (WebElement isim:isimlerAl)
        {
            depoIsim.add(isim.getText());
        }

        WebElement tikla=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        tikla.click();

        List<WebElement> sepettekiler =driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        List<String> shop2=new ArrayList<>();
        for (WebElement urunler : sepettekiler) {
            shop2.add(urunler.getText());
        }


        for (int i = 0; i < sepettekiler.size(); i++) {
            Assert.assertEquals("Ürünler aynı mı",isimlerAl.get(i),shop2.get(i));
        }



BekleVeKapat();






    }
}
