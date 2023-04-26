package Lesson_3SeleniumWebdriver_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allert_section {

    public static void main(String[] args) {

        String text = "Kazik"; // deklaruje string do okna "Enter Your name"

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.cssSelector("[id='alertbtn']")).click(); // jak xpath to //input[@value='Alert']
        // żeby zmienić kontekst i pominać alert jest metoda z driver do switch
        // Ta metoda sprawdzi czy na całej stronie pojawił się jakiś alert
        // Możemy pobrać tekst bezpośrednio z pop-upa i wyprintować w konsoli
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        //Jak mamy Cancel button
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();// dismiss znajdzie w pop-upie nazwe nie,no,cancel itp.


    }
}
