package Gun10_Proje_2;
//1- https://www.saucedemo.com/ sitesini açınız.  +++++++++++++++
//2- Ekranda görünen usernamleri bir string diziye atınız.++++++++++++++++++++
//3- Bu username ve passwordlarını hepsinin login olup olamadığını
//   login olduktan sonraki sayfada Products kelimesinin kontrol ederek
//   doğrulayınız.
//   diğer login kontrolleri için navigate.back kullanınız.
//4- Login olamayan userları ve hata bilgisini yazdırınız.
// Sadece XPath kullanınız.

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

public class Senaryo2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com");

//        WebElement isimler=driver.findElement(By.xpath("//div[@class='login_credentials']"));
//        String isimlerString=isimler.getText();
//        String yeni=isimlerString.replaceAll("Accepted usernames are:","");
//        //System.out.println(yeni);

        String[] array={"standard_user","locked_out_user","problem_user","performance_glitch_user"};
        //System.out.println(Arrays.toString(array));

//        List<String> list=Arrays.asList(array);

////      ekranda elemanlari gormek iicn

////        for (Object str:list)
////        {
////            System.out.println(str);
////        }
/////////////////          PASSWORD KISMI       //////////////

////        WebElement password=driver.findElement(By.xpath("//div[@class='login_password']"));
////        String passwordAtama=password.getText();
////        //System.out.println(passwordAtama);
////        String passwordText=passwordAtama.replaceAll("Password for all users:","");
////        //System.out.println(passwordText);

        String passwordTxt="secret_sauce";

        for (String diziUserName:array)
        {

            WebElement usernameInput= driver.findElement(By.xpath("//input[@id='user-name']"));
            usernameInput.clear();
            usernameInput.sendKeys(diziUserName);


            WebElement passwordInput=driver.findElement(By.xpath("//input[@id='password']"));
            passwordInput.clear();
            passwordInput.sendKeys(passwordTxt);


            WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
            login.click();

            List<WebElement> listeProduct=driver.findElements(By.xpath("//*[text()='Products']"));


            if (listeProduct.size()==1)
            {
                System.out.println(diziUserName+" basariyla login oldu:))");
                driver.navigate().back();
            }
            else
            {
                WebElement error=driver.findElement(By.xpath("//h3[@data-test='error']"));
                System.out.println(diziUserName+"  "+error.getText());}
        }



BekleVeKapat();


    }
}
