package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class xpath_css {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/lenovo/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();
        //Locate the elements of email textbox,password textbox, and signin button
        WebElement emailTextbox = driver.findElement(By.xpath("//input[@id = 'session_email']"));
        WebElement passwordTextbox = driver.findElement(By.xpath("//input[@id = 'session_password']"));
        WebElement signingButon = driver.findElement(By.xpath("//input[@type = 'submit']"));

        //Enter below username and password then click sign in button
        //Username :  testtechproed@gmail.com 
        // Password : Test1234! 
        emailTextbox.sendKeys("testtechproed@gmail.com");
        passwordTextbox.sendKeys("Test1234!");
        signingButon.click();

        //Then verify that the expected user id  testtechproed@gmail.com
        String expectedUserId = "testtechproed@gmail.com";
        String actualUserId = driver.findElement(By.xpath("//span[@class='navbar-text']")).getText();
        if(expectedUserId.equals(actualUserId)){
            System.out.println("PASS");
        }else{
            System.out.println("actual user ıd : " + actualUserId);
            System.out.println("expected user id : " + expectedUserId);
            System.out.println("Failed");
        }
        //Sign out from the page
        WebElement signOutButton = driver.findElement(By.xpath("(//a[@class = 'nav-item nav-link'])[2]"));
        Thread.sleep(3000);
        signOutButton.click();

        //To understand if we sign out, we can find a core element like sign in button to verify

        Thread.sleep(2000);
        //I am checking if signin button element is visible after cliking sign out button
        WebElement signIn = driver.findElement(By.xpath("//input[@type = 'submit']"));
        //isDisplayed() =>> This method is used to check is the element is on the page or not.
        //If the element is on the page, this returns true
        if (signIn.isDisplayed()){
            System.out.println("PASSED:WE ARE ON SIGN IN PAGE");
        } else{
            System.out.println("FAİLED.YOU ARE NOT ON SİGN IN PAGE");
        }

        //Locating the email,password,signin element CSS locator
        WebElement emailTextCSS = driver.findElement(By.cssSelector("input[type = 'email']"));
        WebElement passwordPassCSS = driver.findElement(By.cssSelector("#session_password"));
        WebElement signInCSS = driver.findElement(By.cssSelector("input[type = 'submit']"));
        emailTextCSS.sendKeys("testtechproed@gmail.com");
        Thread.sleep(2000);
        passwordPassCSS.sendKeys("Test1234!");
        Thread.sleep(2000);
        signInCSS.click();




    }

}
