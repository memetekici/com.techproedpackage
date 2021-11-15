package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static void main(String[] args) throws InterruptedException {
        //Create a new class : GoogleSearchTest 
        //Create main method and complete the following task. 
        //When user goes to https://www.google.com/ 
        //Search for “"porcelain teapot"” 
        //And print how many related results displayed on Google 
        //And click on Shopping
        //Then verify the texts : Home, Stores, Departments
        System.setProperty("webdriver.chrome.driver","C:/Users/lenovo/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        WebElement searchBox= driver.findElement(By.xpath("//input [@maxlength = '2048']"));
       // WebElement searchButton = driver.findElement(By.xpath("(//input[@type = 'submit'])[3]"));
        //We can click on Enter using Keys.Enter command
        searchBox.sendKeys("porcelain teapot" + Keys.ENTER);
        WebElement searchResultElement= driver.findElement(By.xpath("//div [@id ='result-stats']"));
        String searchResultText = searchResultElement.getText();
        System.out.println(searchResultText);
        System.out.println(searchResultText.substring(6,16));

        //And click on Shopping

       // WebElement shopping = driver.findElement(By.linkText("Shopping"));
       // shopping.click();

        WebElement home = driver.findElement(By.linkText("Home"));
        String actualHomeText = home.getText();
        String expectedHomePage = "Home";
        if(actualHomeText.equals(expectedHomePage)){
            System.out.println("PASS");
        }else {
            System.out.println("FAİled");
        }
    }
}