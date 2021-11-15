package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Review {
    //Create a new class : Day1Review
    //Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
    //Verify if the page URL contains youtube if not, print the right url.
    //Then Navigate to https://www.amazon.com/ 
    //Navigate back to youtube 
    //Refresh the page 
    //Navigate forward to amazon 
    //Maximize the window 
    //Then verify if page title includes “Amazon”, If not, print the correct title. 
    //Verify if the page URL is https://www.amazon.com/, if not print the correct url 
    //Quit the browser

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/lenovo/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.youtube.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAİLED");
            System.out.println("Actual : " + actualTitle);
            System.out.println("Expected : " + expectedTitle);
        }
        String url = driver.getCurrentUrl();
        if (url.contains("youtube")){
            System.out.println(" Youtubes URL is ok");
        } else{
            System.out.println(url);
        }
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();
        if (!driver.getTitle().contains("Amazon")){
            System.out.println(driver.getTitle());
        }
        if(!driver.getCurrentUrl().equals("https://www.amazon.com/")){
            System.out.println(driver.getCurrentUrl());
        }
        driver.close();
    }
}
