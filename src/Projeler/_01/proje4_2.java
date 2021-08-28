package Gun19proje4._01;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
/*
    TASK 2
        - Bu siteye gidiniz.  "http://demowebshop.tricentis.com/"
        - Sağ üstteki "Log in" yazısına tıklayınız.
        - "email" ve "password" girip "log in"e tıklayınız.
        - Soldaki "categories" başlığının altındaki "Computers"a tıklayınız.
        - Soldaki yerde "Computers"ın altında "Desktops"a tıklayınız.
        - "BUILD YOUR OWN EXPENSIVE COMPUTER" yazan bilgisayarın altındaki "Add to cart" buttonuna tıklayınız.
        - Processor kısmında Fast'i seçin.
        - Ram kısmından 8GB'yi seçin.
        - HDD kısmından 400 GB'yi seçin.
        - Software kısmından Other Office Suite'i seçinç
        - Add to Cart buttonuna tıklayınız.
        - En yukarıdan Shopping Cart'a tıklayınız.
        - I agree with the terms checkbox'una tıklayınız.
        - Checkout buttonuna tıklayınız.
        - Billing Address formunu doldurun.
        - Formu doldurduktan sonra Continue buttonuna tıklayınız.
        - Shipping Address penceresindeki Continue Buttonuna tıklayınız.
        - Shipping Method penceresindeki Continue Buttonuna tıklayınız.
        - Cash On Delivery'yi seçip Continue buttonuna tıklayınız.
        - Payment Information penceresindeki Continue Buttonuna tıklayınız.
        - Confirm Order penceresindeki Continue Buttonuna tıklayınız.
        - Ekranda yazan mesajı doğrulayınız.

 */
public class proje4_2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().deleteAllCookies();

        WebElement login = driver.findElement(By.cssSelector("a[class='ico-login']"));
        login.click();

        WebElement email = driver.findElement(By.cssSelector("input[id=Email]"));
        email.sendKeys("rcp01_t@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[id=Password]"));
        password.sendKeys("GrupSekiz_.");
        WebElement loginClk = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        loginClk.click();
        WebElement Computers = driver.findElement(By.cssSelector("div[class='master-wrapper-main']>div>div>div>ul>:nth-child(2)>a"));
        Computers.click();
        WebElement Desktops = driver.findElement(By.xpath("(//a[@title='Show products in category Desktops'])[1]"));
        Desktops.click();
        WebElement addCart = driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]"));
        addCart.click();
        WebElement fast = driver.findElement(By.id("product_attribute_74_5_26_82"));
        fast.click();
        WebElement ram = driver.findElement(By.id("product_attribute_74_6_27_85"));
        ram.click();
        WebElement hdd = driver.findElement(By.id("product_attribute_74_3_28_87"));
        hdd.click();
        WebElement software = driver.findElement(By.id("product_attribute_74_8_29_90"));
        software.click();

        WebElement addCart2 = driver.findElement(By.id("add-to-cart-button-74"));
        addCart2.click();


        Bekle(4);
        WebElement Shipping = driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]"));
        Shipping.click();

        WebElement checkBox = driver.findElement(By.id("termsofservice"));
        checkBox.click();

        WebElement Checkout = driver.findElement(By.id("checkout"));
        Checkout.click();
        Bekle(4);

//todo:if li kisim da calisiyor...

//        if ((!email.equals("rcp01_t@gmail.com")&&password.equals("GrupSekiz_.")))
//        {
//            WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
//            Select ulke = new Select(country);
//            ulke.selectByIndex(2);
//
//            Bekle(3);
//            WebElement countrySehir = driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
//            Select ulke1 = new Select(countrySehir);
//            ulke1.selectByIndex(3);
//            Bekle(2);
//            WebElement ctiy = driver.findElement(By.id("BillingNewAddress_City"));
//            ctiy.sendKeys("alaska");
//
//            WebElement Address1 = driver.findElement(By.id("BillingNewAddress_Address1"));
//            Address1.sendKeys("Almanaya str-4");
//
//            WebElement Address2 = driver.findElement(By.id("BillingNewAddress_Address2"));
//            Address2.sendKeys("Kanada str-6");
//            WebElement postaCode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
//            postaCode.sendKeys("345");
//            WebElement number = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
//            number.sendKeys("05323547689");
//
//            WebElement continu = driver.findElement(By.xpath("(//input[@title='Continue'])[1]"));
//            continu.click();
//            Bekle(4);
//        }


try {
    WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
    Select ulke = new Select(country);
    ulke.selectByIndex(2);

    Bekle(3);
    WebElement countrySehir = driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
    Select ulke1 = new Select(countrySehir);
    ulke1.selectByIndex(3);
    Bekle(2);
    WebElement ctiy = driver.findElement(By.id("BillingNewAddress_City"));
    ctiy.sendKeys("alaska");

    WebElement Address1 = driver.findElement(By.id("BillingNewAddress_Address1"));
    Address1.sendKeys("Almanaya str-4");

    WebElement Address2 = driver.findElement(By.id("BillingNewAddress_Address2"));
    Address2.sendKeys("Kanada str-6");
    WebElement postaCode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    postaCode.sendKeys("345");
    WebElement number = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    number.sendKeys("05323547689");

    WebElement continu = driver.findElement(By.xpath("(//input[@title='Continue'])[1]"));
    continu.click();
    Bekle(4);
}catch (Exception ex)
{
    System.out.println("Yeni kulanici bilgileri tanimlayiniz");
}
        click("css","input[class='button-1 new-address-next-step-button'][onclick='Billing.save()']");
        click("css","input[class='button-1 new-address-next-step-button'][onclick='Shipping.save()']");
        click("xpath","//input[@onclick='ShippingMethod.save()']");
        click("xpath","//input[@onclick='PaymentMethod.save()']");
        click("xpath","//input[@onclick='PaymentInfo.save()']");
        click("xpath","//input[@onclick='ConfirmOrder.save()']");

        Bekle(2);
        WebElement mesaj = driver.findElement(By.cssSelector("div[class='title']"));
        Assert.assertEquals("Your order has been successfully processed!", mesaj.getText());
        System.out.println(mesaj.getText());


        WebElement logOut=driver.findElement(By.linkText("Log out"));
        logOut.click();



        BekleVeKapat();
    }




    public static void click(String which, String locator) {
        switch (which) {
            case "id":
                WebElement webElement = driver.findElement(By.id(locator));
                webElement.click();
                break;
            case "name":
                webElement = driver.findElement(By.name(locator));
                webElement.click();
                break;
            case "css":
                webElement = driver.findElement(By.cssSelector(locator));
                webElement.click();
                break;
            case "xpath":
                webElement = driver.findElement(By.xpath(locator));
                webElement.click();
                break;
            case "classname":
                webElement = driver.findElement(By.className(locator));
                webElement.click();
                break;

        }
    }

}
