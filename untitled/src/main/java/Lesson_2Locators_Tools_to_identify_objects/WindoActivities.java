package Lesson_2Locators_Tools_to_identify_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoActivities {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com"); // przegladarka bedzie czekać aż wszystko się załaduje. Częściej używa się tego!!!
        driver.navigate().to("https://rahulshettyacademy.com/"); // w tym przypadku bedzie kontuowane i nie bedzie czekać
        driver.navigate().back();
        driver.navigate().forward();


    }

}
