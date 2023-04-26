package Lesson_2Locators_Tools_to_identify_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        //Types:
        // ID
        //Xpath
        //CSS Selector
        //name
        //Class Name
        //Tag Name
        //Link Text
        //Partial Link Text
        WebDriver driver = new ChromeDriver();
        //implicit wait- np. 5 sec time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//waiting for object to show on page
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("kazik");
        driver.findElement(By.name("inputPassword")).sendKeys("test");
        driver.findElement(By.className("signInBtn")).click();
        //	Tagname[attribute=’value’] for css selector
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        // we have wait atleast 1 sec that window will pass to second window
        Thread.sleep(1000);//
        //	//Tagname[@attribute=’value’] for xpath
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@gmail.com");
        // if I want to clear some field .clear() and this is for xpath INDEKSOWANIE-> //input[@type='text'][2]
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        // wyszukanie unikalnego atrybutu w konsoli dla css selectora INDEKSOWANIE-> input[type="text"]:nth-child(3) ostatni krokjesli mamy dużo na stronie lub ukryte
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("kazik@gmail.com");
        // inny rodzaj wyszukiwania obiektu na stronie
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("789456123");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        // another way to find and create button //div[@class='forgot-pwd-btn-conainer']/button[1]
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("kazik");
        // identyfikacja objektu za pomocą części tekstu uzywając * input[type*='pass']
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();

    }


}
