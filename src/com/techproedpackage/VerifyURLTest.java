package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {
    //Create a new class: VerifyURLTest
    //Navigate to google homepage
    //Verify if google homepage url is “www.google.com”
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/lenovo/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.google.com";
        if (actualURL.equals(expectedURL)){
            System.out.println("PASSED");
        } else {
            System.out.println("FAİLED");
            System.out.println("Expected : " + expectedURL);
            System.out.println("Actual : " + actualURL);
        }
        driver.close();

    }
}
