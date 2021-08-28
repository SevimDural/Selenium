package Gun19proje4;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class proje4_3 extends BaseStaticDriver {
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


        WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select ulke = new Select(country);
        ulke.selectByIndex(1);

        Bekle(3);
        WebElement countrySehir = driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
        Select ulke1 = new Select(countrySehir);
        ulke1.selectByIndex(3);

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
        WebElement continu2 = driver.findElement(By.xpath("//*[@id='billing-buttons-container']/input"));
        continu2.click();

//        BekleVeKapat();
    }
}
