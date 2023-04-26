package Lesson_2Locators_Tools_to_identify_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_3 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        // Example: Sibling to sibling and Child to parent traverse, w dev tollsach selectorschub // używamy gdy chcemy bezpośrednio iść do obiektu a / jeśli idziemy od hóry kodu czyli html
        // //header/div/button[1]/following-sibling::button[1]
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        // now child to parent
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
    }
}
