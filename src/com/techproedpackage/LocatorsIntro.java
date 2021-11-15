package com.techproedpackage;
//Create a class : LocatorsIntro
//Create main method and complete the following task.
//user goes to http://a.testaddressbook.com/sign_in
//Locate the elements of email textbox,password textbox, and signin button
//Enter below username and password then click sign in button
//Username :  testtechproed@gmail.com 
//Password : Test1234! 
//Then verify that the expected user id  testtechproed@gmail.com 
//Verify the Addresses and Sign Out  texts are displayed  
//Find the number of total link on the page 
//Sign out from the page

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsIntro {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/lenovo/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        //Locate the elements of email textbox,password textbox, and signin button
        //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        WebElement emailTextbox = driver.findElement(By.id("session_email"));//Sonuc seleniumdan geleceği için Webelementi yazdık.

        //<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));

        //<input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">
        WebElement signinButton = driver.findElement(By.name("commit"));

        //Enter below username and password then click sign in button
        //Username :  testtechproed@gmail.com
        //Password : Test1234!

        //Sending username in the email text box
        Thread.sleep(1000);
        emailTextbox.sendKeys("testtechproed@gmail.com");

        //Sending password in the password text box
        Thread.sleep(1000);
        passwordTextBox.sendKeys("Test1234!");

        //Click on sign button
        Thread.sleep(1000);
        signinButton.click();

        //Then verify that the expected user id  testtechproed@gmail.com
        String expectedUserId = "testtechproed@gmail.com";
        WebElement actualUserID = driver.findElement(By.className("navbar-text"));
        String actualUserIdText = actualUserID.getText();//web elementin adresini veriyor
        System.out.println(actualUserIdText);//testtechproed@gmail.com
        if(actualUserID.equals(expectedUserId)){
            System.out.println("PASS");
        } else{
            System.out.println("FAILS");
            System.out.println("ACTUAL ID: " + actualUserIdText);
            System.out.println("expected ID: "+ actualUserIdText);
        }
       // Verify the Addresses and Sign Out  texts are displayed  
        String expectedAddress = "Addresses";
        //LOcating the actual address
        String actualAddressesText = driver.findElement(By.linkText("Addresses")).getText();
        System.out.println(actualAddressesText);


        //Locating the sign out element
        //<a class="nav-item nav-link" data-test="sign-out" rel="nofollow" data-method="delete" href="/sign_out">Sign out</a>
        //When we use linkText or partialLİNKText, we pass the TEXT ,not VALUE
        String expectedSignout = "Sign Out";
       // String actualSignOutText = driver.findElement(By.linkText("Sign out")).getText();
        String actualSignOutText = driver.findElement(By.partialLinkText("ign ou")).getText();
        System.out.println(actualAddressesText);

        if(actualSignOutText.equals(expectedSignout)){
            System.out.println("PASS");
        } else {
            System.out.println("FAILS");
            System.out.println("Actual sign out text : " + actualSignOutText);
            System.out.println("Expected sign out Text : " + expectedSignout);
        }
        //We found a bag:actual is Sign out, but expected is Sign Out
        //Şİmdi bizim screenshat alıp bunu developer a report etmemiz lazım.

        //Find the number of total link on the page
        // a tag crates link on a page.WE need to find how many a tag on the page.
        //To find how many a TAG on the page we can use tagName("a"); locator

        List<WebElement> numberOfLink = driver.findElements(By.tagName("a"));//findElement e s ekledik.Çünkü multiple element bekliyoruz.
        int countOfLink = numberOfLink.size();
        System.out.println("Number of Link : " + countOfLink);

        for (WebElement w : numberOfLink){
            System.out.println(w.getText());
        }

        ////Sign out from the page
        WebElement signOutButton = driver.findElement(By.linkText("Sign out"));
        Thread.sleep(1000);
        signOutButton.click();
        driver.close();





    }
}
