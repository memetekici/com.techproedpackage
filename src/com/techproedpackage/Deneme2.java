package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/lenovo/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement agree = driver.findElement(By.xpath("(//div[@class = 'jyfHyd'])[2]"));
        agree.click();

        WebElement googleSearch = driver.findElement(By.cssSelector("input[class]"));
        googleSearch.sendKeys("porcelain teapot" + Keys.ENTER);

        WebElement numberOfPorcelen = driver.findElement(By.id("result-stats"));

        WebElement shopping = driver.findElement(By.linkText("Shopping"));
        shopping.click();


    }
}
