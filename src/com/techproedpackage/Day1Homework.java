package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/lenovo/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        if (driver.getTitle().equals("facebook")){
            System.out.println("Facebook title : PASSET");
        }else {
            System.out.println("Facrbook title : FAİLED");
            System.out.println("Expected title : facebook");
            System.out.println("Actual title : " + driver.getTitle());
        }
        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("Facebook url : PASSED");
            System.out.println("Actual url : " + driver.getCurrentUrl());
        }else {
            System.out.println("Facebook url : FAİLED");
            System.out.println("Actual url : " + driver.getCurrentUrl());
        }
        driver.navigate().to(" https://www.walmart.com/");
        if (driver.getTitle().contains("Walmart.com")){
            System.out.println("Page Title incluede Waltmar.com");
            System.out.println("Actual title : " + driver.getTitle());
        }else{
            System.out.println("For Waltmars Title is FAİLED");
            System.out.println("Actual title : " + driver.getTitle());
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();
    }

}
