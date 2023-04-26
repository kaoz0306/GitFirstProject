package Lesson_2Locators_Tools_to_identify_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators_2 {

    public static void main(String[] args) throws InterruptedException {

        String name = "kazik";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")). sendKeys(password);
        driver.findElement(By.className("signInBtn")). click();
        Thread.sleep(2000);
        //tagName używany jest rzadko ponieważ tagów może być dużo
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();

    }
// Metoda na to jak codziennie zmieni się hasło
    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText =driver.findElement(By.cssSelector("form p")).getText();
        // Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArray = passwordText.split("'"); //this method split this text in 2 pieces
        // 0th index- Please use temporary password
        // 1st index - 'rahulshettyacademy' to Login.
        String password = passwordArray[1]. split("'")[0];//again we are splitting this text 'rahulshettyacademy' to Login.
        // 0th index- rahulshettyacademy and this password we need to extract
        // 1st index - to Login.
        return password;

    }
}
