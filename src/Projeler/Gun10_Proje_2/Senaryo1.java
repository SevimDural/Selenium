package Gun10_Proje_2;
//Senaryo
//1- https://www.saucedemo.com/ sitesini açınız.
//2- Login işlemini yapınız
//3- Burada gözüken ürünlerin isimlerini yazdırınız.
// Sadece XPath kullanınız.
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Senaryo1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com");

        WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");


        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

        WebElement urunListesi=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String isimler= urunListesi.getText();
        System.out.println(isimler);


        WebElement urunListesi2=driver.findElement(By.xpath("//a[@id='item_0_title_link']"));
        String isimler2= urunListesi2.getText();
        System.out.println(isimler2);

        WebElement urunListesi3=driver.findElement(By.xpath("//a[@id='item_1_title_link']"));
        String isimler3= urunListesi3.getText();
        System.out.println(isimler3);

        WebElement urunListesi4=driver.findElement(By.xpath("//a[@id='item_2_title_link']"));
        String isimler4= urunListesi4.getText();
        System.out.println(isimler4);

        WebElement urunListesi5=driver.findElement(By.xpath("//a[@id='item_3_title_link']"));
        String isimler5= urunListesi5.getText();
        System.out.println(isimler5);

        WebElement urunListesi6=driver.findElement(By.xpath("//a[@id='item_5_title_link']"));
        String isimler6= urunListesi6.getText();
        System.out.println(isimler6);


    // todo tek seferde tum urunler nasil eklenir???????



        BekleVeKapat();








    }
}
