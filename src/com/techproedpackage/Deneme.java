package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme {
    /*
     Create a class : xpath_css
     Create main method and complete the following task. 
     user goes to http://a.testaddressbook.com/sign_in 
     Locate the elements of email textbox,password textbox, and signin button 
     Enter below username and password then click sign in button 
     Username :  testtechproed@gmail.com 
     Password : Test1234! 
     Then verify that the expected user id  testtechproed@gmail.com
     Sign out from the page
      */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/lenovo/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("testtechproed@gmail.com");

        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("Test1234!");

        WebElement signIn = driver.findElement(By.cssSelector("input[type='submit']"));
        signIn.click();

        WebElement text = driver.findElement(By.cssSelector("span[class='navbar-text']"));
        String actualText = text.getText();
        String  expectedText = "testtechproed@gmail.com";

        if(actualText.equals(expectedText)){
            System.out.println("Pass");
        }else{
            System.out.println("FAİLED");
            System.out.println("Expected : " + expectedText);
            System.out.println("Actual : " + actualText);
        }
        //driver.quit();

    }
}
