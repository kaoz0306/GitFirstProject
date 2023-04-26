package Lesson_3SeleniumWebdriver_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadanie_2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Kazik");
        driver.findElement(By.name("email")).sendKeys("kazik@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234567");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdownName = new Select(dropdown);
        dropdownName.selectByVisibleText("Male");
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.name("bday")).sendKeys("03/06/1983");
        driver.findElement(By.cssSelector(".btn.btn-success")).click();
        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

    }
}
