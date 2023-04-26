package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Main {

    // Webdriver methods + class methods
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Firefox launch
        // geckoDriver
       // WebDriver driver = new FirefoxDriver();

        // Microsoft Edge
        // WebDriver driver = new EdgeDriver()

        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close(); // shall close the current window
        driver.quit(); // shall quit the driver method
    }
}