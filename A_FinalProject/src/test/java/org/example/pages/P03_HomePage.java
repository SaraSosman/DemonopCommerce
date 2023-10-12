package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.example.StepDefintion.Hooks.driver;

public class P03_HomePage {
    public WebElement registerTab () {

        WebElement registerTab = driver.findElement(By.className("ico-register"));
        return registerTab;
    }
    public WebElement loginTab () {
        WebElement loginTab = driver.findElement(By.className("ico-login"));
        return loginTab;
    }
     public WebElement CurrencyList () {
        WebElement CurrencyList = driver.findElement(By.id("customerCurrency"));
        return CurrencyList ;
     }

     public List<WebElement> ItemPrice () {
         List<WebElement> ItemPrice = driver.findElements(By.xpath("//span[@class =\"price actual-price\"]"));
         return ItemPrice;
     }
    // Search feature
     public WebElement searchBar (){
        WebElement searchBar = driver.findElement(By.id("small-searchterms"));
        return searchBar;
     }
     public WebElement searchButton () {
        WebElement searchButton = driver.findElement(By.className("search-box-button"));
        return searchButton;
     }

     public List<WebElement> products (){
        List<WebElement> products = driver.findElements(By.className("product-item"));
        return products;
     }


    public List<WebElement> productTitle() {
        List<WebElement> productTitle = driver.findElements(By.className("product-title"));
        return productTitle;
    }
    public WebElement photo1 (){
        WebElement photo1 =driver.findElement(By.xpath("//img[@alt=\"Picture of Science & Faith\"]"));
        return photo1;
    }
    public WebElement photo2 () {
        WebElement photo2 =driver.findElement(By.xpath("//img[@alt=\"Picture of Apple iCam\"]"));
        return photo2;
    }
    public WebElement photo3 (){
        WebElement photo3 =driver.findElement(By.xpath("//img[@alt=\"Picture of Sound Forge Pro 11 (recurring)\"]"));
        return photo3;
    }
    public WebElement sku1 (){
        WebElement sku1 =driver.findElement(By.id("sku-36"));
        return sku1;
    }
    public WebElement sku2 (){
        WebElement sku2 =driver.findElement(By.id("sku-17"));
        return sku2;
    }
    public WebElement sku3 (){
        WebElement sku3 =driver.findElement(By.id("sku-12"));
        return sku3;
    }
    //Hover Categories
    public WebElement hoverComputer () {
        WebElement hoverComputer = driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
        return hoverComputer ;
    }
    public WebElement hoverDesktop (){
        WebElement hoverDesktop =driver.findElement(By.cssSelector("a[href=\"/desktops\"]"));
        return hoverDesktop;
    }
    public WebElement headerDesktop (){
        WebElement headerDesktop =driver.findElement(By.cssSelector("div[class=\"page-title\"] h1"));
        return headerDesktop;
    }
   //Sliders
    public WebElement slider1 (){
        WebElement slider1 = driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[1]"));
        return  slider1;
    }
    public WebElement slider2 (){
        WebElement slider2 = driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));
        return slider2 ;
    }
    //FollowUs
    public WebElement facebookIcon () {
        WebElement facebookIcon = driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
        return facebookIcon;
    }
    public WebElement twitterIcon () {
        WebElement twitterIcon = driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
        return twitterIcon;
    }
    public WebElement rssIcon () {
        WebElement rssIcon = driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a"));
        return rssIcon;
    }

    public WebElement youtubeIcon () {
        WebElement youtubeIcon = driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
        return youtubeIcon;
    }
    //WishList

    public WebElement Product (){
        WebElement Product = driver.findElement(By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]"));
        return Product;
    }

    public WebElement WishList () {    //cssSelector with 2 attribute
        WebElement WishList = driver.findElement(By.cssSelector("div[data-productid=\"18\"] button[class='button-2 add-to-wishlist-button']"));
        return WishList;
    }

    public WebElement SuccessMSg (){
        WebElement SuccessMsg = driver.findElement(By.cssSelector("div[id='bar-notification'] div[class='bar-notification success']"));
        return SuccessMsg;
    }

    public WebElement WishListTab (){
        WebElement WishListTab =driver.findElement(By.className("wishlist-label"));
        return WishListTab;
    }



}
