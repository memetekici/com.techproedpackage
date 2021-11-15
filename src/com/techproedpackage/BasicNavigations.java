package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //Calling the chromedriver and giving path
        System.setProperty("webdriver.chrome.driver","C:/Users/lenovo/Documents/Selenium dependencies/drivers/chromedriver.exe");
        //Crating the driver object
        WebDriver driver = new ChromeDriver();
        //Going to the google.com
        driver.get("https://www.google.com");
         Thread.sleep(3000);//Sayfaları 3 saniye tutar
        driver.navigate().to("https://www.amazon.com");//navigate get ile aynı işlemi yapıyor
        //Navigate back to google
        driver.navigate().back();
        //Navigate forwart to amazon
        driver.navigate().forward();
        //Refresh the page
        driver.navigate().refresh();
        Thread.sleep(3000);
        //Maximize window
        driver.manage().window().maximize();
        //close/Quit the browser
        // driver.close();driver.quit ile aynı.Ancak tekini yazmamız lazım.yalnizca kullandığımız driveri kapatır.
       // driver.quit();//Bütün açık olan browserları kapatır.quit daha kuvvetlidir.
    }
}
